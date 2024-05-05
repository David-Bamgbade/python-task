def names():

	word = str(input("enter letter "))

	substring = word[:2] + word[-2:]
	print(substring)
	
	if len(word) < 2:
		print('"""')


names()

		 