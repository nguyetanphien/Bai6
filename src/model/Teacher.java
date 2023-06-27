package model;

public class Teacher extends Person {
    private int hour;

    public Teacher() {
    }

    public Teacher(String id, String name, String dateOfBirth, String address, int hour) {
        super(id, name, dateOfBirth, address);
        this.hour = hour;
    }

    @Override
    public double getSalary() {
        return hour * 2500;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public void show() {
        System.out.println("\n-----------Teacher--------------");
        System.out.println("id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("dateOfBirth: " + getDateOfBirth());
        System.out.println("address: " + getAddress());
        System.out.println("Hour: " + hour);
        System.out.println("Get Salary: " + getSalary());
    }

}
