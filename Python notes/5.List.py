emptylist = []
lst = ['one','two','three','four'] #List of Strings
lst1 = [1,2,3,4] #List of Integers
lst2 = [[1,2],[3,4]] #List of lists
lst3 = [1, 'ram', 24, 1.24] #List of different data types

#List length
print("Length of list: ",len(lst)) #Finds Length of list

#List Append
lst = ['one','two','three','four']
lst.append('five') #append will add the items in the end
print("Append: ",lst)

#List Insert
#syntax: lst.insert(x,y)
lst = ['one','two','three','four'] #will add element y at location x
lst.insert(2,'three')
print("Insert: ",lst)

#List Remove
#syntax: lst.remove(x)
lst = ['one','two','three','four','two']
lst.remove('two')
print("Remove: ",lst)

#List Append & Extend
lst = ['one','two','three','four']
lst2 = ['five','six']
lst.append(lst2) #append
print("Append List: ",lst)

lst = ['one','two','three','four']
lst2 = ['five','six']
lst.extend(lst2) #extend will join the list with lst1
print("Extend: ",lst)

#List Delete
#del to remove item based on index position
lst = ['one','two','three','four']
del lst[1]
print("Del item: ",lst)

# Or we can use pop method
a = lst.pop(1)
print("Pop List: ",a)
print("After Pop and del list:",lst)

#List Remove
lst = ['one','two','three','four']
lst.remove('three')
print("Remove: ",lst)

#List realted keywords in python
lst = ['one','two','three','four']
#keyword 'in' is used to test if an item in a list 
if 'two' in lst:
                    print("AI")

#Keyword 'not' can combine with 'in'
if 'six' not in lst:
        print("ML")                    

lst = ['one','two','three','four']
lst.reverse()
print("Reverse List: ",lst)

#List Sorting
numbers = [3,5,4,1,2]
sorted_list = sorted(numbers)
print("Sorted_list: ",sorted_list)
print("Original_List: ",numbers)#Original List will remain unchanege

#Reverse the sorted order
numbers = [3,5,4,1,2]
sorted_list = sorted(numbers, reverse=True)
print("Sorted_list: ",sorted_list)

#Sorts list itself
lst = [9,3,0.5,6,7.5]
lst.sort()
print("Sort: ",lst)

#List having multiple references
lst=[1,2,3,4,5]
abc = lst
abc.append(6)
print(abc)

#String split to create List
s = 'one,two,three,four,five'
s1 = 'This is applied for AI Course'
slst = s.split(',')
slst1 = s1.split() #Default split is white-character: space or tab
print("Split lst s",slst,'\n',"Split lst s1",slst1)

#List indexing
lst = [1,2,3,4,5]
print("Print start element using positive index: ",lst[1])
print("Print Last element using negative index: ",lst[-1])

#List Slicing
#Synatx: [start:end:step_size]
numbers = [10,20,30,40,50,60,70]
print("Printing all numbers: ",numbers[:])
print("Printing numbers from index 0 to 4: ",numbers[0:4])
print("Printing alternate numbers: ",numbers[::2])
print("Printing numbers start from index 2 and alternate numbers: ",numbers[2::2])

#List extend using '+'
lst = [1,2,3,4,5]
lst1 = ['Ram','Jai','Pavan','Varun','Sravan']
new_list = lst + lst1
print("Adding two lists: ",new_list)

#List count
numbers = [1,3,5,1,7,3,5,3,5,9,3,1]
print("Numbers count: ",numbers)
print("Repetation of number 1:",numbers.count(1))
print("Repetation of number 3:",numbers.count(3))

#List looping
lst1 = ['Ram','Jai','Pavan','Varun','Sravan']
for ele in lst1:
        print("List lopping: ",ele)

#List Comprehension
#without using list Comprehension        
squares = []
for i in range(10):
        squares.append(i**2)
print(squares)        

#using list Comprehension  
squares = [i**2 for i in range(10)]
print("Square root of numbers",squares)

lst = [-10,-20,10,20,50]
new_list =  [i*2 for i in lst]
print('Print numbers with a multiple 2: ',new_list)

lst = [-10,-20,10,20,50]
new_list =  [i*2 for i in lst if i >= 0]
print("Print numbers greater than 0: ",new_list)

new_list =  [[i,i**2] for i in range(1,10)]
print('Print 1 to 10 number and their square root: ',new_list)

#Nested list comprehension
#Let's supppose we have a matrix
matrix = [
        [1,2,3,4],
        [5,6,7,8],
        [9,10,11,12]
]
transposed = []
for i in range(4):
        lst = []
        for row in matrix:
                lst.append(row[i])
        transposed.append(lst)        
print("Transposed Matrix: ",transposed)        

#or

transposed = [[row[i] for row in matrix] for i in range(4)]
print("Transposed Matrix: ",transposed)



lst1 = ['Ram','Jai','Pavan','Varun','Sravan']
for i in lst1:
        print(i)

lst1 = ['Ram','Jai','Pavan','Varun','Sravan']
for i in enumerate(lst1):
        print(i)

mylist = [i for i in range(200) if i % 3 == 0 if i % 9 == 0 if i % 12 == 0]
print(mylist)