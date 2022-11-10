package application;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Banco{

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.print("ENTER ACCOUNT NUMBER: ");
        int number = sc.nextInt();sc.nextLine();
    

        System.out.print("ENTER ACCOUNT HOLDER: ");
        String holder = sc.nextLine();
       

        System.out.print("IS THERE AN INITIAL DEPOSIT? y/n: ");
        char option = sc.next().charAt(0);
        double deposit = 0;
        
        if(option == 'y'){
            System.out.print("ENTER INITIAL DEPOSIT VALUE: $");
            deposit = sc.nextDouble();
            conta = new Conta(number, holder, deposit);
        }
        else{
         conta = new Conta(number, holder);
        }
       
            
        System.out.println(conta);

        System.out.print("ENTER A DEPOSIT VALUE: $");
        double value = sc.nextDouble();
        conta.deposit(value);

        System.out.println(conta);

        System.out.print("ENTER A WITHDRAW VALUE: $");
        value = sc.nextDouble();
        conta.withdrawMoney(value);

        System.out.println(conta);

        sc.close();
    }
}