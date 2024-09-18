package com.example.project;


import java.text.DecimalFormat;


public class TipCalculator {
    static DecimalFormat formatter = new DecimalFormat("#.##");


    public static String calculateTip(int people, int percent, double cost) {
        StringBuilder result = new StringBuilder();


        double tip = cost * percent / 100;
        double totalBill = cost + tip;
        double perPersonCost = cost / people;
        double tipPerPerson = tip / people;
        double totalCostPerPerson = perPersonCost + tipPerPerson;


        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + formatter.format(cost) + "\n");
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + formatter.format(tip) + "\n");
        result.append("Total Bill with tip: $" + formatter.format(totalBill) + "\n");
        result.append("Per person cost before tip: $" + formatter.format(perPersonCost) + "\n");
        result.append("Tip per person: $" + formatter.format(tipPerPerson) + "\n");
        result.append("Total cost per person: $" + formatter.format(totalCostPerPerson) + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people =  2;
        int percent = 5;
        double cost = 29.56;
        //String items;                                      
        System.out.println(calculateTip(people,percent,cost));
    }
}
