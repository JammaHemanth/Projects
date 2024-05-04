import numpy as np
print("Using arrange function print 1 to 10 : ",np.arange(10))
print()
print("Using arrange function print 1 to 10 with step value 2: ",np.arange(1,10,2))
print()
print("Using linespace function: ",np.linspace(0,1,6))
print("It will be in a matrix format")
print("---------Matrix--------")
print("Using one function 3x3 matrix 1 in a diagonal format \n",np.ones((3,3)))
print()
print("Using zero function 3x3 matrix 0 in a diagonal format \n",np.zeros((3,3)))
print()
print("Using eye function for 3x3 matrix: \n",np.eye(3))
print()
print("Using eye function for 3x2 matrix: \n",np.eye(3, 2))
print()
print("Using diagonal function for 3x3 matrix: \n",np.diag([1 ,2, 3, 4]))
print()
print("Create array from random sample: ",np.random.rand(4))
print()
print("Create array from Standard random sample: ",np.random.randn(4))
print()

print("------------------Basic Data Types------------------")
a = np.arange(10)
print("Data Type of ", a , "is:" ,a.dtype)

a = np.arange(10, dtype='float64')
print("With specified data type ", a , "is:" ,a)

print("The default data type is float for zeros and one function")
a = np.zeros((3,3))
print("Diagonal zeros: \n",a)
print("Data Type of", a ,"is:" ,a.dtype)

d = np.array([1+2j,2+4j])
print("Data type of ", d ,"is:",d.dtype)

d = np.array([True, False, True, False])
print("Data type of ", d ,"is:",d.dtype)

d = np.array(['Ram', 'Sita', 'Laxman'])
print("Data type of ", d ,"is:",d.dtype)

print("Indexing")

a = np.arange(10)
print("Index value of 5 in", a ,"is: ", a[5])

a = np.diag([1,2,3])
print("Value of 2 row 2 column in \n",a,"\n Value is :",a[2,2])

a[2,1] = 9
print("Value of 2 row 1 column in \n",a,"\n Value is :",9)

print("Slicing")
a = [0,1,2,3,4,5,6,7,8,9]
print(np.arange(10))
print(a[1:8:2])

a = np.arange(10)
a[5:] = 10
print(a)

a = [0,1,2,3,4,5,6,7,8,9]
b = np.arange(10)
a[5:] = b[::-1]
print(a)


print("copies and views")
a = np.arange(10)
print(a)

b = a[::2]
print(b)
print()

print(np.shares_memory(a,b))
print()

b[0] = 10
print(b)
print(a)
print()

a = np.arange(10)
c = a[::2].copy() # force copy
print(c)
print()

print("Is ", a ,"and", c , "shares equal memory: ",np.shares_memory(a,c),"\n")

print("Fancy Indexing")
a = np.random.randint(0,20,15)
print(a,"\n")
mask = a % 2 == 0
print("Value of a",a,"satisfies a % 2 == 0 : \n",mask,"\n")

extract_from_a = a[mask]
print(extract_from_a,"\n")

a[mask] = -1
print(a)

c = np.diag([1,2,3,4])
print("Matrix multiplication: \n",c * c,"\n")

a = np.array([1,2,3,4])
b = np.array([5,2,3,2])
print(a == b,"\n")
print(a,b ,a > b,"\n")


a = np.array([1,2,3,4])
b = np.array([5,2,3,1])
c = np.array([1,2,3,4])
print(np.array_equal(a,b),"\n")
print(np.array_equal(a,c),"\n")

print("Logical Operations")

a = np.array([1,1,0,0], dtype=bool)
b = np.array([1,0,1,0], dtype=bool)
print("Logical form of 'or' in", a , "and", b , "is: " ,np.logical_or(a,b),"\n")
print("Logical form of 'or' in", a , "and", b , "is: " ,np.logical_and(a,b),"\n")

print("Transcendental function")
a = np.arange(5)
print("Sin function of", a , "is :" ,np.sin(a),"\n")
print("Log function of", a , "is :" ,np.log(a),"\n")
print("Exponential function of",a , "is :" ,np.exp(a),"\n")

print("Basic reduction")
x = np.array([1,2,3,4])
print("sum of", x , "is: " ,np.sum(x),"\n")

x =np.array([[1,1], [2,2]])
print(x,"\n")
print(x.sum(axis=0)) #Sum by column
print(x.sum(axis=1)) #Sum by rows

print("Other reductions")
x = np.array([1,3,2])
print("Min value of", x , "is: ",x.min())
print("Max value of", x , "is: ",x.max())
print("Mean value of", x , "is: ",x.mean())
print("Min value of", x , "in index is: ",x.argmin())
print("Max value of", x , "in index is: ",x.argmax())
print("Sort values using", x , "in index is: ",x.argsort(),"\n")

print("Logical Operations")
print(np.all([True,True,False])) #If it has any one false it will be false it's acts like and operator
print(np.all([False,False,True])) #If it has any one true it will be true it's acts like or operator

#can be used for array comparisons
a = np.zeros((50,50)) 
print(np.any(a!= 0))
print(np.all(a==a))


a = np.array([1,2,3,2])
b = np.array([2,2,3,2])
c = np.array([6,4,4,5])
print("Logical operator of",a,b,c,"is: ",(a<=b & (b<=c)).all(),"\n")

print("Statistics")
x = np.array([1,2,3,1])
y = np.array([[1,2,3],[5,6,1]])
print("Mean of",x, "is: " ,x.mean())
print("Median of",x, "is: " ,np.median(x))
print("Median of",x, "is: " ,np.median(y, axis= -1))
print("Standard deviation of",x, "is: " ,x.std())

