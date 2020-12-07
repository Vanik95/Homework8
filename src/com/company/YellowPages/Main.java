package com.company.YellowPages;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Company intel = new Company("Intel Corporation", "Santa Clara, California, USA", 110800, "37.38719678850222, -121.96386738230206", "www.intel.com");
        Company asus = new Company("ASUSTeK Computer Inc", "Beitou District, Taipei, Taiwan", 5831, "25.125040845420717, 121.4710419361142", "www.asus.com");
        Company nvidia = new Company("NVIDIA Corporation", "Santa Clara, California, USA", 18100, "25.081963937388643, 121.56501943071795", "www.nvidia.com");
        Company amd = new Company("Advanced Micro Devices, Inc.", "Santa Clara, California, USA", 11400, "1.8243199173314775, 103.87281181931291", "www.amd.com");
        Company apple = new Company("Apple Inc.", "1 Apple Park Way Cupertino, California, U.S", 137000, "37.335082237782856, -122.01383024421189", "www.apple.com");

        HashMap<String, Company> companies = new HashMap<>();
        companies.put("intel", intel);
        companies.put("asus", asus);
        companies.put("nvidia", nvidia);
        companies.put("amd", amd);
        companies.put("apple", apple);

        System.out.println("Enter company name.");
        Company company = companies.get(scanner.nextLine());

        System.out.println("Company name: " + company.getName());
        System.out.println("Address: " + company.getAddress());
        System.out.println("Number of employees: " + company.getNumberOfEmployees());
        System.out.println("Google map link: " + company.getGoogleMapPinLink());
        System.out.println("Website address: " + company.getWebsiteURL());

    }
}
