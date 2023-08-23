package array;

//Rotate the given array 'a'  by k steps, where k is non-negative.
//Note: k can be greater than n as well


import java.util.Scanner;

public class ArrayRotateKTime {

    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        int[] ans = new int[n];
        k = k % n;
        int j = 0;
        for(int i = n-k; i < n; i++){
            ans[j] = arr[i];
            j++;
        }
        for(int i = 0; i< n-k; i++){
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }

    static void swap(int arr[], int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    static void reverse(int[] arr,int start,int end){
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void rotateInPlaceNoSpace(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        reverse(arr,0, n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
    static void show(int[] arr){
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter "+size+" elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        show(arr);
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();

//        int[] ans = rotate(arr,k);
//        show(ans);
          rotateInPlaceNoSpace(arr,k);
          show(arr);


    }
}
