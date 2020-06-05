//Problem Link : https://www.hackerrank.com/challenges/compare-the-triplets/problem

import java.util.Scanner;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int aliceScore = 0, bobScore = 0;
        int[] alice = new int[3];
        int[] bob = new  int[3];
        
        for (int i = 0; i < 3; i++) { // Taking Alice's Score by user input
            alice[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) { // Taking Bob's Score by user input
            bob[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) { 
            if(alice[i] > bob[i]){ // if Alice's Score is greater than Bob then storing it in AliceScore variable.
                aliceScore++;
            }
            if(bob[i] > alice[i]){
                bobScore++;
            }
        }
        System.out.println(aliceScore+" "+bobScore); // Printing both Scores.
    }
}
