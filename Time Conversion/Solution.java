//Problem Link : https://www.hackerrank.com/challenges/time-conversion/problem

import java.util.Scanner;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String time = sc.nextLine();
        sc.close();

        int hour = Integer.parseInt(time.substring(0,2));
        int minute = Integer.parseInt(time.substring(3,5));
        int second = Integer.parseInt(time.substring(6,8));
        String meridiem = time.substring(8,10);

        if(meridiem.equals("PM") && hour != 12){
            hour += 12;
        }
        if (meridiem.equals("AM") && hour == 12){
            hour = 0;
        }
        System.out.printf("%02d:%02d:%02d", hour, minute, second);
    }
}