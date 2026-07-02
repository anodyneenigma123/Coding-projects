"""
===============================================================================
Project: Guess the Number Game
===============================================================================

Description:
    A simple number guessing game where the computer randomly selects a number
    between 1 and 100, and the player tries to guess it.

How It Works:
    1. The program generates a random secret number.
    2. The user keeps guessing until they find the correct number.
    3. After each guess, the program gives a hint:
        - "Too low"  → guess a higher number
        - "Too high" → guess a lower number
    4. The program counts how many attempts the user makes.

Features:
    - Random number generation using Python's random module
    - Continuous guessing using a while loop
    - Hint system (higher or lower guidance)
    - Attempt counter to track performance

Concepts Practiced:
    - Variables
    - Input and Output
    - Conditional statements (if, elif, else)
    - While loops
    - Counters
    - Python standard library (random module)

Author: Your Name
Language: Python 3
Level: Beginner
===============================================================================
"""

import random

# Generate a random number between 1 and 100
secret_number = random.randint(1, 100)

# Track number of attempts
attempt = 0

print("===== GUESS THE NUMBER GAME =====")

# Game loop
while True:
    guess = int(input("Guess the number (1-100): "))
    attempt += 1

    if guess < secret_number:
        print("Too low")
        print("Try a higher number\n")

    elif guess > secret_number:
        print("Too high")
        print("Try a lower number\n")

    else:
        print("Correct! You guessed the number!")
        break

# Final result
print(f"\nAttempts: {attempt}")