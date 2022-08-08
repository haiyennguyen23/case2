package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee implements Serializable {
    public static List<Employee> arr = new ArrayList<>();
    private int id;
   private String name;
    private String gender;
    private int age;
    private String status;
    public abstract float totalSalary();

    public Employee() {
    }

    public Employee(int id, String name, String gender, int age, String status) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", status='" + status + '\'' +
                '}';
    }

    public void editInformation(List<Employee> arr, String name3) {
    }

    public void deleteEmployee(List<Employee> arr, String name4) {

    }

    public abstract void sumTotalSalary(List<Employee> arr);

    public abstract void addFulltimeEmployee();


    public abstract void addPartimeEmployee();


    public abstract void search(List<Employee> arr, String name);

    public abstract void statusDisplay(List<Employee> arr, String name1);

    public abstract void changeStatus(List<Employee> arr, String name2);
}
