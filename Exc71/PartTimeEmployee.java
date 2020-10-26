package Exc71;

public class PartTimeEmployee extends Employee {
    private int workingHours;

    public PartTimeEmployee(String name, int age, String address, boolean isFulltime, int workingHours) {
        super(name, age, address, isFulltime);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public float MonthlySalary() {
        float result = 0;
        result = result + workingHours*0.1f;
        return result;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", isFulltime=" + isFulltime +
                ", workingHours=" + workingHours +
                '}';
    }
}
