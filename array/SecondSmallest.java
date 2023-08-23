package array;

public class SecondSmallest {
    static int[] arr = {-2,-5,1,-7,9,4};

    static int smallest(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

//    Second smallest element
    static int secondSmallest(int[] arr){
        int min = smallest(arr);
        for(int i = 0; i < arr.length; i++){
            if(min == arr[i]){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        return smallest(arr);
    }
    public static void main(String[] args){
        int min = smallest(arr);
        System.out.println("Smallest Element: "+min);
        int minSecond = secondSmallest(arr);
        System.out.println("Second smallest element: "+minSecond);
    }
}
