package JavaPOO.Ex006.assets;

public class Account {
    private int accountNumber;
    private String accountName;
    private double accountBalance;

    public Account(int accountNumber, String accountName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
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


