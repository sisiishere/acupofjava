package com.javalessons;
import java.util.Arrays;

public class Main7{
    public static void main(String[] args) {
    int[] [] numbers = {{1, 2, 3, 4}, {5, 6, 7, 8}};
    numbers[0][0] = 1;
    //Arrays.sort(numbers);
   System.out.println(Arrays.deepToString(numbers));
    }
}