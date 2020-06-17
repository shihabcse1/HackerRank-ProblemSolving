//Problem Link : https://www.hackerrank.com/challenges/picking-numbers/problem

import java.util.Scanner;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[102];
        int item, maxi = 0;
        for (int i = 1; i <= n; i++) {
            item = sc.nextInt();
            arr[item]++;
        }
        for (int i = 1; i <= n; i++) {
            maxi = Math.max(arr[i]+arr[i+1], maxi);
        }
        System.out.println(maxi);
    }
}