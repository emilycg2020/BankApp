package com.bankApp;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.start("Jerry", "BO10006789");
    }

    private static void  print(String message){
        System.out.println(message);
    }

    public void start(String name, String account){
        BankAccount bankAccount = new BankAccount(name, account);

        // Welcome to the BankApp
        print("Welcome " + name);
        print("Your current account is " + account);

        showMainMenu();
        selectOption(bankAccount);
    }

    public void showMainMenu(){
        // Main Menu
        print(System.lineSeparator());
        print("********************************");
        print("(W) Withdraw");
        print("(D) Deposit");
        print("(B) My Balance");
        print("(T) My Transactions");
        print("(E) Exit");
        print("********************************");
    }

    public void selectOption(BankAccount bankAccount){
        // Press a key to select an option try
        try (Scanner scanner = new Scanner(System.in)){
            boolean closeApp = false;
            char option;
            while (true) {
                print("Select an option: ");
                option = getSelectedOption(scanner);
                switch (option)
                {
                    case 'A':
                        showMainMenu();
                        break;
                    case 'E':
                        print("Exit...");
                        closeApp = true;
                        break;
                    case 'B':
                        print("My Balance is " + bankAccount.getBalance());
                        break;
                    case 'W':
                        withdraw(bankAccount);
                        break;
                    default:
                        print(option + " is an invalid option. Please try again...");
                        break;
                }
                if (closeApp){
                    break;
                }
                print("(A) Show all options");
            }
        }
    }

    public char getSelectedOption(Scanner scanner) {
        return scanner.nextLine().trim().toUpperCase().charAt(0);
    }

    public void withdraw(BankAccount bankAccount){
        Scanner scanner = new Scanner(System.in);
        print("Please enter the amount: ");
        double amount = scanner.nextDouble();
        bankAccount.withdraw(amount);
    }
}
