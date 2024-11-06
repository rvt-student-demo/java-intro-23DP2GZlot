package lv.rvt;

public class Account {
    private double balance;
    private String owner;

    public Account(String owner, double balance){
        this.balance = balance;
        this.owner = owner;
    }
    public void withdraw(double amount){
        this.balance = this.balance - amount;

    }
    public void deposit(double amount){
        this.balance = this.balance + amount;
        
    }
    public double balance(){
        return this.balance;
    }
    public String toString(){
        return this.owner + "balance: " + this.balance;

    }



}
