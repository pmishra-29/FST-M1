#Write a recursive function to calculate the sum of numbers from 0
def calculateSum(num):
  if num:
    # Recursive function call
    print(num)
    return num + calculateSum(num-1)
  else:
    return 0
 
# Call calculateSum() function
res = calculateSum(10)
 
# Print result
print(res)