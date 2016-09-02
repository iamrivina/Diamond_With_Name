package com.thoughtworks;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int c, k, space;
        Scanner reader = new Scanner(System.in);
        Scanner username = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = reader.nextInt();
        System.out.print("Name : ");
        String name = username.nextLine();
        space = n - 1;

        for (k = 1; k < n; k++) {
            for (c = 1; c <= space; c++)
                System.out.print(" ");

            space--;

            for (c = 1; c <= 2 * k - 1; c++)
                System.out.print("*");

            System.out.println("");
        }
        System.out.println(name);
        space = 1;

        for (k = 1; k <= n - 1; k++)
        {
            for (c = 1; c <= space; c++)
                System.out.print(" ");

            space++;

            for (c = 1 ; c <= 2*(n-k)-1; c++)
                System.out.print("*");

            System.out.println("");
        }
    }
}