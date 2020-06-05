//Problem Link : https://www.hackerrank.com/challenges/the-power-sum/problem

package hackerrank;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x, n;
        x = sc.nextInt();
        n = sc.nextInt();
        int result = powerSum(x, n,1);
        System.out.println(result);
    }

    public static int powerSum(int sum, int power, int num){
        if((int)pow(num, power) < sum) //if pow(num, power) < sum then it's possible to get the "Sum". So .........
            return powerSum(sum, power, num+1) + powerSum(sum-(int)pow(num, power), power, num+1);
            // returning Result of any of BaseCase + powerSum(sum-pow(num,power), power, num+1)
            // Here first parameter (sum-pow(num, power)) - we are expanding the result after subtracting from sum
            // E.g : 10 = 1^2 + 3^2. So after subtract (10 - 1^2), 3^2 will remain
            // num+1 --> just increasing the number if we can do it.
        else if((int)pow(num, power) == sum)
            return 1; // Base Case : if pow(num, power) == sum then we have gotten "Sum" by one time. That's why we return 1. E.g: pow(5, 2) == 25
        else
            return 0; // Base Case : if pow(num, power) > sum then it's not possible to get the "Sum". That's why we return 0
    }
}