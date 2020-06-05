//Problem Link : https://www.hackerrank.com/challenges/plus-minus/problem

package hackerrank;

import java.util.Scanner;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int aliceScore = 0, bobScore = 0;

        int[] alice = new int[3];
        int[] bob = new  int[3];
        for (int i = 0; i < 3; i++) {
            alice[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            bob[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            if(alice[i] > bob[i]){
                aliceScore++;
            }
            if(bob[i] > alice[i]){
                bobScore++;
            }
        }
        System.out.println(aliceScore+" "+bobScore);
    }
}