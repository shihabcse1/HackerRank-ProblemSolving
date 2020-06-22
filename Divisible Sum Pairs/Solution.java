//Problem Link : https://www.hackerrank.com/challenges/divisible-sum-pairs/problem

import java.util.Scanner;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int ans = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i < j && ((arr[i] + arr[j]) % k == 0)){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}