package model;

import java.io.Serializable;
import java.util.List;

public class FulltimeEmployee extends Employee implements Serializable {
        private int workingDay;
        private double seniority;
    @Override
    public float totalSalary() {
        int attendanceBonus = 50;
        int moneyLevel = 40;
        int salasyInADay = 20;
        float sum = 0;
        if (workingDay > 22) {
         sum = (float) (workingDay * salasyInADay + seniority * moneyLevel +attendanceBonus);
        }else{
            sum = (float) (workingDay * salasyInADay + seniority * moneyLevel);
        }
        return sum;
    }

    public FulltimeEmployee(int id, String name, String gender, int age, String status, int workingDay, double seniority) {
    }

    public FulltimeEmployee(int workingDay, double seniority) {
        this.workingDay = workingDay;
        this.seniority = seniority;
    }

    public int getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }

    public double getSeniority() {
        return seniority;
    }

    public void setSeniority(double seniority) {
        this.seniority = seniority;
    }

    @Override
    public String toString() {
        return "FulltimeEmployee{" +
                "workingDay=" + workingDay +
                ", seniority=" + seniority +
                '}'+ super.toString();
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
