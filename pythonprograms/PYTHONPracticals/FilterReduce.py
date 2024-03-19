# Practical 10
# Example using filter
print("Filter: ")
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

# Filter even numbers
even_numbers = list(filter(lambda x: x % 2 == 0, numbers))
print("Even numbers:", even_numbers)

# Filter odd numbers
odd_numbers = list(filter(lambda x: x % 2 != 0, numbers))
print("Odd numbers:", odd_numbers)

print("Reduce:")
from functools import reduce

# Example using reduce
numbers = [1, 2, 3, 4, 5]

# Calculate the sum of numbers
total = reduce(lambda x, y: x + y, numbers)
print("Sum of numbers:", total)

# Calculate the product of numbers
product = reduce(lambda x, y: x * y, numbers)
print("Product of numbers:", product)
