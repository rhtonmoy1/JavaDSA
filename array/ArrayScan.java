package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScan {

    static void sort(int[] arr){
        System.out.println("Sorted array: ");
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] smallestLargest(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length -1]};
        return ans;
    }
    static int kSmallest(int[] arr, int k){
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(k == arr[i]){
                index = i;
                break;
            }
        }
        return index;
    }
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
        System.out.println();
        sort(arr);
        int[] ans = smallestLargest(arr);
        System.out.println("smallest: "+ans[0]);
        System.out.println("Largest: "+ans[1]);
        int kIndex = kSmallest(arr, 5);
        System.out.println("K element index: "+kIndex);
    }
}
