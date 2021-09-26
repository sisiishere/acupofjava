package com.javalessons;

public class Main16 {
    public static void main(String[] args) {
        int temperature = 22;
        boolean isMildAndBreezy = temperature > 20 && temperature < 30;
        boolean isCold = temperature <= 20;
        boolean isHot = temperature >= 30;
        System.out.println(isMildAndBreezy);
    }
}
