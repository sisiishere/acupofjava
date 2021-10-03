package com.javalessons;


public class Main25 {
    public static void main(String[] args) {
       String[] fruits = { " Apple", "Mango", "Orange" };

       for (int i = 0; i < fruits.length; i++)
       System.out.println(fruits[i]);

       for (String fruit : fruits);
       System.out.println(fruits);
    }
}