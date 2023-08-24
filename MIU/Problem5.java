package MIU;

import java.util.Scanner;

// Write a function to return an array containing all elements common to two given arrays containing distinct positive integers.
// You should not use any inbuilt methods. You are allowed to use any number of arrays.
// The signature of the function is:
// int[] f(int[] first, int[] second)
public class Problem5 {
    static int[] f(int[] first, int[] second){
        if(first == null || second == null) return null;
        if(first.length == 0 || second.length == 0) return new int[0];
        int min =(first.length < second.length) ? first.length : second.length;
        int[] a, b;
        if(min == first.length){
            a = first;
            b = second;
        }else{
            a = second;
            b = first;
        }
        int[] c = new int[min];
        int k = 0;
        for(int i = 0; i < a.length; i++)
            for(int j = 0; j < b.length; j++)
                if(a[i] == b[j]){
                    c[k] = a[i];
                    k++;
                }

            int[] common = new int[k];
            for (int t = 0; t < common.length; t++){
                common[t] = c[t];
            }
            return common;
    }

    static void showArray(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
       int[] first = {1, 3, 7, 9};
       int[] second = {7, 1, 9, 3};
       int[] ans = f(first,second);
       showArray(ans);
    }
}
