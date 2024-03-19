# Practical 3
# Program demonstrating function scoping
def outer_function():
    x = 10
    def inner_function():
        # accessing the x from outer_function
        print("Inside inner_function:", x)

    inner_function()

# Call the outer function
outer_function()

# Program demonstrating recursion to calculate factorial

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n - 1)

# Test the factorial function
number = 5
print("Factorial of", number, "is", factorial(number))


# Program demonstrating list mutability

def modify_list(lst):
    lst.append(4)
    lst[0] = "modified"

my_list = [1, 2, 3]
print("Original list:", my_list)

modify_list(my_list)
print("Modified list:", my_list)
