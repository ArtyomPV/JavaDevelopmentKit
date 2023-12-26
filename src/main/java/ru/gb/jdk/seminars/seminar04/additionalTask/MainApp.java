package ru.gb.jdk.seminars.seminar04.additionalTask;

import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Viktor", 123, 2, "9815569877");
        Employee employee4 = new Employee("Viktor", 124, 2, "9815569800");
        Employee employee2 = new Employee("Igor", 125, 3, "9115598211");
        Employee employee3 = new Employee("Gena", 245, 1, "9056982437");

        Catalog catalog = new Catalog();
        catalog.add(employee1);
        catalog.add(employee2);
        catalog.add(employee3);
        catalog.add(employee4);

        catalog.showCatalog();
        System.out.println("\n\tВведите табельный номер сотрудника: ");
        Scanner in = new Scanner(System.in);
        int personnelNumber = in.nextInt();
        catalog.findPhoneNumber(personnelNumber);

        System.out.println("\n\tВведите рабочий стаж: ");
        int workExperience = in.nextInt();
        List<Employee> employeeList = catalog.getEmployee(workExperience);
        if(!employeeList.isEmpty()){
            System.out.println(employeeList);
        } else {
            System.out.printf("Сотрудники со стажем %d лет отсутствуют", workExperience);
        }

    }

}
