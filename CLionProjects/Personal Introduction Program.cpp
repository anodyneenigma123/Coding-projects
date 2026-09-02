#include  <iostream>
#include  <string>
using namespace std;


int main () {
    std::string name;
    int age;
    int c_year;
    int n_age;
    int b_year;


    cout << "Enter your first name: " << "\n";
    cin >> name;
    cout << "Enter your age: " << "\n";
    cin >> age;
    cout << "Enter the current year: " << "\n";
    cin >> c_year;

    n_age = age + 1;
    b_year = c_year - age;


    cout << "Hello " << name << "\n";
    cout << "Next year, you will be " << n_age << "\n";
    cout << "Your approximate birth year is " << b_year << "\n";











    return 0;
}