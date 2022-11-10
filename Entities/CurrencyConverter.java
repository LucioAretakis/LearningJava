package entities; 

public class CurrencyConverter {
    
    public static final double IOF = 0.06;

    public static double totalPaid(double qtd, double preco){
        return qtd * preco + (qtd * preco * IOF);

    }   
    
}
