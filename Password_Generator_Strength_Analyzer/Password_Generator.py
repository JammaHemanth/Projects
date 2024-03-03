import random

print("Welcome to the Password Generator")

chars = 'abcdefghijklmnopqrstuvwxyzABCDEFGHOJKLMNOPQRSTUVWXYZ!@#$%^&*?123456789'
number = input("Amount of passwords to generate: ")
number = int(number)

length = input("Input your password strength: ")
length = int(length)
print('\n Here are your passwords: ')
for pwd in range(number):
                    passwords = ''
                    for c in range(length):
                            passwords += random.choice(chars)
                    print(f'{length} no. of character password :' ,passwords)        
"""
Output:

Welcome to the Password Generator
Amount of passwords to generate: 5
Input your password strength: 9

 Here are your passwords: 
9 no. of character password : UZ4S$mfTi
9 no. of character password : SoOsvH4QA
9 no. of character password : a*OJpvLvz
9 no. of character password : evyFscR9$
9 no. of character password : m9OyHcE@L

"""                    