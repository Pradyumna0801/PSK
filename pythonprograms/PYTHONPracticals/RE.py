# Practical 6
import re

# Define a pattern
pattern = r'appl'

# Define a string to search
text = 'I like apples and oranges.'

# Search for the pattern in the string
match = re.search(pattern, text)

# Check if a match is found
if match:
    print('Pattern found:', match.group())
else:
    print('Pattern not found.')