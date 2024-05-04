dollar = float(input("Enter money in dollar: "))
#dollar_conversion_factor = 83.02 
#canadian_dollar_conversion_factor = 61.67
#Chinese_yuvan_conversion_factor = 11.66
#Euro_conversion_factor = 89.52
#japan_yen_conversion_factor = 0.56

dollar_conversion_factor = 83.02 
canadian_dollar_conversion_factor = 61.67
Chinese_yuvan_conversion_factor = 11.66
Euro_conversion_factor = 89.52
japan_yen_conversion_factor = 0.56

rupees = dollar * dollar_conversion_factor
canadian_rupees = dollar * canadian_dollar_conversion_factor
chinese_rupees = dollar * Chinese_yuvan_conversion_factor
Euro_rupees = dollar * Euro_conversion_factor
japan_yen = dollar * japan_yen_conversion_factor

print(f"{dollar} dollar is equal to {rupees} rupees")
print(f"{dollar} dollar is equal to {canadian_rupees} rupees")
print(f"{dollar} dollar is equal to {chinese_rupees} rupees")
print(f"{dollar} dollar is equal to {Euro_rupees} rupees")
print(f"{dollar} dollar is equal to {japan_yen} rupees")

