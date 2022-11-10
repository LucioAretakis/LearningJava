//objetivo do programa é ler o nome do produto, quantidade em estoque e valor total, logo depois perguntar ao usuário quantos produtos ele quer add no estoque
//e após, quanto ele quer remover
package application;

import entities.dados;

import java.util.Scanner;
import java.util.Locale;

public class Estoque{

    public static void main(String[]Args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("NOME: ");
        String name = sc.nextLine();

        System.out.print("VALOR: R$");
        double value = sc.nextDouble();

        System.out.print("QUANTIDADE: ");
        int quantity = sc.nextInt();

        dados dado = new dados(name, value);

        dado.setName("computador");
        System.out.println("NOME ATUALIZADO: " + dado.getName());

        dado.setValue(1500.00);
        System.out.println("VALOR ATUALIZADO: " + dado.getValue());

        System.out.println(dado);

        System.out.print("QUANTOS PRODUTOS VOCÊ DESEJA ADICIONAR AO ESTOQUE: ");
        quantity = sc.nextInt();

        dado.AddProducts(quantity);

        System.out.println(dado);

        System.out.print("QUANTOS PRODUTOS VOCÊ DESEJA REMOVER DO ESTOQUE: ");
        quantity = sc.nextInt();

        dado.removeProducts(quantity);

        System.out.println(dado);

        sc.close();
    }

}