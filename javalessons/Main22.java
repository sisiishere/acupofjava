package com.javalessons;
import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            
            input = scanner.next();
        }
    }
}