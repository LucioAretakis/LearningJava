package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Aprovacao {

    public static void main(String[] Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student grade = new Student();
        System.out.print("PRIMEIRO SEMESTRE: ");
        grade.primeiro = sc.nextDouble();
        while(grade.primeiro > 30){
            System.out.println("Insira um valor válido");
            System.out.print("PRIMEIRO SEMESTRE: ");
            grade.primeiro = sc.nextDouble();
        }

        System.out.print("SEGUNDO SEMESTRE: ");
        grade.segundo = sc.nextDouble();
        while(grade.segundo > 35){
            System.out.println("Insira um valor válido");
            System.out.print("SEGUNDO SEMESTRE: ");
            grade.segundo = sc.nextDouble();
        }

        System.out.print("TERCEIRO SEMESTRE: ");
        grade.terceiro = sc.nextDouble();
        while(grade.terceiro > 35){
            System.out.println("Insira um valor válido");
            System.out.print("TERCEIRO SEMESTRE: ");
            grade.terceiro = sc.nextDouble();
        }

        

        if (grade.soma() >= 60){
            System.out.println("GRADE: " + grade.soma());
            System.out.println("PASS");
        }
        else{
            System.out.println("FAILED");
            System.out.println("MISSING " + grade.missing() + " POINTS");
        }
        sc.close();
    }
    
}
