package lp.jv.entities;

public class Employee {
    public String name;
    public double salary;
    public double tax;

    public double netSalary(){
        return salary - tax;
    }

    public String toString(){
        return "Employee: " + name +", $ " + String.format("%.2f", netSalary());

    }

    public void increaseSalary(double percentage){
        salary += salary * percentage / 100.0;
    }


}
