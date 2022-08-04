package model;

public class FulltimeEmployee extends Employee {
    private int bonus;
    private int fines;
    private int netSalary;

    @Override
    public float getSalary() {
        float salary = netSalary+ bonus- fines;
        return salary;
    }

    public FulltimeEmployee(int bonus, int fines, int netSalary) {
        this.bonus = bonus;
        this.fines = fines;
        this.netSalary = netSalary;
    }

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(String id, String fullName, int age, String phone, String email, int bonus, int fines, int salary) {
        super(id, fullName, age, phone, email);
        this.bonus = bonus;
        this.fines = fines;
        this.netSalary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFines() {
        return fines;
    }

    public void setFines(int fines) {
        this.fines = fines;
    }

    public int getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(int netSalary) {
        this.netSalary = netSalary;
    }

    @Override
    public String toString() {
        return "model.FulltimeEmployee{" +
                "bonus=" + bonus +
                ", fines=" + fines +
                ", salary=" + netSalary + "height"+
                this.getHeight() +"age" + this.getAge()+ '}';
    }
}
