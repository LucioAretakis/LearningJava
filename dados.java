package entities;

public class dados{
    //construtores iniciam objetos int e double com o valor 0 / 0.0, e Strings com o valor "null".
    private String name;//no caso, sem receber valores, seria "null"
    private double value;//seria 0.0
    private int quantity;//seria 0

    public dados(String name, double value, int quantity){
        this.name = name;//this serve para mostrar que se refere ao atributo do objeto, e não ao argumento.
        this.value = value;
        this.quantity = quantity;
    }

    public dados(String name, double value){
        this.name = name;
        this.value = value;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getValue(){
        return value;
    }

    public void setValue(double value){
        this.value = value;
    }
    
    public double totalValue(){
        return value * quantity;
    }
    
    public void AddProducts(int quantity){
        this.quantity += quantity;// quantity(atributo) = quantity(atributo) + quantity(parametro)

    }
    
    public void removeProducts(int quantity){//quantity(atributo) = quantity(atributo) - quantity(parametro)
        this.quantity -= quantity;

    }

    public String toString(){//substiuiu a função toString() padrão, que já vem no objetop
        return "NOME: " + name + ", VALOR: R$" + value + ", QUANTIDADE: " + quantity + ", TOTAL: R$" + totalValue(); 
    }
}