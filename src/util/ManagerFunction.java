package util;


import model.Employee;
import model.Person;
import model.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerFunction {
    public static ArrayList<Person> personArrayList = new ArrayList<>();


    public static void input(Scanner scanner) {
        int choose;
        System.out.println("Enter 1. Input Employee");
        System.out.println("2. Input Teacher");

        choose = scanner.nextInt();
        if (choose == 1)
            inputEmployee(scanner);
        else if (choose == 2) inputTeacher(scanner);
        else System.out.println("Please again....");


    }

    public static void inputEmployee(Scanner scanner) {
        Employee employee = new Employee();
        scanner.nextLine();
        System.out.println("Enter id: ");
        employee.setId(scanner.nextLine());
        System.out.println("Enter Name: ");
        employee.setName(scanner.nextLine());
        System.out.println("Enter  Date of birth: ");
        employee.setDateOfBirth(scanner.nextLine());
        System.out.printf("Enter salaryFactor: ");
        employee.setSalaryFactor(scanner.nextDouble());
        personArrayList.add(employee);
    }

    public static void inputTeacher(Scanner scanner) {
        Teacher teacher = new Teacher();
        scanner.nextLine();
        System.out.println("Enter id: ");
        teacher.setId(scanner.nextLine());
        System.out.println("Enter Name: ");
        teacher.setName(scanner.nextLine());
        System.out.println("Enter  Date of birth: ");
        teacher.setDateOfBirth(scanner.nextLine());
        System.out.printf("Enter hour of teaching: ");
        teacher.setHour(scanner.nextInt());
        personArrayList.add(teacher);
    }

    public static void show() {
        for (Person p : personArrayList)
            p.show();
    }

    public static void getMaxSalary() {
        Person employee = personArrayList.get(0);
        for (int i = 0; i < personArrayList.size(); i++) {
            if (employee.getSalary() < personArrayList.get(i).getSalary()) {
                employee = personArrayList.get(i);
            }
        }
        employee.show();
    }

    public static void getTotalSalary() {
        double sum = 0;
        for (int i = 0; i < personArrayList.size(); i++) {
            sum = sum + personArrayList.get(i).getSalary();
        }
        System.out.println("Total salary must paid: " + sum);
    }

}
