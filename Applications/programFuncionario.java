package application;

import java.util.Scanner;

import entities.funcionario;


public class programFuncionario {

    public static void main(String[] Args){
        
        Scanner sc = new Scanner(System.in);

        funcionario emp = new funcionario();
        System.out.print("NOME:");
        emp.name = sc.nextLine();
        System.out.print("SALÁRIO BRUTO: R$");
        emp.GrossSalary = sc.nextDouble();
        System.out.print("IMPOSTOS: R$");
        emp.tax = sc.nextDouble();

        System.out.println("Nome:" + emp);

        System.out.print("Qual porcentagem você quer aumentar no salário do " + emp.name+"?");
        double percentage = sc.nextDouble();
        emp.IncreaseSalary(percentage);

        System.out.println("NOME:" + emp);

        sc.close();
    }
    
}
