#Arthematic Operator
print("Arthematic Operator are +,-,*,/,%,//,**")
a,b=10, 15
print("The Addition of Numbers is: ",a+b)
print("The Subtraction of Numbers is: ",a-b)
print("The Multiplication of Numbers is: ",a*b)
print("The Divison of Numbers is: ",a/b)
print("The Module of Numbers is: ",a%b) #Reminder of the two number
print("The Floor divison of Numbers is: ",a//b) #Round the num less than the Output number
print("The Exponent of 2**3 Number is: ",2**3)
print()

#Comparison Operator
print("Comparison Operator are >,>=,<,<=,!=,==")
a,b = 10,20
print("The Value of a is {} greater than b is {} : ".format(a,b), a>b)
print("The Value of a is {} greater than or equal to b is {} : ".format(a,b), a>=b)
print("The Value of a is {} Less than b is {}: ".format(a,b), a<b)
print("The Value of a is {} Less than or Equal to b is {} : ".format(a,b), a>=b)
print("The Value of a is {} not equal to b is {}: ".format(a,b), a!=b)
print("The Value of a is {} equal to b is {}: ".format(a,b), a==b)
print()

print("Logical Operators are and, or, not")
a,b= True, False
print(a and b) #If its both True then it will be true
print(a or b) #If its both False then it will be False
print(not b)
print()

#Assignment Operator
print("Assignment Operator are +=,-=,*=,/=,%=,//=,**=,&=,|=, ^=, >>=,<<=")
a = 19
a += 8
print(a)
a -= 8
print(a)
a *= 8
print(a)
a /= 8
print(a)
a %= 8
print(a)
a //= 8
print(a)
a **= 8
print(a)
print()

#Special Operator
print("Special Operator is and is not")
a = 5
b = 5
print("a {} is b {}".format(a,b),a is b)
print("a {} is not b {}".format(a,b),a is not b)
print()
a = [1,2,3]
b = [1,2,3]
print("a {} is b {}".format(a,b),a is b)
print("a {} is not b {}".format(a,b),a is not b)
print()

print("Membership Operator in and not in")
lst = [1,2,3,4]
print(1 in lst)
d = {1: "a", 2: "b" } #1 is keyvalue and a is value
print(1 in d)