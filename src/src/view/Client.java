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
        PartimeEmployee b3 = new PartimeEmployee(3.4f);
        PartimeEmployee b4 = new PartimeEmployee(10.0f);
        employees.add(b1);
        employees.add(b2);
        employees.add(b3);
        employees.add(b4);
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
