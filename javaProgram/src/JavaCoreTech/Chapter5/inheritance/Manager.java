package JavaCoreTech.Chapter5.inheritance;

import java.time.*;

public final class Manager extends Employee{
    public double bonus;
    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year,month,day);
        bonus = 0;
    }
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
    public void setBonus(double b){
        bonus = b;
    }
}
