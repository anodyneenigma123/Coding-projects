"""
===============================================================================
Project: Student Profile Card
===============================================================================

Description:
    A beginner-friendly Python program that collects a student's personal
    information and displays it in a neatly formatted profile card.

Information Collected:
    - Name
    - Age
    - School
    - Favourite Food

Features:
    ✓ Accepts user input.
    ✓ Stores information using variables.
    ✓ Uses formatted string literals (f-strings).
    ✓ Displays the information in a clean and readable format.

Concepts Practiced:
    - Variables
    - User Input (input())
    - Data Types (str, int)
    - Formatted String Literals (f-strings)
    - Output Formatting

Author: Your Name
Language: Python 3
===============================================================================
"""

# Prompt the user to enter their personal information.
name = input("Enter your name: ")
age = int(input("Enter your age: "))
school = input("Enter your school: ")
fav_food = input("Enter your favourite food: ")

# Display the collected information as a formatted profile card.
print("\n================ STUDENT PROFILE CARD ================")
print(f"Name            : {name}")
print(f"Age             : {age}")
print(f"School          : {school}")
print(f"Favourite Food  : {fav_food}")
print("======================================================")