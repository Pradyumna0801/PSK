# Practical 8
# String-Based Exceptions
try:
    # Try to perform some operation that may raise an exception
    raise ValueError("StringBasedException")
except ValueError as e:
    print("Caught a string-based exception:", e)

# Class-Based Exceptions
class MyCustomException(Exception):
    pass

try:
    # Try to perform some operation that may raise an exception
    raise MyCustomException("This is a class-based exception")
except MyCustomException as e:
    print("Caught a class-based exception:", e)

# Nesting Exception Handlers
try:
    try:
        # Try to perform some operation that may raise an exception
        raise ValueError("Inner exception")
    except ValueError as e:
        print("Inner exception handler:", e)
    # Try to perform another operation that may raise an exception
    raise TypeError("Outer exception")
except TypeError as e:
    print("Outer exception handler:", e)
