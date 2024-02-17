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