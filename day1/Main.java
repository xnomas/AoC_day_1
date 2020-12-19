package day1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File input = new File("input.txt");

        Scanner scanner = new Scanner(input);
        Integer integer;

        ArrayList<Integer> numbers = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();
            integer = Integer.parseInt(string);
            numbers.add(integer);
        }

        Collections.sort(numbers);
        int size = numbers.size()-1;

        long start = System.currentTimeMillis();
        for(int i = 0; i <= size/2; i++) {
            int num1 = numbers.get(i);
            for(int j = size; j >= 0; j--) {
                int num2 = numbers.get(j);
                if((num1 + num2) == 2020) {
                    int multi = num1 * num2;
                    System.out.println("Numbers: " + num1 + ", " + num2);
                    System.out.println("Multiplication: " + multi);
                    long end = System.currentTimeMillis();
                    System.out.println("Time to find numbers: " + (end - start) + " ms");
                    return;
                }
            }
        }
        scanner.close();
    }
}
