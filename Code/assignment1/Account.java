package assignment1;

public abstract class Account {
    public String accountNo;
    public String ownerName;
    public double amount ;
    public String accountType;
    public void setAccountNo(String accountNo){
        this.accountNo = accountNo;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getAmount() {
        return amount;
    }

    public String getAccountType() {
        return accountType;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
