package JavaMemory.ExList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println();
            System.out.println("Employee #" + i + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            while(hasId(employeeList, id)){
                System.out.print("ID already taken. Try Again: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employeeList.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int employeeID = sc.nextInt();
        Employee emp = employeeList.stream().filter(x -> x.getId() == employeeID).findFirst().orElse(null);
        if (emp == null){
            System.out.println("This employee doesnt exist!");
        } else {
            System.out.print("Insert the percentage: ");
            double percentage = sc.nextDouble();
            emp.salaryIncrease(percentage);
        }
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("Employee List:");

        for (Employee x: employeeList) {
            System.out.println(x);
        }

        sc.close();
    }
    public static boolean hasId(List<Employee> employeeList, int id) {
        Employee emp = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}

