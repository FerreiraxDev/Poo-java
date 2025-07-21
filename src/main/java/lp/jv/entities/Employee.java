package lp.jv.entities;

public class Employee {
    public String name;
    public double salary;
    public double tax;
    public double percentage;

    public double netSalary(){
        return salary - tax;
    }

    public String toString(){
        return "Employee: " + name +", $ " + String.format("%.2f", netSalary());

    }

    public double increaseSalary(){
        double i = (percentage/100) * salary;
        return salary += i - tax;
    }


}
