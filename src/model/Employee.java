package model;

public class Employee extends Person {
    private double salaryFactor;

    public Employee() {
    }
    public Employee(String id, String name, String dateOfBirth, String address, double salaryFactor) {
        super(id, name, dateOfBirth, address);
        this.salaryFactor = salaryFactor;
    }

    @Override
    public double getSalary() {
        return salaryFactor * 0.02;
    }

    public double getSalaryFactor() {
        return salaryFactor;
    }

    public void setSalaryFactor(double salaryFactor) {
        this.salaryFactor = salaryFactor;
    }

    @Override
    public void show() {
        System.out.println("------Employment--------------");
        System.out.println("id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("dateOfBirth: " + getDateOfBirth());
        System.out.println("address: " + getAddress());
        System.out.println("SalaryFactor: " + salaryFactor);
        System.out.printf("Get Salary:" + getSalaryFactor());

    }
}
