import random
import string

def crack_Password(password):
                    attempt = 0
                    while True:
                            guess = "".join(random.choices(string.ascii_letters + string.digits, k =len(password)))
                            attempt += 1
                            if guess == password:
                                    return attempt
password = input("Enter the password to crack: ")
print("Cracking Password......")   
attempt = crack_Password(password)
print(f"The password was cracked in {attempt} attempts.")                         