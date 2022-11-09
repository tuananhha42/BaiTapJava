package assignment1;

import java.util.Scanner;

public class SavingAccount extends Account {
    private double rateInterest =0.01;
    private int term =2;
    public void calculateInterest(){
        amount = amount +amount * rateInterest * term;
    }
    public void withdraw(){}
    public void deposit(){}
    public void setRateInterest(double rateInterest) {
        this.rateInterest = rateInterest;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public double getRateInterest() {
        return rateInterest;
    }

    public int getTerm() {
        return term;
    }

    @Override
    public void deposit(double amount) {
        int m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien can gui");
        m = Integer.parseInt(scanner.nextLine());
        if(m>0){ amount = amount +m ;}
        System.out.println("So tien sau khi gui them:"+ amount);
    }

    @Override
    public void withdraw(double amount) {
        int m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien can rut");
        m = Integer.parseInt(scanner.nextLine());
        if(m>amount){
            System.out.println("Tien rut ko hop le");
        } else{
            System.out.println("So tien sau khi bi rut:"+ (amount-m));
        }

    }
}
