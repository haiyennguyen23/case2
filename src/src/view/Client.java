package view;

import controller.EmployeeManager;
import model.Employee;
import model.FulltimeEmployee;
import model.PartimeEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    private static List<Employee> employees = EmployeeManager.employees;
    static {
        FulltimeEmployee b1 = new FulltimeEmployee(100, 0, 10000);
        FulltimeEmployee b2 = new FulltimeEmployee(10, 50, 20000);
        FulltimeEmployee b3 = new FulltimeEmployee(50, 0, 20000);
        FulltimeEmployee b4 = new FulltimeEmployee(80, 20, 250000);
        FulltimeEmployee b5 = new FulltimeEmployee(150, 0, 2500000);
        PartimeEmployee b6 = new PartimeEmployee(15.2f);
        PartimeEmployee b7 = new PartimeEmployee(10.0f);
        PartimeEmployee b8 = new PartimeEmployee(20.5f);
        PartimeEmployee b9 = new PartimeEmployee(3.4f);
        PartimeEmployee b10 = new PartimeEmployee(10.0f);
        employees.add(b1);
        employees.add(b2);
        employees.add(b3);
        employees.add(b4);
        employees.add(b5);
        employees.add(b6);
        employees.add(b7);
        employees.add(b8);
        employees.add(b9);
        employees.add(b10);
    }
    public static void main(String[] args) {
        System.out.println(employees);
        EmployeeManager ka = new EmployeeManager();
        System.out.println(ka.getAverageSalary());

        EmployeeManager quan = new EmployeeManager();
        System.out.println(quan.getAverageSalary());

        ka.addNewEmployee(newE());
        System.out.println(employees);
    }

    //    them moi nhan vien fulltime
    public static Employee newE(){
        FulltimeEmployee newE = new FulltimeEmployee();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten");
        String name = scanner.nextLine();
        newE.setFullName(name);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhap email");
        String email = scanner.nextLine();
        newE.setEmail(email);
        return newE;
    }

}
