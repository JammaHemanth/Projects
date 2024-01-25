'''
rows = 5
for i in range(1,rows+1):
                    for j in range(1, i+1):
                            print(j, end='')
                
'''

def print_holiday_list(holidays):
	for holiday in holidays:
		occasion, date, day = holiday
		print(f"{date}", " - ", f"{day}", " - ", f"{occasion}")

# List of holidays with Occasion, Date, and Day
holidays_list = [
	("Republic Day", "January 26", "Friday"),
	("Holi", "March 25", "Monday"),
	("Good Friday", "March 29", "Friday"),
	("Id-ul-Fitr", "April 11", "Thursday"),
	("Ram Navmi", "April 17", "Wednesday"),
	("Mahavir Jayanti", "April 21", "Sunday"),
	("Buddha Purnima", "May 23", "Thursday"),
	("Id-ul-Zuha (Bakrid)", "June 17", "Monday"),
	("Muharram", "July 17", "Wednesday"),
	("Independence Day / Parsi New Year’s Day / Nauraj", "August 15", "Thursday"),
	("Janamashtami (Vaishnva)", "August 26", "Monday"),
	("Milad-un-Nabi or Id-e-Milad (Birthday of Prophet Mohammad)", "September 16", "Monday"),
	("Mahatma Gandhi’s Birthday", "October 2", "Wednesday"),
	("Dussehra", "October 12", "Saturday"),
	("Diwali", "October 31", "Thursday"),
	("Guru Nanak’s Birthday", "November 15", "Friday"),
	("Christmas", "December 25", "Wednesday")
]

# Call the function to print the holiday list
print_holiday_list(holidays_list)
