class Person:
    def __init__(self,name,age,gender,phone_num,address):
        self.name = name
        self.age = age
        self.gender = gender
        self.phone_num = phone_num
        self.address = address

    def printPerson(self):
        print(f"Name:{self.name}")
        print(f"Age:{self.age}")
        print(f"Gender:{self.gender}")
        print(f"Phone Number:{self.phone_num}")
        print(f"Address:{self.address}")



class Student(Person):
    def __init__(self,name,age,gender,phone_num,address,st_id,course,level,fees_balance):
        super().__init__(name,age,gender,phone_num,address)
        self.st_id = st_id
        self.course = course
        self.level = level
        self.fees_balance = fees_balance

    def printPerson(self):
        super().printPerson()
        print(f"Student id :{self.st_id}")
        print(f"Course :{self.course}")
        print(f"Level :{self.level}")
        print(f"Fees Balance :{self.fees_balance}")

class Teacher(Person):
    def __init__(self,name,age,gender,phone_num,address,staff_id,sub_taught,salary,years_experience):
        super().__init__(name,age,gender,phone_num,address)
        self.staff_id = staff_id
        self.sub_taught = sub_taught
        self.salary = salary
        self.years_experience = years_experience

    def printPerson(self):
        super().printPerson()
        print(f"Staff id :{self.staff_id}")
        print(f"Subject :{self.sub_taught}")
        print(f"Salary :{self.salary}")
        print(f"Years Experience :{self.years_experience}")

class HeadTeacher(Teacher):
    def __init__(self,name,age,gender,phone_num,address,off_num,school_branch,allowance):
        self.off_num = off_num
        self.school_branch = school_branch
        self.allowance = allowance

    def printPerson(self):
        super().printPerson()
        print(f"Office number :{self.off_num}")
        print(f"Branch :{self.school_branch}")
        print(f"Allowance :{self.allowance}")


print("1st Student")
s1 = Student(
name = input("Enter your name: "),
age = int(input("Enter your age: ")),
gender = input("Enter your gender: "),
phone_num = int(input("Enter your phone number: ")),
address = input("Enter your address: "),
st_id = int(input("Enter your student id: ")),
course = input("Enter your course: "),
level = int(input("Enter your level: ")),
fees_balance = int(input("Enter your fees balance: "))

)
print("     "
      "     ")

print("2nd Student")
s2 = Student(
name = input("Enter your name: "),
age = int(input("Enter your age: ")),
gender = input("Enter your gender: "),
phone_num = int(input("Enter your phone number: ")),
address = input("Enter your address: "),
st_id = int(input("Enter your student id: ")),
course = input("Enter your course: "),
level = int(input("Enter your level: ")),
fees_balance = int(input("Enter your fees balance: "))
)

print("     "
      "     ")

print("1st Teacher")
t1 = Teacher(
name = input("Enter your name: "),
age = int(input("Enter your age: ")),
gender = input("Enter your gender: "),
phone_num = int(input("Enter your phone number: ")),
address = input("Enter your address: "),
staff_id = int(input("Enter your staff id: ")),
sub_taught = (input("Enter your subject taught: ")),
salary = int(input("Enter your salary: ")),
years_experience = int(input("Enter your years experience: "))

)

print("     "
      "     ")

print("2nd Teacher")
t2 = Teacher(
name = input("Enter your name: "),
age = int(input("Enter your age: ")),
gender = input("Enter your gender: "),
phone_num = int(input("Enter your phone number: ")),
address = input("Enter your address: "),
staff_id = int(input("Enter your staff id: ")),
sub_taught = (input("Enter your subject taught: ")),
salary = int(input("Enter your salary: ")),
years_experience = int(input("Enter your years experience: "))


)

print("     "
      "     ")




print("-------------------------------------------SCHOOL REGISTRATION SYSTEM-------------------------------------------")
print()

print("TEACHER 1 DETAILS")
t1.printPerson()
print()

print("TEACHER 2 DETAILS")
t2.printPerson()
print()

print("STUDENT 1 DETAILS")
s1.printPerson()
print()

print("STUDENT 2 DETAILS")
s2.printPerson()
print()