package Exc61;

import java.util.Scanner;

public class Student {
    private String name;
    private float gpa;
    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    public boolean checkPass() {
        if(gpa>=1.5) {
            return  true;
        } else {
            return false;
        }
    }
    public void inGpa() {
        System.out.println("GPA:" + gpa);
    }
    public void inName() {
        System.out.println("Name:" + name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}

    public class StudentManagement {
    private int totalStudent;

    private Student[] students;

    public StudentManagement() {
        System.out.println("Input total students:");
        Scanner sc = new Scanner(System.in);
        this.totalStudent = sc.nextInt();
        students = new Student[totalStudent];
        for (int i = 0; i < totalStudent; i++) {
            System.out.print("Name [" + i + "]:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("GPA [" + i + "]:");
            float gpa = sc.nextFloat();
            students[i] = new Student(name, gpa);
        }
        int x = 0;
    }

    public int getPassedStudent() {
        int count = 0;
        for (Student student : students) {
            if (student.checkPass()) {
                count++;
            }
        }
        return count;

        public int getFailedStudent() {
            int count = 0;
            for (Student student : students) {
                if (!student.checkPass()) {
                    count++;
                }
            }
            return count;
        }

    }

    public Student getGpaMaxMin(boolean isMax) {
        Student result = students[0];
        if(isMax) {
            for (int i = 0; i < students.length ; i++) {
                if(students[i].getGpa() >= result.getGpa()){
                    result = students[i];
                }
            }
        }else {
            for (int i = 0; i < students.length ; i++) {
                if(students[i].getGpa() <= result.getGpa()){
                    result = students[i];
                }
            }
        }
        return  result;
    }
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        System.out.println("Total passed:" + studentManagement.getPassedStudent());
        System.out.println("Total failed:" + studentManagement.getFailedStudent());
        System.out.println("Max gpa student:" + studentManagement.getGpaMaxMin(true).getName());
        System.out.println("Min gpa student:" + studentManagement.getGpaMaxMin(false).getName());
    }
}
