package com.java;

class Mobile {
    protected String brand = "Mi";

    public Mobile() { //an empty constructor
    }

    public void honk() {
        System.out.println("Welcome to the com.java.Mobile World");
    }
}

class Redmi extends Mobile {
    private String modelName = "com.java.Redmi k 20 pro";

    public Redmi() {  //an empty constructor
    }

    public String getModelName() {  //to get the value of private modelName variable
        return modelName;
    }
}

class Main {
    public static void main(String[] args) {
        Redmi myObj = new Redmi();
        myObj.honk();
        System.out.println(myObj.brand + " " + myObj.getModelName());
    }
}