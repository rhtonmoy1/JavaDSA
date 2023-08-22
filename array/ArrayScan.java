package array;

import java.util.Scanner;

public class ArrayScan {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i = 0; i <arr.length; i ++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The new elements of array are: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
