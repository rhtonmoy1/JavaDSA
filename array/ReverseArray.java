package array;

public class ReverseArray {
    static int[] arr = {1,2,3,4,5};
    static void rev(int[] arr){
        int r;
        for(int i = arr.length -1; i > 0; i--){
            r = arr[i];
            System.out.print(r);
        }
    }

    static int[] reverseA(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for(int i = n-1; i >= 0; i--){
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }
    static void show(int arr[]){
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    static void swapInArray(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void swapInArrayNoTemp(int[]arr, int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    static void reverseBothSizeArr(int[] arr){
        int i = 0 , j = arr.length - 1;
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
        show(arr);
    }

    static void reverseBothNoTemp(int[] arr){
        int i = 0, j = arr.length - 1;
        while(i < j){
            swapInArrayNoTemp(arr,i,j);
            i++;
            j--;
        }
        show(arr);
    }

    public static void main(String[] args){
        rev(arr);
        show(reverseA(arr));
        reverseBothSizeArr(arr);
        reverseBothNoTemp(arr);
        reverseBothNoTemp(arr);
    }
}
