package com.myTasks.task1_organization;

import java.util.StringJoiner;

public class Employee {
    private final String fullName;
    private String position;
    private String email;
    private String telephone;
    private int age;
    private double theSalary;

    public Employee(String fullName, String position, String email, String telephone, int age, double theSalary) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
        this.theSalary = theSalary;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
                .add("fullName='" + fullName + "'")
                .add("position='" + position + "'")
                .add("email='" + email + "'")
                .add("telephone='" + telephone + "'")
                .add("age=" + age)
                .add("theSalary=" + theSalary)
                .toString();
    }

    public void employeeProfile(Employee[] arrEmployees){
        System.out.println("ФИО - " + fullName + " " +  "Должность  - "  + position +" " +  "email - " + email+" " +  "телефон  - "
                        + telephone+" " + "возраст - " + age+" " + "зарплата - " + theSalary);
    }




    public static void main(String[] args) {

        Employee employee = new Employee("Ivanov Ivan", "Engineer","test@mail.ru","+79053491338",25,35600);
        Employee employee1 = new Employee("Petrov Oleg", "Engineer","test1@mail.ru","+79053471337",31,34650);
        Employee employee2 = new Employee("Sergeev Peter", "Engineer","test2@mail.ru","+79253401358",45,45500);
        Employee employee3 = new Employee("Fedorov Evgeniy", "Engineer","test3@mail.ru","+79094422338",55,55000);
        Employee employee4= new Employee("Slavin Roman", "Engineer","test4@mail.ru","+79053491338",41,35600);
        Employee[] arrEmployees = new Employee[5];
        arrEmployees[0] = employee;
        arrEmployees[1] = employee1;
        arrEmployees[2] = employee2;
        arrEmployees[3] = employee3;
        arrEmployees[4] = employee4;
        for (int i = 0; i < arrEmployees.length; i++) {
            if (arrEmployees[i].age > 40){
                System.out.println(arrEmployees[i]);
            }
        }

       /* employee.employeeProfile(arrEmployees);
        employee1.employeeProfile(arrEmployees);
        employee2.employeeProfile(arrEmployees);
        employee3.employeeProfile(arrEmployees);
        employee4.employeeProfile(arrEmployees);
        System.out.println(Arrays.toString(arrEmployees));*/
    }

}
