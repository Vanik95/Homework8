package com.company.CoffeeMachine;

public class DrinkCodeSolver {

    //region Properties
    //endregion

    //region Constructors
    //endregion

    //region Public Methods

    public boolean choosingCoffee(String drinkCode) {
        if (drinkCode.charAt(0) == 'c') {
            return true;
        } else {
            return false;
        }
    }

    public boolean choosingTea(String drinkCode) {
        if (drinkCode.charAt(0) == 't') {
            return true;
        } else {
            return false;
        }
    }

    public String settingSugarQuantity(String drinkCode) {
        switch (drinkCode.charAt(2)) {
            case '0':
                return "0";
            case '1':
                return "1";
            case '2':
                return "2";
            case '3':
                return "3";
            case '4':
                return "4";
            case '5':
                return "5";
            case '6':
                return "6";
            case '7':
                return "7";
            case '8':
                return "8";
            case '9':
                return "9";
            default:
                return "5";
        }
    }

    //endregion

    //region Getters and Setters
    //endregion
}