package com.javalessons;


public class Main11{
public static void main(String[] args) {
    // Implicit casting
    // byte > short > int > long > float > double
    short x =1;
    int y = x + 2;
    double m = 1.1;
    double n = m + 2;
    String b = "1";
    int c = Integer.parseInt(b) + 2; 
    System.out.println(y);
    System.out.println(n);
    System.out.println(c);
    }
}