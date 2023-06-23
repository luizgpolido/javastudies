package JavaPOO.Ex006.main;

import JavaPOO.Ex006.assets.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the account holder: ");
        String accountName = sc.nextLine();
        System.out.print("Is there a initial deposit? (y/n)");
        String initialDeposit = sc.nextLine();
        double accountBalance = 0;

        if (initialDeposit.equals("y")){
            System.out.print("Insert your balance: ");
            accountBalance = sc.nextDouble();
        }

        Account account = new Account(accountNumber, accountName, accountBalance);
        System.out.println("Account data: ");
        System.out.println("Account " + account.getAccountNumber() + ", Holder: " + account.getAccountName() + ", Balance: $ " + String.format("%.2f%n" ,account.getAccountBalance()));

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        //account.setAccountBalance(account.getAccountBalance() + depositValue);
        account.deposit(depositValue);

        System.out.println("Account data: ");
        System.out.println("Account " + account.getAccountNumber() + ", Holder: " + account.getAccountName() + ", Balance: $ " + String.format("%.2f%n" ,account.getAccountBalance()));
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();

        while(withdrawValue > account.getAccountBalance() - 5){
            System.out.print("Insufficient money in balance, try again: ");
            withdrawValue = sc.nextDouble();
        }

        //account.setAccountBalance(account.getAccountBalance() - withdrawValue - 5);
        account.withdraw(withdrawValue);

        System.out.println("Account data: ");
        System.out.println("Account " + account.getAccountNumber() + ", Holder: " + account.getAccountName() + ", Balance: $ " + String.format("%.2f%n" ,account.getAccountBalance()));
        sc.close();

    }
}
