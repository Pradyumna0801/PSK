def factorial(n):
    result = 1
    while n > 1:
        result *= n
        n -= 1
    return result

number = 5
print("Factorial of", number, "is", factorial(number))
