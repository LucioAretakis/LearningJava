package application;

import java.util.Scanner;

import entities.dadosAluno;

public class controleAluno {
    
    public static void main(String[] Args){

        Scanner sc = new Scanner(System.in);

        dadosAluno dadosAluno = new dadosAluno(); 

        System.out.print("MATRICULA:");
        dadosAluno.matricula = sc.nextLine();

        System.out.print("NOME DO ALUNO: ");
        dadosAluno.nome = sc.nextLine();

        System.out.print("PRIMEIRA NOTA:");
        dadosAluno.nota1 = sc.nextDouble();

        System.out.print("SEGUNDA NOTA:");
        dadosAluno.nota2 = sc.nextDouble();

        System.out.print("NOTA TRABALHO:");
        dadosAluno.notaTrabalho = sc.nextDouble();

        System.out.println(dadosAluno);
        


        
        sc.close();
    }
}
