package MIU;

import java.util.Scanner;

// An array with an odd number of elements is said to be centered if all elements (except the middle one) are strictly greater than
// the value of the middle element. Note that only arrays with an odd number of elements have a middle element.
// Write a function that accepts an integer array and returns 1 if it is a centered array, otherwise it returns 0.
public class Problem1 {
    static int f(int[] arr){
        if(arr.length % 2 != 0){
            int middle = arr.length/2;
            for(int i = 0; i < arr.length; i ++){
                if(i != middle && arr[middle] >= arr[i]){
                    return 0; // If any element is not strictly smaller than the middle element, return 0
                }
            }
                return 1; // All elements are strictly smaller than the middle element
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int ans = f(arr);
        System.out.println(ans);

    }
}
