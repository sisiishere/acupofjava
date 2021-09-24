package com.javalessons;
import java.text.NumberFormat;

public class Main13{
public static void main(String[] args) {
   NumberFormat currency = NumberFormat.getCurrencyInstance();
   String result = currency.format( number): 1234567.890);
    System.out.println(result);
}
}