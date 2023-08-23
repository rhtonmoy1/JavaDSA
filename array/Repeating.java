package array;

//Given an array 'a' consisting of integers. Return the first value that repeating in the array. if no value is being repeated return -1
public class Repeating {
    static int[] a = {1,5,3,4,6,3,4};
    static int repeatFirst(int[] arr){
        int repeat = -1;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j <arr.length; j++){
                if(arr[i] == arr[j]){
                    repeat = arr[i];
                    return repeat;
                }
            }
        }
        return repeat;
    }


//    Second repeating element
    static int repeatSecond(int[] arr){
        int firstRepeat = repeatFirst(arr);
        for(int i = 0; i < arr.length; i++){
            if(firstRepeat == arr[i]){
                arr[i] = -1;
                break;
            }
        }
        return repeatFirst(arr);
    }

    public static void main(String[] args){
        int first = repeatFirst(a);
        System.out.println("First repeating element is: "+first);
        int second = repeatSecond(a);
        System.out.println("Second repeating element is: "+second);
    }
}
