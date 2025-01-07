	
#***********Activity 19*************
# Writing into Excel Files
# Use pandas to write data into the Excel file

# Import pandas
import pandas
from pandas import ExcelWriter
 
# Create a dictionary that will be used to create the DataFrame
data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}
 
# Create the DataFrame that will be written to the excel file
dataframe = pandas.DataFrame(data)
 
# Print the dataframe
print(dataframe)
 
# Write the dataframe to a Excel file
writer = ExcelWriter('outputs/sampleExcel.xlsx')
dataframe.to_excel(excel_writer=writer, sheet_name='Sheet1', index = False)
 
# Commit data to the Excel file
writer.close()

#***********Activity 20*************
# Reading Excel Files
# Use pandas to read data the Excel file

# Print the number of rows and columns
# Print the data in the emails column only
# Sort the data based on FirstName in ascending order and print the data

	
# Read data from Excel sheet
dataframe = pandas.read_excel('outputs/sampleExcel.xlsx')
 
# Print the dataframe
print(dataframe)
 
# Print the number of rows and columns
print("====================================")
print("Number of rows and columns:", dataframe.shape)
print("No. of rows:", dataframe.shape[0])
print("No. of columns:", dataframe.shape[1])
 
# Print the data in the emails column only
print("====================================")
print("Emails:")
print(dataframe['Email'])
 
# Sort the data based on FirstName in ascending order and print the data
print("====================================")
print("Sorted data:")
print(dataframe.sort_values('FirstName'))