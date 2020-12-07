package com.company.YellowPages;

public class Company {

    //region Properties

    private String name;
    private String address;
    private int numberOfEmployees;
    private String googleMapPinLink;
    private String websiteURL;

    //endregion

    //region Constructors

    public Company() {
    }

    public Company(String name, String address, int numberOfEmployees, String googleMapPinLink, String websiteURL) {
        this.name = name;
        this.address = address;
        this.numberOfEmployees = numberOfEmployees;
        this.googleMapPinLink = googleMapPinLink;
        this.websiteURL = websiteURL;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getGoogleMapPinLink() {
        return googleMapPinLink;
    }

    public void setGoogleMapPinLink(String googleMapPinLink) {
        this.googleMapPinLink = googleMapPinLink;
    }

    public String getWebsiteURL() {
        return websiteURL;
    }

    public void setWebsiteURL(String websiteURL) {
        this.websiteURL = websiteURL;
    }

    //endregion
}
