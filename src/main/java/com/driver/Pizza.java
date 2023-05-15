package com.driver;

public class Pizza {

    private int price;
    private int totalPrice;
    private Boolean isVeg;
    private String bill = "";
    private int extraCheese;
    private int extraToppings;
    private int paperBag;

    public void setVeg(Boolean veg) {
        this.isVeg = veg;
    }

    Boolean cheeseAdded = false;
    Boolean toppingsAdded = false;
    Boolean bagAdded = false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            totalPrice += price;
        }
        else {
            this.price = 400;
            totalPrice += price;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        extraCheese += 80;
        cheeseAdded = true;

        totalPrice += extraCheese;
        cheeseAdded = true;
    }


    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            extraToppings += 70;
            totalPrice += extraToppings;
            toppingsAdded = true;
        }
        else {
            extraToppings += 120;
            totalPrice += extraToppings;
            toppingsAdded = true;
        }
    }


    public void addTakeaway(){
        // your code goes here
        bagAdded = true;
        paperBag += 20;

        totalPrice += paperBag;
    }

    public String getBill(){
        // your code goes here
        System.out.println("Base Price Of The Pizza: " + this.price);

        if(cheeseAdded)    System.out.println("Extra Cheese Added: "+ extraCheese);

        if(toppingsAdded)  System.out.println("Extra Toppings Added: " + extraToppings);

        if(bagAdded)       System.out.println("Paperbag Added: "+ paperBag);

        bill += totalPrice;
        System.out.print("Total Price: ");

        return this.bill;
    }
}

  /*

        Extra Toppings Added: 70
        Paperbag Added: 20
        Total Price: 470
*/