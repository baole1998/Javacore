package Exc81;

public abstract class Employee {
    protected String name;
    protected int age;
    protected String identificationNumber;
    protected boolean Fulltime;
    public abstract long getMealAllowance();
    public abstract long getSalaryRate();
    public abstract long getWorkingCount();
    public abstract long Salary();

    public Employee(String name, int age, String identificationNumber, boolean fulltime) {
        this.name = name;
        this.age = age;
        this.identificationNumber = identificationNumber;
        this.Fulltime = fulltime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public boolean Fulltime(){
        return Fulltime;
    }

    public void setFulltime(boolean fulltime){
        Fulltime = fulltime;
    }








}
