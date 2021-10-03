package com.javalessons;
import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.print("Input: ");
            input = scanner.next();
        } while (!input.equals("quit"));
    }
}