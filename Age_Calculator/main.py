year = int(input("Enter the year: "))
month = int(input("Enter the month: "))
day = int(input("Enter the day: "))
def agecalculator(year,month,day):
                    import datetime
                    today = datetime.datetime.now().date()
                    dob = datetime.date(year,month,day)
                    age = int((today-dob).days / 365.25)
                    print("Present age: ",age)

agecalculator(year,month,day)

"""
Output: Enter the year: 1999
        Enter the month: 5
        Enter the day: 20
        Present age: 24

"""