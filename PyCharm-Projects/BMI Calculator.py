"""
===============================================================================
Project: BMI (Body Mass Index) Calculator
===============================================================================

Description:
    A beginner-friendly Python program that calculates a user's Body Mass
    Index (BMI) and classifies them into a health category with advice.

How It Works:
    1. User enters name, weight (kg), and height (m).
    2. Program validates input.
    3. BMI is calculated using:
           BMI = weight / (height^2)
    4. Category and advice are determined using conditions.
    5. Results are displayed in a formatted report.

Features:
    - Input validation (no negative or zero values)
    - BMI calculation
    - Health category classification
    - Personalized advice
    - Clean formatted output

Concepts Practiced:
    - Variables
    - Input/Output
    - Data types (float, string)
    - Arithmetic operations
    - Conditional statements (if, elif, else)
    - Logical operators
    - String formatting (f-strings)

Author: Your Name
Language: Python 3
Level: Beginner
===============================================================================
"""

# ---------------------- INPUT SECTION ----------------------
name = input("Enter your name: ")
weight = float(input("What is your weight (kg): "))
height = float(input("What is your height (m): "))

# ---------------------- VALIDATION ----------------------
if height <= 0 or weight <= 0:
    print("Invalid input. Weight and height must be greater than 0.")

else:
    # ---------------------- CALCULATION ----------------------
    bmi = weight / (height ** 2)

    # ---------------------- CATEGORY LOGIC ----------------------
    if bmi < 18.5:
        category = "Underweight"
        advice = "Please eat more often and maintain a balanced diet."
    elif bmi < 25:
        category = "Normal weight"
        advice = "Great job! Keep maintaining your healthy lifestyle."
    elif bmi < 30:
        category = "Overweight"
        advice = "Try regular exercise and a balanced diet."
    else:
        category = "Obese"
        advice = "Consider consulting a healthcare professional."

    # ---------------------- OUTPUT ----------------------
    print(f"""
========================================
           BMI CALCULATOR REPORT
========================================

Name: {name}

----------------------------------------
BMI: {bmi:.2f}
Category: {category}
----------------------------------------

Advice:
{advice}

========================================
""")