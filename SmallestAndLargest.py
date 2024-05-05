sum = 0
product = 1
average = 0
maximum = None
minimum = None
for integer in range(4):
	number = int(input("Enter number: ")) 
	sum = number + sum
	product *= number
	average = sum / 4
	
	if maximum is None or number > maximum:
		maximum = number

	elif minimum is None or number < minimum:
		minimum = number
	
print("The sum is:", sum)

print("The product is:", product)
print("The average is:", average)
print("Maximum is", maximum)
print("Minimum is", minimum)





	


