#Write a function sum() such that it can accept a list of elements and print the sum of all elements
	
# Custom function to calculate sum
def calculate_sum(numbers):
	sum = 0
	for number in numbers:
		sum += int(number)
	return sum
 
# Define the list of numbers
numList = list(input("enter numbers for sum separated by comma: ... ").split(","))
 
# Call the sum() function with numList as argument
result = calculate_sum(numList)
 
# Print result with message
print("The sum of all the elements is: " + str(result))
