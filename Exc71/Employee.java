package Exc71;

public class Employee {
    protected String name;
    protected int age;
    protected String address;
    protected boolean isFulltime;

    public Employee (String name, int age, String address, boolean isFulltime){
        this.name = name;
        this.age = age;
        this.address = address;
        this.isFulltime = isFulltime;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isFulltime() {
        return isFulltime;
    }

    public void setFulltime(boolean fulltime) {
        isFulltime = fulltime;
    }

    public float MonthlySalary(){
        return 0;
    }
}
