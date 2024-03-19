# Practical 2
# Creating a tuple
tuple = (1, 2, 3, 4, 5)

# Accessing elements
print("First element:", tuple[0])
print("Last element:", tuple[-1])

# Slicing
print("Sliced tuple:", tuple[2:4])

# Length of the tuple
print("Length of the tuple:", len(tuple))

# Iterating through the tuple
print("Tuple elements:")
for item in tuple:
    print(item)

# Unpacking tuple
a, b, c, d, e = tuple
print("Unpacked tuple:", a, b, c, d, e)

# Concatenating tuples
tuple1 = (1, 2, 3)
tuple2 = (4, 5, 6)
concatenated_tuple = tuple1 + tuple2
print("Concatenated tuple:", concatenated_tuple)

# Repetition
repeated_tuple = tuple1 * 3
print("Repeated tuple:", repeated_tuple)

# Checking membership
if 3 in tuple:
    print("3 is present in the tuple")
else:
    print("3 is not present in the tuple")
