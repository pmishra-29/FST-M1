#********************Activity 17 ***************
# Writing data into CSV Files

# import pandas
import pandas as pd
 
# Create a dictionary to hold our data
	
data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}

# Create a DataFrame using that data
dataframe = pd.DataFrame(data)
 
# Print the DataFrame
print(dataframe)
 
"""
 Write the DataFrame to a CSV file
 To avoid writing the index numbers to the file as well
 the index property is set to false
"""
dataframe.to_csv("outputs/sample.csv", index=False)


#********************Activity 18 ***************
# Read the CSV made in the previous program:

# Print the values only in the Usernames column
# Print the username and password of the second row
# Sort the Usernames column data in ascending order and print data
# Sort the Passwords column in descending order and print data

dataframe = pd.read_csv('outputs/sample.csv')

	
# Print the full data
print("Full Data: ")
print(dataframe)
 
# Print the values in the Usernames column only
print("===============")
print("Usernames:")
print(dataframe["Usernames"])
 
# Print the username and password of the second row
print("===============")
print("Username: ", dataframe["Usernames"][1], " | ", "Password: ", dataframe["Passwords"][1])
 
#Sort the Usernames column in ascending order
print("====================================")
print("Data sorted in ascending Usernames:")
print(dataframe.sort_values('Usernames'))
 
#Sort the Passwords column in descending order
print("====================================")
print("Data sorted in descending Passwords:")
print(dataframe.sort_values('Passwords', ascending=False))