package MIU;

import java.util.Scanner;

// Write a function that takes an array of integers as an argument and returns a value based on the sums of the even and
// odd numbers in the array. Let X = the sum of the odd numbers in the array and let Y = the sum of the even numbers.
// The function should return X – Y
// The signature of the function is:
// int f(int[ ] a)
public class Problem2 {
    static int f(int[] a){
        int n = a.length;
        int x = 0;
        int y = 0;
        for(int i = 0; i < n; i++){
            if(a[i]%2 != 0){
                x = x+a[i];
            }else if(a[i]%2 == 0){
                y = y + a[i];
            }
        }
        return x-y;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter "+l+" elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int ans = f(arr);
        System.out.println(ans);
    }
}
