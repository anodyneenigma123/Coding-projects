user_pass = input("Enter your password: ")
count = 0

has_upper = False
has_lower = False
has_digit = False


if len(user_pass) >= 8:
    count += 1
else:
    print("The password must contain at least 8 characters.")

for char in user_pass:
    if char.isupper():
        has_upper = True
    if char.islower():
        has_lower = True
    if char.isdigit():
        has_digit = True




if count < 4:
    print(f"Password Strength:{count}/4")
    print("Weak Password")
else:
    print("Strong Password")
