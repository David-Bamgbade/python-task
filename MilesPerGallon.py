gallon_used = 0

while gallon_used != -1:

	gallon_used = float(input("Enter the gallon used (-1 to end) "))

	if gallon_used == -1:
		break

	miles_driven = int(input("Enter the miles driven: "))

	miles_per_gallon = miles_driven / gallon_used

	print(f'Miles per gallon for this thank was {miles_per_gallon}')
