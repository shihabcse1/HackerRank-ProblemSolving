//Problem Link : https://www.hackerrank.com/challenges/diagonal-difference/problem

import java.util.Scanner;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    public static void main(String[] args) {
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int result = diagonalDifference(arr);
        System.out.println(result);
    }
    public static int diagonalDifference(int[][] arr){
        int primaryDiagonalSum = 0, secondaryDiagonalSum = 0;
        for(int i = 0; i < n; i++){
            primaryDiagonalSum += arr[i][i]; // Adding the element of Primary Diagonal
            secondaryDiagonalSum += arr[i][n-1-i]; // Adding the element of Secondary Diagonal
        }
        return (Math.abs(primaryDiagonalSum - secondaryDiagonalSum));
    }
}