
mystr2 = "  Hello Everyone  "
print(mystr2)
print(mystr2.strip()) # Removes white space from begining & end
print(mystr2.rstrip())# Removes all whitespaces at the end of the string
print(mystr2.lstrip())# Removes all whitespaces at the begining of the string

mystr = "**************Hello Everyone****************All the best**************************"
print(mystr)
print(mystr.strip('*'))
#output: Hello Everyone****************All the best

print(mystr.rstrip('*'))
#output: *************Hello Everyone****************All the best

print(mystr.lstrip('*'))
#output: Hello Everyone****************All the best**************************

print(mystr2.lower()) # Return whole string in lowercase
#output: hello everyone  

print(mystr2.upper()) # Return whole string in uppercase
#output: HELLO EVERYONE  

print(mystr2.replace("He" , "Ho")) #Replace substring "He" with "Ho" 
#output:   Hollo Everyone  

print(mystr2.replace(" " , "")) # Remove all whitespaces using replace function
#output: HelloEveryone

mystr5 = "one two three one two two three"
print(mystr5.count("one")) # Number of times substring "one" occurred in string.
#output: 2

print(mystr5.count("two")) # Number of times substring "two" occurred in string.
#output: 3

print(mystr5.startswith("one")) # Return boolean value True if string starts with "one"
#output: True

print(mystr5.endswith("three")) # Return boolean value True if string ends with "three"
#output: True


mystr4 = "one two three four one two two three five five six seven six seven one"
mylist = mystr4.split()
print(mylist)# Split String into substrings
#output: ['one', 'two', 'three', 'four', 'one', 'two', 'two', 'three', 'five', 'five', 'six', 'seven', 'six', 'seven', 'one']

# Combining string & numbers using format method
item1 = 40
item2 = 55
item3 = 77
res = "Cost of item1 , item2 and item3 are {} , {} and {}"
print(res.format(item1,item2,item3))
#output: Cost of item1 , item2 and item3 are 40 , 55 and 77

# Combining string & numbers using format method
item1 = 40
item2 = 55
item3 = 77
res = "Cost of item3 , item2 and item1 are {2} , {1} and {0}"
print(res.format(item1,item2,item3))
#output: Cost of item3 , item2 and item1 are 77 , 55 and 40

str2 = " WELCOME EVERYONE "
str2 = str2.center(100) # center align the string using a specific character as t
print(str2)
#output:                                          WELCOME EVERYONE

str2 = " WELCOME EVERYONE "
str2 = str2.center(100,'*') # center align the string using a specific character
print(str2)
#output: ***************************************** WELCOME EVERYONE *****************************************

str2 = " WELCOME EVERYONE "
str2 = str2.rjust(50) # Right align the string using a specific character as the
print(str2)
#output:                                 WELCOME EVERYONE

str2 = " WELCOME EVERYONE "
str2 = str2.rjust(50,'*') # Right align the string using a specific character ('*
print(str2)
#output: ******************************** WELCOME EVERYONE

str1 = " Welcome "
str2 = " Everyone "
print("Concatenate string: ",str1 + str2)
print("Repeating string n times: ",str1 * 3)
#Output: Concatenate string:  Welcome  Everyone
        #Repeating string n times:  Welcome  Welcome  Welcome

str4 = "one two three four five six seven"
loc = str4.find("five") # Find the location of word 'five' in the string "str4"
print(loc)
#output: 19

str4 = "one two three four five six seven"
loc = str4.index("five") # Find the location of word 'five' in the string "str4"
print(loc)
#output: 19

mystr6 = '123456789'
print(mystr6.isalpha()) # returns True if all the characters in the text are lett
print(mystr6.isalnum()) # returns True if a string contains only letters or numb
print(mystr6.isdecimal()) # returns True if all the characters are decimals (0-9)
print(mystr6.isnumeric()) # returns True if all the characters are numeric (0-9)
"""output: False
           True
           True
           True
"""

mystr6 = 'abc12309'
print(mystr6.isalpha()) # returns True if all the characters in the text are lett
print(mystr6.isalnum()) # returns True if a string contains only letters or numb
print(mystr6.isdecimal()) # returns True if all the characters are decimals (0-9)
print(mystr6.isnumeric()) # returns True if all the characters are numeric (0-9)
"""output: False
           True
           False
           False
"""

mystr7 = 'ABCDEF'
print(mystr7.isupper()) # Returns True if all the characters are in upper case
print(mystr7.islower()) # Returns True if all the characters are in lower case
"""output: True
           False
"""

mystr8 = 'abcdef'
print(mystr8.isupper()) # Returns True if all the characters are in upper case
print(mystr8.islower()) # Returns True if all the characters are in lower case
"""output: False
           True
"""

str6 = "one two three four one two two three five five six one ten eight ten nine"
loc = str6.rfind("one") # last occurrence of word 'one' in string "str6"
print(loc)
#output: 51

loc = str6.rindex("one") # last occurrence of word 'one' in string "str6"
print(loc)
#output: 51


txt = " abc def ghi "
print(txt.rstrip())
#output: ' abc def ghi'

txt = " abc def ghi "
print(txt.lstrip())
#output: 'abc def ghi '

txt = " abc def ghi "
print(txt.strip())
#output: 'abc def ghi'

print("--------------------------------------------------------------Using Escape character--------------------------------------------------------------")
#Using escape character to allow illegal characters
mystr = "My favourite series is \"Game of Thrones\""
print(mystr)
#output: My favourite series is "Game of Thrones"

#Reverse string with slicing
str = "Hello World!"
rev = str[::-1]
print(rev)
#output: !dlroW olleH

#Reverse string with loop
str = "Hello World!"
rev = ""
for char in str:
                    rev = char + rev
print(rev)                    
#output: !dlroW olleH

#Reverse string with reversed()
str = "Hello World!"
rev = "".join(reversed(str))
print(rev)
#output: !dlroW olleH

#Reverse string with functools module
from functools import reduce
str = "Hello World!"
rev = reduce(lambda x,y: y + x,str)
print(rev)
#output: !dlroW olleH

#Reverse string with join with reversed()
str = "Hello World!"
rev = "".join([char for char in reversed(str)])
print(rev)
#output: !dlroW olleH

#iterating string
count = 0
for l in "hello world":
        if l == 'o':
                count+=1
print(count, "letters found")
#Output: 2 letters found

#String Membership
print( 'l' in 'Hello world') #in operater to test membership
#output: True

print( 'or' in 'Hello world')
#output: True

print("Convert to lower case: ","Hello world".lower())
#output: Convert to lower case:  hello world

print("Convert to upper case: ","Hello world".upper())
#output: Convert to upper case:  HELLO WORLD

print("Splits the words: ","This is will split the words in a list".split())
#output: plits the words:  ['This', 'is', 'will', 'split', 'the', 'words', 'in', 'a', 'list']

print("joins the words: ",'-'.join(["This", "is", "will", "split", "the, words" "in a list"]))
#output: joins the words:  This-is-will-split-the, wordsin a list

print("index position of 'or' in 'hello world': ","Hello world".find('or'))
#output: index position of 'or' in 'hello world': 7

print("Replaces the word 'Hello' into 'Hi': ","Hello world".replace('Hello', 'Hi'))
#output: Replaces the word 'Hello' into 'Hi': Hi world


#Pallindrone program to check whether the string is pallindrone or not

mystr = "MADAM"
mystr = mystr.lower()
rstr = reversed(mystr)

if list(mystr) == list(rstr):
        print(mystr,": It is a pallindrone string")
else:
        print(mystr,": It is not pallindrone string")        
#output: madam : It is a pallindrone string        