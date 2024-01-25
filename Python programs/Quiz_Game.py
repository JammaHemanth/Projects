print("Welcome to my computer quiz!")

playing = input("Do you want to play? ")
if playing.lower() != "yes":
    print("Okay, maybe next time!")
    quit()

print("Okay, let's play!")

score = 0
total_questions = 4  # Update this as you add more questions

# Question 1
answer = input("What does CPU stand for? ")
if answer.lower() == "central processing unit":
    print("Correct!")
    score += 1
else:
    print("Incorrect")

# Question 2
answer = input("What does GPU stand for? ")
if answer.lower() == "graphics processing unit":
    print("Correct!")
    score += 1
else:
    print("Incorrect")

# Question 3
answer = input("What does RAM stand for? ")  # Corrected "Ram" to "RAM"
if answer.lower() == "random access memory":  # Corrected "read access Memory"
    print("Correct!")
    score += 1
else:
    print("Incorrect")

# Question 4
answer = input("What does ROM stand for? ")
if answer.lower() == "read only memory":
    print("Correct!")
    score += 1
else:
    print("Incorrect")

print("You got", score, "questions correct out of", total_questions)
print("You got", str(round(score / total_questions * 100, 2)) + "%.")  # Rounded to 2 decimal places
