package ru.gb.jdk.seminars.seminar04.additionalTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Catalog {
    List<Employee> employees;

    public Catalog() {
        employees = new ArrayList<>();
    }

    public void add(Employee employee){
        employees.add(employee);
    }

    public void findPhoneNumber(int personnelNumber){
        if(isEmployee(personnelNumber)) {
            String phone = employees.stream()
                            .filter(employee -> employee.getPersonnelNumber() == personnelNumber).findAny().get().getPhoneNumber();
            System.out.println(phone);
        }
            else {
            System.out.println("Сотрудника с таким табельным номером не существует");
        }
    }
    public List<Employee> getEmployee(int workExperience){
        List<Employee> persons  = employees.stream()
                .filter(empl -> empl.getWorkExperience() == workExperience)
                .collect(Collectors.toList());
        return persons;
    }

    public void showCatalog(){
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    private boolean isEmployee(int personnelNumber){
        return employees.stream()
                .anyMatch(employee -> employee.getPersonnelNumber() == personnelNumber);
    }

}
