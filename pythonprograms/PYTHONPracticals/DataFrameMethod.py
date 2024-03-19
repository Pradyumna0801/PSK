#Python practical 13
import pandas as pd
# Creating a DataFrame from a dictionary
data = {
    'Name': ['Pradyumna', 'Bhushan', 'Gaurav', 'Manoj'],
    'Age': [22, 21, 21, 22],
    'City': ['Nandura', 'Bhusawal', 'Raver', 'Shegaon']
}

df = pd.DataFrame(data)

# Displaying the DataFrame
print("DataFrame created from dictionary:")
print(df)
print()

# Writing DataFrame to a CSV file
df.to_csv('data.csv', index=False)

print("DataFrame written to data.csv")

# Reading DataFrame from a CSV file
df_read = pd.read_csv('data.csv')

# Displaying the DataFrame read from the CSV file
print("\nDataFrame read from data.csv:")
print(df_read)

