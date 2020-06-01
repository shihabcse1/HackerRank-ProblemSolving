//Problem Link : https://www.hackerrank.com/challenges/plus-minus/problem

import java.util.Scanner;

public class Solution {
    static void plusMinus(int[] arr) {
        int negativeNumber = 0, positiveNumber = 0, zero = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                negativeNumber++;
            }else if(arr[i] > 0){
                positiveNumber++;
            }else{
                zero++;
            }
        }
        System.out.printf("%.6f\n", (float)positiveNumber/n);
        System.out.printf("%.6f\n", (float)negativeNumber/n);
        System.out.printf("%.6f\n", (float)zero/n);
    }
    private static final Scanner sc = new Scanner(System.in);

    static int n;

    public static void main(String[] args) {
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        plusMinus(arr);
        sc.close();
    }
}