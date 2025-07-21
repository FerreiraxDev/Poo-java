package lp.jv.conteudo;
import lp.jv.entities.Employee;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Employee employee = new Employee();


        System.out.println("Insert information data employee: ");
        System.out.println("Name: ");
        employee.name = sc.nextLine();
        System.out.println("Salary: ");
        employee.salary = sc.nextDouble();
        System.out.println("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println(employee);

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();

        employee.increaseSalary(percentage);
        System.out.println("Upadate data: " + employee);



        sc.close();

    }
}