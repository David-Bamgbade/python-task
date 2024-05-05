number1 = int(input('Enter number '))

number2 = int(input('Enter number '))

number3 = int(input('Enter number '))

sum = number1 + number2
print(sum)

average = number1 + number2 / 2
print(average)

product = number1 * number2
print(product)

minimum = number1

maximum = number1

if number2 < minimum:
	minimum = number2
	print('The smallest is', minimum)

else:

	if number3 < minimum:
		minimum = number3
		print('The smallest is', minimum)

	if number2 > maximum: 
		maximum = number2
		print('The largest is', maximum)

	if number3 > maximum:
		maximum = number3
		print('The largest is', maximum)


