import sys
import cv2
import numpy as np
import pyzbar.pyzbar as pyzbar
import time
import base64

#Start web cam
cap = cv2.VideoCapture(0)
names = []

#Function for attendance file
fob = open('attendance.txt','a+')
def enterdata(z):
                    if z in names:
                            pass
                    else:
                            names.append(z)
                            z=''.join(str(z))
                            fob.write(z+'\n')
                            return names
                    
print("Reading Code..........")   

#function data present or not

def checkdata(data):
        data = str(data)
        if data in names:
                print("Already Present")
                pass
        else:
                print('\n'+str(len((names))+1)+'\n'+'Present Done')
                enterdata(data) 
                pass       

while True:
        _,frame = cap.read()
        decodeObject =pyzbar.decode(frame)
        for obj in decodeObject:
                checkdata(obj.data)
                time.sleep(1)

        cv2.imshow('Frame',frame)

        

#closing the progarm when s is  pressed
        if cv2.waitKey(1)&0xFF==ord('s'):
                cv2.destroyAllWindows()
                break
 
fob.close()

