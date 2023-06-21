package JavaPOO.Ex004;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.nextLine();
        System.out.print("Grade 1: ");
        student.firstGrade = sc.nextFloat();
        System.out.print("Grade 2: ");
        student.secondGrade = sc.nextFloat();
        System.out.print("Grade 3: ");
        student.thirdGrade = sc.nextFloat();

        System.out.printf("Final Grade: %.2f%n" , student.finalGrade());

        if (student.finalGrade() < 60){
            System.out.println("Failed");
            System.out.printf("Missing %.2f points%n" , student.missingPoints());
        } else {
            System.out.println("Pass");
        }


    }
}
