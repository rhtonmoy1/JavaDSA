package array;
// Find the unique number in a given Array where all the elements are being repeated twice with one value being unique

public class ArrayManipulation {
    static int[] arr = {1,2,3,2,1,3,7};
    static int unique(int[] arr){
        int x = -1;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                x = arr[i];
            }
        }
        return x;
    }

    public static void main(String[] args){
        int u = unique(arr);
        System.out.println("Unique element is: "+u);
    }
}
