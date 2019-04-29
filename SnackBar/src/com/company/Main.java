package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        class Snack {
            String id;
            String name;
            int quantity;
            double cost = 0.0;
            String vendID;

            public void setID (String id){
                this.id = id;
            }

            public String getID(){
                return this.id;
            }

            public void setName (String name){
                this.name = name;
            }

            public String getName(){
                return this.name;
            }

            public void setCost (double cost){
                this.cost = cost;
            }

            public double getCost(){
                return this.cost;
            }

            public void setQuantity(int q){
                this.quantity = q;

            }

            public int getQuantity(){
                return this.quantity;
            }

            // Yes, I know you're supposed to make a add, buy, and total method.
            // This is just too much.

            public double purchase(int quantity, double money){
                if(quantity <= this.quantity){
                    System.out.println("You are buying " + quantity + " " + this.name);
                    double change = money - (this.cost * quantity);
                    System.out.println("Thank You! Here is your change: $" + change);
                    return change;
                } else {
                    System.out.println("There are no more " + this.id + "s");
                    return 0;
                }

            }

        }


        class VendingMachine {
            String vID;
            String name;

            public void setID (String id){
                this.vID = id;
            }

            public String getID(){
                return this.vID;
            }

            public void setName (String name){
                this.name = name;
            }

            public String getName(){
                return this.name;
            }

        }


        class Customer {
            String id;
            String name;
            double cash;

            public void setID (String id){
                this.id = id;
            }

            public String getID(){
                return this.id;
            }

            public void setName (String name){
                this.name = name;
            }

            public String getName(){
                return this.name;
            }

            public void setCash (double cash){
                this.cash = cash;
            }

            public double getCash(){
                return this.cash;
            }

            public void purchase(int quantity, Snack snack) {
                setCash(snack.purchase(quantity, this.cash));

            }
        }

        Customer Jane = new Customer();
        Customer Bob = new Customer();

        Jane.setCash(45.25);
        Bob.setCash(33.14);

        VendingMachine Food = new VendingMachine();
        VendingMachine Drink = new VendingMachine();
        VendingMachine Office = new VendingMachine();

        Food.setID("Food");
        Food.setName("Food");

        Drink.setID("Drink");
        Drink.setName("Drink");

        Office.setID("Office");
        Office.setName("Office");

        Snack Chips = new Snack();
        Snack ChocBar = new Snack();
        Snack Pretzel = new Snack();
        Snack Soda = new Snack();
        Snack Water = new Snack();

        Chips.setID(Food.getID());
        Chips.setName("Chips");
        Chips.setCost(1.75);
        Chips.setQuantity(36);

        ChocBar.setID(Food.getID());
        ChocBar.setName("Chocolate Bar");
        ChocBar.setCost(1.00);
        ChocBar.setQuantity(36);

        Pretzel.setID(Food.getID());
        Pretzel.setName("Pretzel");
        Pretzel.setCost(2.00);
        Pretzel.setQuantity(30);

        Soda.setID(Drink.getID());
        Soda.setName("Soda");
        Soda.setCost(2.50);
        Soda.setQuantity(24);

        Water.setID(Drink.getID());
        Water.setName("Water");
        Water.setCost(2.75);
        Water.setQuantity(20);




        Jane.purchase(3, Chips);
        Jane.purchase(3, ChocBar);
        Bob.purchase(2, Chips);
    }
}
