package model;

import java.io.Serializable;
import java.util.List;

public class PartimeEmployee extends Employee implements Serializable {
    private double time;
    private int fines;
    @Override
    public float totalSalary(){
        int hourlySalary =2;
        float sum = 0;
        sum = (float) (time * hourlySalary - fines);
        return sum;
    }

    public PartimeEmployee() {
    }

    public PartimeEmployee(int id, String name, String gender, int age, String status, double time, int fines) {
        super(id, name, gender, age, status);
        this.time = time;
        this.fines = fines;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int getFines() {
        return fines;
    }

    public void setFines(int fines) {
        this.fines = fines;
    }

    @Override
    public String toString() {
        return "PartimeEmployee{" +
                "time=" + time +
                ", fines=" + fines +
                '}' + super.toString();
    }

    @Override
    public void sumTotalSalary(List<Employee> arr) {

    }

    @Override
    public void addFulltimeEmployee() {

    }

    @Override
    public void addPartimeEmployee() {

    }

    @Override
    public void search(List<Employee> arr, String name) {

    }

    @Override
    public void statusDisplay(List<Employee> arr, String name1) {

    }

    @Override
    public void changeStatus(List<Employee> arr, String name2) {

    }
}
