# Given a two list of numbers create a new list such that new list should contain only odd numbers 
# from the first list and even numbers from the second list.

list1 =[1,2,3,4,5]
list2=[6,7,8,9]
list3=[]
list4=[]

for num in list1:
    if(num%2==0):
        list3.append(num)
    else:
        list4.append(num)
for num in list2:
    if(num%2==0):
        list3.append(num)
    else:
        list4.append(num)

print("list of even numbers is:",list3)
print("list of odd numbers is:",list4)
              