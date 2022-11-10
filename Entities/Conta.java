package entities;

public class Conta {

    private int accountNumber;
    private String accountHolder;
    private double balance;


    public Conta(int accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public Conta(int accountNumber, String accountHolder, double intitialBalance){//construtor vai receber como argumento o valor do depósito inicial, e o método deposit vai adiciona-lo na conta
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(intitialBalance);
    }

    public String getAccountHolder(){
        return accountHolder;
}
    public  void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    
    public double getBalance() {
        return balance;
    }
    
    
    public void deposit(double amount){
        balance += amount;
    }

    public void withdrawMoney(double amount){
         balance -= amount +  5;
    }

    public String toString(){
        return "ACCOUNT NUMBER: " + accountNumber + ", ACCOUNT HOLDER: " + accountHolder + ", BALANCE: $" + String.format("%.2f", balance);
    }
}
