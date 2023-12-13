package ru.gb.jdk.seminars.seminar04.additionalTask;

public class Employee extends Person{

    private final int personnelNumber;
    private final int workExperience;
    private final String phoneNumber;

    public Employee(String name, int personnelNumber, int workExperience, String phoneNumber) {
        super(name);
        this.personnelNumber = personnelNumber;
        this.workExperience = workExperience;
        this.phoneNumber = phoneNumber;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                ", personnelNumber=" + personnelNumber +
                ", workExperience=" + workExperience +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

