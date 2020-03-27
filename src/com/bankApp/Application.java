package com.bankApp;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Application app = new Application();
        app.start();
    }

    public void start(){
        // User details
        String name = "Jerry"; String account = "BO10006789";
        // Welcome to the BankApp
        System.out.println("Welcome " + name); System.out.println("Your current account is " + account);

        showMainMenu();
    }

    public void showMainMenu(){
        // Main Menu
        System.out.println(System.lineSeparator());
        System.out.println("(W) Withdraw");
        System.out.println("(D) Deposit");
        System.out.println("(B) My Balance");
        System.out.println("(T) My Transactions");
        System.out.println("(E) Exit");
        System.out.println("");

        selectOption();
    }

    public void selectOption(){
        // Press a key to select an option try
        Scanner scanner = new Scanner(System.in);
        { char option; do {
            System.out.print("Select an option: ");
            option = (char) scanner.nextLine().trim().toUpperCase().charAt(0); switch (option)
            {
                case 'W':
                    printOption(option);
                    showMainMenu();
                    break;
                case 'D':
                    printOption(option);
                    showMainMenu();
                    break;
                case 'B':
                    printOption(option);
                    showMainMenu();
                    break;
                case 'T':
                    printOption(option);
                    showMainMenu();
                    break;
                case 'E':
                    printOption(option);
                    break; default:
                System.out.println(option + " is an invalid option. Please try again...");
                break;
            }
            System.out.println(System.lineSeparator());
        }
        while (option != 'E');
            printOption(option);
        }
    }

    public void printOption(char option){
        if(option == 'W'){
            printSingleOption(option);
            setWithdraw();
        }
        if(option == 'D'){
            printSingleOption(option);
            setDeposit();
        }
        if(option == 'B'){
            printSingleOption(option);
            getBalance();
        }
        if(option == 'T'){
            printSingleOption(option);
            printTransaction();
        }
        else if(option == 'E'){
            printSingleOption(option);
            System.out.println("Thank you!!! See you soon...");
        }
    }

    public void setWithdraw(){
        System.out.println("Withdraw successfully");
    }

    public void setDeposit(){
        System.out.println("Deposit successfully");
    }

    public double getBalance(){
        System.out.println("Your balance is: ..... $$$");
        return 100;
    }

    public void printTransaction(){
        System.out.println("Your transactions summary: XYX $$$");
    }
    public void printSingleOption(char option){
        System.out.println("Selected option: " + option);
    }
}
