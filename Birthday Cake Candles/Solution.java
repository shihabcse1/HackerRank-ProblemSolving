//Problem Link : https://www.hackerrank.com/challenges/birthday-cake-candles/problem

package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        for(int i = n-1; i >= 0; i--){
            if(arr[n-1] == arr[i]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}