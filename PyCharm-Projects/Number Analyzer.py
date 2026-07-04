"""
===============================================================================
Project: Even & Odd Number Analyzer
===============================================================================

Description:
    A beginner-friendly Python program that accepts multiple integers from the
    user, separates them into even and odd numbers, and displays useful
    information about each group.

What it does:
    - Accepts a user-defined number of integers
    - Stores all numbers in a list
    - Separates numbers into even and odd lists
    - Counts the number of even and odd values
    - Finds the largest and smallest even number
    - Finds the largest and smallest odd number
    - Handles cases where no even or odd numbers are entered

Concepts Used:
    - Lists
    - For loops
    - Conditional statements (if/else)
    - Modulo operator (%)
    - Built-in functions (max, min, len)
    - User input
    - f-strings

Author: Your Name
Language: Python 3
Level: Beginner
===============================================================================
"""

# -------------------- LISTS --------------------
num_list = []
even_list = []
odd_list = []

# -------------------- COUNTERS --------------------
even_count = 0
odd_count = 0

# -------------------- USER INPUT --------------------
num = int(input("How many numbers do you want to enter: "))

# -------------------- DATA COLLECTION --------------------
for i in range(1, num + 1):
    num_entered = int(input(f"Enter number {i}: "))
    num_list.append(num_entered)

    if num_entered % 2 == 0:
        even_list.append(num_entered)
        even_count += 1
    else:
        odd_list.append(num_entered)
        odd_count += 1

# -------------------- ANALYSIS --------------------
print()

if len(odd_list) == 0:
    print("No odd numbers entered.")
else:
    print(f"Largest odd number: {max(odd_list)}")
    print(f"Smallest odd number: {min(odd_list)}")

print()

if len(even_list) == 0:
    print("No even numbers entered.")
else:
    print(f"Largest even number: {max(even_list)}")
    print(f"Smallest even number: {min(even_list)}")

# -------------------- RESULTS --------------------
print(f"""
================ EVEN & ODD NUMBER ANALYZER ================

Numbers Entered: {num_list}

Even Numbers: {even_list}
Odd Numbers: {odd_list}

Number of Even Numbers: {even_count}
Number of Odd Numbers: {odd_count}

============================================================
""")