voter_age = 18
print("Welcome Come For the Voting Station")
age = int(input("Enter your age: "))
if age < voter_age:
                    print("Sorry, You are not eligible for voting")
else:
        print("You are eligible Voting")
print("_______________Choose your opinion_______________")
print("1.TDP")
print("2.YSRCP")
print("3.JSP")
print("4.BRS")
print("5.BJP")
print("6.Congress")
vote = int(input("Enter your option: "))
if vote == 1:
        print("You are voted for TDP")
elif vote == 2:
         print("You are voted for YSRCP")
elif vote == 3:
        print("You are voted for JSP")
elif vote == 4:
        print("You are voted for BRS")
elif vote == 5:
        print("You are voted for BJP")
elif vote == 6:
        print("You are voted for Congress")
else:
        print("_______________Invalid Option_______________")
print("Tnanks, for voting") 
