# Write a program that asks the user to enter their name and their age.
# Print out a message addressed to them that tells them the year that they will turn 100 years old.

userName= input("Enter your name : ")
userAge=input("Enter your age : ")
result = 2025-int(userAge) + 100
print ("Dear" ,userName ,"you will turn 100 in year",result,".")