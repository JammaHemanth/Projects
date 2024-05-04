num = int(input("Enter a number: "))
fact = 1
if num < 0:
                    print("Factorial does not exist for negative numbers")
elif num == 0:
        print("Factorial of 0 is 1")
else:
        for i in range(1, num+1):
                fact = fact * i
        print(f"The Factorial of {num} of number is {fact}")     


"""

Output:
Enter a number: 4
The Factorial of 4 of number is 24

"""           