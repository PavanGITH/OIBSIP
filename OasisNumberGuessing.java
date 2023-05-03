package org.example;

import java.util.*;
import java.io.*;

public class OasisNumberGuessing {
    public static void main(String[] args) {
        Random r = new Random();

        Scanner sc = new Scanner(System.in);

        int score = 9;
        int flag = 0;
        while (true) {
            System.out.println("Press 1 if u wish to guess the number or 0 to interrupt the game!!!");
            int n = sc.nextInt();
            int i;
                if (n == 1) {
                    int random = r.nextInt(100);        //Random number generator
                    System.out.println("Hello Mam/Sir, YOU HAVE 10 ATTEMPTS TO GUESS THE NUMBER AND SCORE WILL BE CALCULATED ACCORDING TO THE NUMBER OF ATTEMPTS!!!");
                    for(int j = 0; j < 1; j++) {
                        for (i = 0; i < 10; i++) {
                            System.out.println("Enter the number in between 0 and 100 to match the Random value generated:");
                            int num = sc.nextInt();
                            if (num > random) {
                                System.out.println("Result expected is a lower number");
                                score = score - 1;
                                flag = flag + 1;
                            } else if (num < random) {
                                System.out.println("Result expected is a bigger number");
                                score = score - 1;
                                flag = flag + 1;
                            } else if (num == random) {
                                System.out.println("CONGRATS MAM/SIR,THE NUMBER YOU'VE GUESSED IS CORRECT :)");
                                score = score + 1;
                                break;
                            }
                        }
                        if(flag == 10){
                            System.out.println("SORRY YOU ARE OUT OF ATTEMPTS :(");
                        }
                        else{
                            System.out.println("Your Score is: "+score);
                        }
                    }


                } else if(n == 0){
                    break;
                }
                else{
                    System.out.println("Please enter number only either 0 or 1");
                }

        }

    }
}
