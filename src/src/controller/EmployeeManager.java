package controller;

import model.Employee;
import model.FulltimeEmployee;
import model.PartimeEmployee;
import storage.EmployeeFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    public static List<Employee> employees = EmployeeFile.readFile();

    //    1. Lay ra luong trung binh cua cong ty
    public float getAverageSalary(){
        float sum= 0;
        for (Employee e: employees
        ) {
            sum += e.getSalary();
        }
        float average = sum/employees.size();
        return average;
    }
    //    2. Lay danh sach nhan vien luong thap hon luong tb
    public ArrayList<Employee> getParttimeUnderSalary(){
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        float average = getAverageSalary();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof PartimeEmployee &&
                    employees.get(i).getSalary()<average)
                employeeArrayList.add(employees.get(i));
        }
        return employeeArrayList;
    }

    //    3. Them moi nhan vien fulltime
    public void addNewEmployee(Employee employee){
        employees.add(employee);
        EmployeeFile.writeFile(employees);
    }
}
