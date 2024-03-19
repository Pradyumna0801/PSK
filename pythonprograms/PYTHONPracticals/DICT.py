# Practical 2
# Program demonstrating dictionary operations

# Creating a dictionary
dict = {'name': 'Pradyumna', 'age': 22, 'city': 'New York'}

# Accessing elements
print("Name:", dict['name'])
print("Age:", dict['age'])

# Modifying elements
dict['age'] = 35
print("Modified age:", dict['age'])

# Adding new key-value pair
dict['gender'] = 'Male'
print("Dictionary with new key-value pair:", dict)

# Removing key-value pair
del dict['city']
print("Dictionary after removing 'city':", dict)

# Checking if key exists
if 'age' in dict:
    print("Age is present in the dictionary")

# Iterating through the dictionary
print("Dictionary items:")
for key, value in dict.items():
    print(key, ":", value)
