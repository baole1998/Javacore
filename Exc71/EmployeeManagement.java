package Exc71;

import java.util.Random;

public class EmployeeManagement {
    private Employee[] employees;

    public EmployeeManagement(){
        Random random = new Random();
        int numberOfEmployees = 10;
        employees = new Employee[10];
        for (int i = 0; i<numberOfEmployees; i++) {
            boolean isFulltime = random.nextBoolean();
            String name = "Employee_" + i;
            int age = 18 + random.nextInt(100);
            String address = "Address_" + i;

            if (isFulltime){
                float  BaseSalary = random.nextFloat();
                boolean level = random.nextBoolean();
                int overTimeday = random.nextInt();
                Employee fullTimeEmployee = new FullTimeEmployee(name,age,address,isFulltime,BaseSalary,level,overTimeday);
                employees[i] = fullTimeEmployee;
            }else {
                int workingHours = random.nextInt();
                Employee partimeEmployee = new PartTimeEmployee(name,age,address,isFulltime,workingHours);
                employees[i] = partimeEmployee;
            }
        }
    }

    public void printAllEmployees(){
        for (Employee employee:employees){
            System.out.println(employee.toString());
        }
    }

    public Employee[] getEmployees(){
        return employees;
    }

    public void setEmployees(){
        this.employees = employees;
    }
}
