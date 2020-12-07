package com.company.CoffeeMachine;

public class Command {

    //region Properties

    private String drinkCode;

    //endregion

    //region Constructors

    public Command() {
    }

    public Command(String drinkCode) {
        this.drinkCode = drinkCode;
    }

    //endregion

    //region Public Methods
    //endregion

    //region Getters and Setters

    public String getDrinkCode() {
        return drinkCode;
    }

    public void setDrinkCode(String drinkCode) {
        this.drinkCode = drinkCode;
    }

    //endregion
}
