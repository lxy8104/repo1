package JavaCoreTech.Chapter5.inheritance;

import java.time.*;

public class Employee {
    private String name;
    public double salary;
    private LocalDate hireDay;
    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public LocalDate getHireDay(){
        return hireDay;
    }
    public void raiseSalary(double byPercent){
        salary = salary * (100+byPercent)/100;
    }
    public static void play(){
        System.out.println("static method!");
    }
}
