package Exc81;

import java.util.Scanner;

public class EmployeeManagement {
    public int n;
    private Employee [] employees;

    public EmployeeManagement(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of employees: ");
        n = sc.nextInt();
        employees = new Employee[n];
        for (int i= 0; i<n; i++){
            System.out.print("Is this a fulltime employee: ");
            boolean Fulltime = sc.nextBoolean();
            System.out.print("Input Employee's name: ");
            String name = sc.nextLine();
            System.out.print("Input Employee's age: ");
            int age = sc.nextInt();
            System.out.print("Input Employee's ID: ");
            String identificationNumber = sc.nextLine();
            System.out.print("Input Employee's salary: ");
            long baseSalary = sc.nextInt();
            if (Fulltime){
                System.out.print("Input number of Workingdays: ");
                int totalWorkingDays = sc.nextInt();

                Employee fulltimeEmployee = new FulltimeEmployee(name,age,identificationNumber,true,totalWorkingDays,baseSalary);
                employees[i] = fulltimeEmployee;
            }else {
                System.out.print("Input number of Workinghours: ");
                int totalWorkinghours = sc.nextInt();

                Employee partimeEmployee = new PartTimeEmployee(name,age,identificationNumber,false,totalWorkinghours,baseSalary);
                employees[i] = partimeEmployee;
            }
        }
    }

    public Employee getMaxSalaryEmployee(){
        Employee result = employees[n];
        for (int i = 0; i < employees.length; i++){
            if (employees[n].Salary() >= result.Salary()){
                result = employees[n];
            }
        }
        return result;
    }

    public void printAllEmployees(){
        for (Employee employee:employees){
            System.out.print(employees.toString());
        }
    }
}









