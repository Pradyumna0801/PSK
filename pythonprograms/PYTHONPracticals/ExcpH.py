# Practical 7
# Example 1: Using try, except, and else Statements
def get_input():
    try:
        num = int(input("Enter a number: "))
    except ValueError:
        print("Invalid input! Please enter a valid number.")
    else:
        print("Entered number:", num)

# Example 2: Using Unified try, except, and finally
def read_file():
    try:
        file = open("example.txt", "r")
        try:
            data = file.read()
            print("File contents:", data)
        finally:
            file.close()
    except FileNotFoundError:
        print("File not found!")
    except IOError:
        print("Error reading file!")

# Example 3: Using try and finally Statement
def get_input_finally():
    try:
        num = int(input("Enter a number: "))
    except ValueError:
        print("Invalid input! Please enter a valid number.")
    finally:
        print("Execution completed.")

# Example 4: Using raise Statement
def calculate_average(numbers):
    if not numbers:
        raise ValueError("Empty list provided.")
    return sum(numbers) / len(numbers)

def raise_example():
    try:
        result = calculate_average([])
    except ValueError as e:
        print("Error:", e)

# Example 5: Using assert Statement
def divide(a, b):
    assert b != 0, "Division by zero!"
    return a / b

def assert_example():
    try:
        result = divide(10, 0)
    except AssertionError as e:
        print("Assertion error:", e)

# Example 6: Catching Multiple Specific Exceptions
def division_error_example():
    try:
        result = 10 / 0
    except ZeroDivisionError:
        print("Zero division error occurred.")
    except ArithmeticError:
        print("Arithmetic error occurred.")

# Main function to execute examples
if __name__ == "__main__":
    print("Example 1:")
    get_input()
    
    print("\nExample 2:")
    read_file()
    
    print("\nExample 3:")
    get_input_finally()
    
    print("\nExample 4:")
    raise_example()
    
    print("\nExample 5:")
    assert_example()
    
    print("\nExample 6:")
    division_error_example()