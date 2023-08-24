package MIU;

import java.util.Scanner;

// Write a function to reverse an integer using numeric operators and without using any arrays or other data structures.
// The signature of the function is:
// int f(int n)
public class Problem4 {
    static int f(int n){
        int reverse = 0;
        while(n != 0){
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n/10;
        }
        return reverse;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int ans = f(number);
        System.out.println(ans);
    }
}
