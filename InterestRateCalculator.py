amount = int(input("Enter Amount: "))

number_of_years = int(input("How many years: "))

for number in range(number_of_years):
	rate_calculation = (20 / 100) * amount

	amount = amount + rate_calculation

	print(f"Number of years {number +1}")

	print(f"Amount is: {amount:.2f}")




	


