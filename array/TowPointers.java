package array;

public class TowPointers {
    static void p(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                count++;
             }
        }
     for(int i = 0; i <arr.length; i++){
         if(i < count){
             arr[i] = 0;
         }else {
             arr[i] = 1;
         }
         System.out.print(arr[i]+" ");
     }

    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1,0,0};
        p(arr);
    }
}
