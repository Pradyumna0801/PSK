# Practical 2
# LIST DICTIONARY TUPLES
list1=[]
print(type(list1))

# get data from list
list2=[10,"manoj",True,10.5,"shyam","manthan",10,"pradyumna","mathan"]
print(list2[0:6])

#count
print(list2.count("manthan"))

#index
print(list2.index(10.5))
print(list2.index("shyam"))

#insert
list2.insert(3,"vaibhav")
print(list2)

#pop
list2.pop(5)
print(list2)

#extend
list3=["akash","anand"]
list2.extend(list3)
print(list2)

#copy
list4=list3.copy()
print(list4)

#sort
list5=[14,23,56,87,45,87,90]
list5.sort() #(result=True)
print(list5)

#reverse
list2.reverse()