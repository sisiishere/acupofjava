package com.javalessons;

public class Main16 {
    public static void main(String[] args) {
        int temperature = 22;
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolan isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println();
    }
}
