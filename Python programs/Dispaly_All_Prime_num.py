a = int(input("Enter the starting range: "))
b = int(input("Enter the Ending range: "))
print("Prime Numbers Between", a, "and", b, "are: ")
for num in range(a , b+1):
                    if num>1:
                            for i in range(2,num):
                                    if(num % i) == 0:
                                            break
                            else:
                                    print(num)        
