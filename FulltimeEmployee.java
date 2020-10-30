package Exc81;

public class FulltimeEmployee extends Employee {
    protected static final long MEAL_ALLOWANCE = 2000000;
    protected int totalWorkingday;
    protected long dailySalary;

    public FulltimeEmployee(String name, int age, String identificationNumber, boolean fulltime, int totalWorkingday, long dailySalary) {
        super(name, age, identificationNumber, fulltime);
        this.totalWorkingday = totalWorkingday;
        this.dailySalary = dailySalary;
    }



    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return dailySalary;
    }

    @Override
    public long getWorkingCount() {
        return totalWorkingday;
    }

    @Override
    public long Salary() {
        return getSalaryRate() * getWorkingCount() + getMealAllowance();
    }

    @Override
    public String toString() {
        return "FulltimeEmployee{" +
                "totalWorkingday=" + totalWorkingday +
                ", dailySalary=" + dailySalary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", identificationNumber='" + identificationNumber + '\'' +
                ", Fulltime=" + Fulltime +
                ", Salary= " + Salary() +
                '}';
    }
}
