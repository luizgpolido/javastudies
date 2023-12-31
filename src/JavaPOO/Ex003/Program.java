package JavaPOO.Ex003;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee.toString());

        System.out.print("Which percentage to increase salary: ");
        double percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);

        System.out.println("Update data: " + employee);

        sc.close();
    }
}
