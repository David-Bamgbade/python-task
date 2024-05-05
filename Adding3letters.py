def names():

	word = str(input("Enter String "))
		
	str1 = "ing"
	str2 = "ly"

	if word[-3:] == "ing":
		
		result2 = word + str2

		print(result2)

	else:

		result = word + str1

		print(result)
	
names()  