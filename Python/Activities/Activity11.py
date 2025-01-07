#Create a Python dictionary that contains a bunch of fruits and their prices.
#Write a program that checks if a certain fruit is available or not.
#print the price if fruit is in stock

fruits={"apple":200,
        "banana":20,
        "mango":300,
        "orange":250}

fruit=input("Please enter the fruit name you are looking for: ").lower()

if (fruit in fruits):
    print("Yes , Fruit found in stock ! ")
    print(fruit + " costs " + str(fruits[fruit]) + " rupees/Kg")
else:
    print("No , Fruit out of stock ! ")