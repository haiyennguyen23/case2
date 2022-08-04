package model;

public class PartimeEmployee extends Employee {
    private float workHours;

    public PartimeEmployee(String id, String fullName, int age, String phone, String email, float workHours) {
        super(id, fullName, age, phone, email);
        this.workHours = workHours;
    }

    public PartimeEmployee(float workHours) {
        this.workHours = workHours;
    }

    @Override
    public float getSalary() {
        return workHours*100;
    }

    public PartimeEmployee() {
    }

    public float getWorkHours() {
        return workHours;
    }

    public void setWorkHours(float workHours) {
        this.workHours = workHours;
    }

    @Override
    public String toString() {
        return "ParttimeEmployee{" +
                "workHours=" + workHours +
                '}';
    }
}
