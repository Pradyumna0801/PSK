# Practical 14
import tkinter as tk
from tkinter import messagebox

# Function to handle button click
def show_message():
    messagebox.showinfo("Message", "Hello, Tkinter!")

# Create the main application window
root = tk.Tk()
root.title("Tkinter Demo")

# Create a label widget
label = tk.Label(root, text="Welcome to Tkinter!")
label.pack(pady=40)

# Create a button widget
button = tk.Button(root, text="Click me", command=show_message)
button.pack()

# Run the main event loop
root.mainloop()
