package Exc71;

public class FullTimeEmployee extends Employee {

    private float baseSalary;

    private boolean level;

    private int overTimeDay;

    public FullTimeEmployee(String name, int age, String address, boolean isFullTime, float baseSalary, boolean level, int overTimeDay) {
        super(name, age, address, isFullTime);
        this.baseSalary = baseSalary;
        this.level = level;
        this.overTimeDay = overTimeDay;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public boolean isLevel() {
        return level;
    }

    public void setLevel(boolean level) {
        this.level = level;
    }

    public int getOverTimeDay() {
        return overTimeDay;
    }

    public void setOverTimeDay(int overTimeDay) {
        this.overTimeDay = overTimeDay;
    }

    @Override
    public float MonthlySalary(){
    float result = 0;
    if(level){
        result = 20;
    } else {
        result = 10;}
    result = result + overTimeDay*0.8f;
    return result;
    }


    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", isFulltime=" + isFulltime +
                ", baseSalary=" + baseSalary +
                ", level=" + level +
                ", overTimeDay=" + overTimeDay +
                '}';
    }
}
