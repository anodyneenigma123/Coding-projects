"""
===============================================================================
Project: Number Analyzer
===============================================================================

Description:
    A simple Python program that allows the user to input multiple numbers
    and performs basic statistical analysis on them.

What it does:
    - Collects a user-defined amount of numbers
    - Stores them in a list
    - Finds the maximum number
    - Finds the minimum number
    - Calculates the sum
    - Calculates the average

Concepts Used:
    - Lists
    - Loops (for loop)
    - User input
    - Built-in functions (max, min, sum, len)
    - Arithmetic operations
    - String formatting

Author: Your Name
Language: Python 3
Level: Beginner
===============================================================================
"""

# -------------------- INPUT SECTION --------------------
num_list = []
num = int(input("How many numbers would you like to enter? "))

# -------------------- DATA COLLECTION --------------------
for i in range(1, num + 1):
    num_entered = int(input(f"Enter number {i}: "))
    num_list.append(num_entered)

# -------------------- CALCULATIONS --------------------
total = sum(num_list)
maximum = max(num_list)
minimum = min(num_list)
average = total / len(num_list)

# -------------------- OUTPUT SECTION --------------------
print("\n===== NUMBER ANALYZER =====")
print(f"Numbers Entered: {num_list}")
print(f"Maximum Number: {maximum}")
print(f"Minimum Number: {minimum}")
print(f"Sum: {total}")
print(f"Average: {average:.2f}")