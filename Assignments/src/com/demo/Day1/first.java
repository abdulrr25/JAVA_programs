package com.demo.Day1;

public class first {

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide at least 3 integer arguments.");
            return;
        }

        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < numbers[i]; j++) {
                if (numbers[i] % j == 0) {
                    for (int k = 1; k < 11; k++) {
                        System.out.println(numbers[i]+" * "+k+" = "+(numbers[i]*k));
                    }
                    System.out.println(); 
                }
            }
        }
    }
}
