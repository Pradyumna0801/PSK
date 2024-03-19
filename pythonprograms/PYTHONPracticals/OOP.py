# Practical 4
# Classes Objects
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def display(self):
        print("Name:", self.name)
        print("Age:", self.age)

# Create an instance of Person
person1 = Person("Alice", 30)

# Accessing attributes and calling methods
person1.display()

# Inheritance
class Student(Person):
    def __init__(self, name, age, student_id):
        super().__init__(name, age)
        self.student_id = student_id

    def display_student(self):
        self.display()
        print("Student ID:", self.student_id)

# Create an instance of Student
student1 = Student("Bob", 25, "S1234")

# Accessing inherited attributes and calling methods
student1.display_student()

#Incapsulation
class Car:
    def __init__(self, make, model):
        self.__make = make  # Private attribute
        self.__model = model  # Private attribute

    def get_make(self):
        return self.__make

    def get_model(self):
        return self.__model

# Create an instance of Car
my_car = Car("Toyota", "Camry")

# Accessing attributes using getter methods
print("Make:", my_car.get_make())
print("Model:", my_car.get_model())


