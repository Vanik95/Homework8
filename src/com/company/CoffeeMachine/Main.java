package com.company.CoffeeMachine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter drink code.");
        Command command = new Command(scanner.nextLine());
        DrinkCodeSolver compiler = new DrinkCodeSolver();
        Coffee coffee = new Coffee();
        coffee.setName("Coffee");
        Tea tea = new Tea();
        tea.setName("Tea");

        if (compiler.choosingCoffee(command.getDrinkCode())) {
            coffee.setSugarQuantity(compiler.settingSugarQuantity(command.getDrinkCode()));
            System.out.println("Drink name - " + coffee.getName() + ", sugar quantity - " + coffee.getSugarQuantity());
        } else if (compiler.choosingTea(command.getDrinkCode())) {
            tea.setSugarQuantity(compiler.settingSugarQuantity(command.getDrinkCode()));
            System.out.println("Drink name - " + tea.getName() + ", sugar quantity - " + tea.getSugarQuantity());
        } else {
            System.out.println("Wrong code.");
        }

    }
}
