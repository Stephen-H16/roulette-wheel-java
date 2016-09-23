/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roulette;

import java.util.Scanner;

/**
 *
 * @author STEPHEN HOEY
 */
public class Roulette {

    public static void main(String[] args) {
        Scanner myVal = new Scanner(System.in);
        int num = myVal.nextInt();
        
        if (num == 0) {
            System.out.println("Pocket Green");
        } else if (num >= 1 && num <= 10 && num % 2 == 0 || num >= 19 && num <= 28 && num % 2 == 0) {
            System.out.println("Pocket Black");

        } else if (num >= 1 && num <= 10 && num % 2 != 0 || num >= 19 && num <= 28 && num % 2 != 0) {
            System.out.println("Pocket Red");

        } else if (num >= 11 && num <= 18 && num % 2 == 0 || num >= 29 && num <= 36 && num % 2 == 0) {
            System.out.println("Pocket Red");

        } else if (num >= 11 && num <= 18 && num % 2 != 0 || num >= 29 && num <= 36 && num % 2 != 0) {
            System.out.println("Pocket Black");

        } else {
            System.out.println("You must enter a number between 1 and 36");
        }

    }

}
