collection_rate = int(input("Enter Sales"))

if collection_rate >= 70:
	amount_per_percel = 500
	base_pay = 5000


if collection_rate >= 60 and collection_rate <=69:
	amount_per_percel = 250
	base_pay = 5000

if collection_rate >= 50 and collection_rate <=59:
	amount_per_percel = 200
	base_pay = 5000


if collection_rate < 50:
	amount_per_percel = 160
	base_pay = 5000

total = collection_rate * amount_per_percel + base_pay

print("Total is:", total)
