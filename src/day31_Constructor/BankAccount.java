package day31_Constructor;

public class BankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

    }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: $"+balance);
    }

    public void deposit(double amount){
        if(amount<=0){
            System.err.println("Depositing amount can not be zero or negative");
            return; // exits the method
        }
        balance += amount;

    }

    public void withdraw(double amountWithdraw){
        if(amountWithdraw>balance){// if withdraw amount is greater than available balance
            System.err.println("Insufficient balance");
            return; // exits the method
        }
        if(amountWithdraw<=0){ //if withdraw amount is zero of negative
            System.err.println("Withdrawing amount can not be zero or negative");
            return;
        }
        balance -= amountWithdraw;
    }







}
/*
BankAccount Task:
        Attributes:
                1. accountHolder, 2. accountNumber, 3. balance

        Actions:
            1. setInfo(): sets the accountHolder and accountNumber attributes
            2. toString()
            3. checkBalance():displays the available balance
            2. deposit(): increases the balance by the given amount
            3. withdraw(): decreases the balance by the given amount

 */