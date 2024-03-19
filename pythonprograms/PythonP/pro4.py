def is_palindrome(string):
    Sstring = ''.join(char.lower() for char in string if char.isalnum())
    return Sstring == Sstring[::-1]

word = "level"
print(word, "is a palindrome:", is_palindrome(word))
