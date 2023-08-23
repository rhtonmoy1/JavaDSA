package array;

import java.util.Arrays;

public class SecondLargest {
    static int[] arr = {-2,-5,1,-7,9,4};
    static int large(int[] arr){
        Arrays.sort(arr);
        int x = Integer.MIN_VALUE;
        for(int i = 0; i <arr.length; i++){
            x = arr[arr.length -2];
        }
        return x;
    }

   //Second way
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i <arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    static int secondMax(int[] arr){
        int max = findMax(arr);
        for(int i = 0; i < arr.length; i++){
            if(max == arr[i]){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int min = findMax(arr);
        return min;
    }

    public static void main(String[] args){
        int ans = large(arr);
        System.out.println(ans);
        int max2 = secondMax(arr);
        System.out.println("Second Largest element is: "+max2);
    }
}
