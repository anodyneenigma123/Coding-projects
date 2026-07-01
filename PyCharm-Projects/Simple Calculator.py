"""
===============================================================================
Project: Simple Calculator
===============================================================================

Description:
    A beginner-friendly calculator built in Python that performs basic
    arithmetic operations based on the user's input.

Supported Operations:
    - Addition (+)
    - Subtraction (-)
    - Multiplication (*)
    - Division (/)
    - Modulus (%)
    - Exponentiation (**)

Features:
    ✓ Supports both whole numbers and decimal numbers.
    ✓ Prevents division by zero.
    ✓ Handles invalid operator input gracefully.
    ✓ Displays the result using formatted strings.

Concepts Practiced:
    - Variables
    - User Input
    - Data Types (float)
    - Arithmetic Operators
    - Conditional Statements (if, elif, else)
    - Comparison Operators
    - Formatted String Literals (f-strings)

Author: Your Name
Language: Python 3
===============================================================================
"""

# Prompt the user to enter two numbers.
num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))

# Prompt the user to choose an arithmetic operator.
opt = input("Choose one of the operators (+, -, *, /, %, **): ")

# Perform addition.
if opt == "+":
    print(f"Result: {num1} + {num2} = {num1 + num2}")

# Perform subtraction.
elif opt == "-":
    print(f"Result: {num1} - {num2} = {num1 - num2}")

# Perform multiplication.
elif opt == "*":
    print(f"Result: {num1} * {num2} = {num1 * num2}")

# Perform modulus operation.
elif opt == "%":
    if num2 == 0:
        print("Cannot perform modulus by zero.")
    else:
        print(f"Result: {num1} % {num2} = {num1 % num2}")

# Perform exponentiation.
elif opt == "**":
    print(f"Result: {num1} ** {num2} = {num1 ** num2}")

# Perform division.
elif opt == "/":
    if num2 == 0:
        print("Cannot divide by zero.")
    else:
        print(f"Result: {num1} / {num2} = {num1 / num2}")

# Execute if the user enters an unsupported operator.
else:
    print("Invalid operator! Please choose one of the following: +, -, *, /, %, **")