package Exc81;

public class PartTimeEmployee extends Employee {
    public static final long MEAL_ALLOWANCE = 0;
    private int totalWorkinghours;
    private long baseSalary;

    public PartTimeEmployee(String name, int age, String identificationNumber, boolean fulltime, int totalWorkingday, long baseSalary) {
        super(name, age, identificationNumber, fulltime);
        this.totalWorkinghours = totalWorkingday;
        this.baseSalary = baseSalary;
    }

    public int getTotalWorkinghours() {
        return totalWorkinghours;
    }

    public void setTotalWorkingday(int totalWorkinghours) {
        this.totalWorkinghours = totalWorkinghours;
    }

    public long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return baseSalary;
    }

    @Override
    public long getWorkingCount() {
        return totalWorkinghours;
    }

    @Override
    public long Salary() {
        return getWorkingCount() * getSalaryRate() + getMealAllowance();
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "totalWorkingday=" + totalWorkinghours +
                ", baseSalary=" + baseSalary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", identificationNumber='" + identificationNumber + '\'' +
                ", Fulltime=" + Fulltime +
                ", Salary=" + Salary() +
                '}';
    }
}
