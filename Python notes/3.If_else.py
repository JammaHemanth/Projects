#If
num = 10
if num > 10:
                    print("Statement Passed")
print("Statement is not Passed")         
print()

#If_else
num = -1
if num >= 0:
        print("Number is positive")
else:
        print("Number is Negative")        
print()

#If_elif_else
num = 10.5
if num > 0:
        print("Positive Number")
elif num == 0:
        print("Zero")
else:
        print("Negative number")
print()        

#Nested If
num = 10.20
if num >= 0:
        if num == 0:
                print("It's Zero")
        else :
                print("It's Positive number") 
else:
        print("It's Negative Number")       
print()                       

#example
num1,num2,num3 = 10,12,15
if (num1 >= num2) and (num1 >= num3):
        largest = num1
elif (num1 >= num2) and (num1 >= num3):
        largest = num2
else:
        largest = num3
print("Largest among Three numbers is : {}".format(largest))                        