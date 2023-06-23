package JavaPOO.Ex006.assets;

public class Account {
    private int accountNumber;
    private String accountName;
    private double accountBalance;

    public Account(int accountNumber, String accountName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = initialBalance;
    }

    public Account(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }



    public String getAccountName() {
        return accountName;
    }


    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount){
        accountBalance += amount;
    }

    public void withdraw(double amount){
        accountBalance -= amount - 5;
    }


/*
    @Override
    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + accountName
                + ", Balance: "
                + String.format("%.2f%n" , accountBalance);
    }

 */
}


