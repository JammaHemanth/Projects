"""
a = int(input("Enter a 1st Number: "))
b = int(input("Enter a 2nd Number: "))
c = a + b
print(c)
"""
a = 1+2j
print(a)
print(type(a))
print("_______________________________________________________________________")

a = 1+2+3+4\
    +5+6
print("The sum of 1+2+3+4\ +5+6",a)
print("_______________________________________________________________________")

a = (1+2+3+4
    +5+6)
print("1+2+3+4+5+6",a)
print(type(a))
print("This is the index Type: ",id(a))

print("_______________________________________________________________________")

#list it is mutable and can change the value and alter the value
t = [1,1.5,"ML"] 
t[1]=2.5
print("This is the value of list: ",t)

print("_______________________________________________________________________")

#Tuple it is immutable and it can't change the value 
t = (1,1.5,"ML")
#t(1)=1
print("This is value of Tuple: ",t)
print("_______________________________________________________________________")

#Dictionary
d = {'a': "Apple", 'b': "Bat"}
print(d['a'])
print("_______________________________________________________________________")
