package application;

import java.util.Scanner;
import java.util.Locale;

import entities.CurrencyConverter;

public class Cambio {

    public static void main(String[] Args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Cotação dolar: R$");
        double cotacao = sc.nextDouble();

        System.out.print("Quantidade desejada: $");
        double qtd = sc.nextDouble();

        System.out.printf("Valor a pagar em reais: R$%.2f", CurrencyConverter.totalPaid(cotacao, qtd));

        
        sc.close();
    }
    
}
