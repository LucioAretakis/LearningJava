package application;

import java.util.Scanner;

import entities.retangulo;

public class program {
    
public static void main (String[] Args){

    Scanner sc = new Scanner(System.in);

    retangulo ret = new retangulo();
    ret.width = sc.nextDouble();
    ret.height = sc.nextDouble();
    
    System.out.printf("Área: %.2f%n",ret.area());
    System.out.printf("Perímetro: %.2f%n", ret.perimetro());
    System.out.printf("Diagonal: %.2f%n", ret.diagonal());

    sc.close();
    }
}
