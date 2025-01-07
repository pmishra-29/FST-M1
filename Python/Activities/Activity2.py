#Ask the user for a number.
#Depending on what number they enter, tell them if the number is an even or odd number.

userNum = int(input("Enter a number to be checked for even or odd:"))
if((userNum%2)==0):
   print ( userNum,"is an even number.")
else: print( userNum,"is an odd number.")