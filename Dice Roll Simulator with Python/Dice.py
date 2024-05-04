import random
min = 1
max = 6
#to loop the rolling through user input
roll_again = "yes"
#loop
while roll_again == "yes" or roll_again == "y":
                    print("Rolling dice....")
                    print("The values are: ")
                    #generating and printing 1st random integer from 1 to 6
                    print(random.randint(min,max))
                    #generating and printing 2nd random integer from 1 to 6
                    print(random.randint(min,max))
                    #asking user to roll the dice again. Any input other than yes or y will terminate the loop
                    roll_again = input("Roll the dice again? ")