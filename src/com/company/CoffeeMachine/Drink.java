package com.company.CoffeeMachine;

public class Drink {

    //region Properties

    private String name;
    private String sugarQuantity;

    //endregion

    //region Constructors

    public Drink() {
    }

    public Drink(String name, String sugarQuantity) {
        this.name = name;
        this.sugarQuantity = sugarQuantity;
    }

    //endregion

    //region Public Methods
    //endregion

    //region Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSugarQuantity() {
        return sugarQuantity;
    }

    public void setSugarQuantity(String sugarQuantity) {
        this.sugarQuantity = sugarQuantity;
    }

    //endregion
}
