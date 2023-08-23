package array;

public class TargetSum {
    static int[] arr = {4,6,3,5,8,2};
    static int[] arr1 = {1,4,5,6,3,2};
    static int targets(int[] arr, int x){
        int ans = 0;
        for(int i = 0; i < arr.length; i++){ //1st number
            for(int j = i+1; j< arr.length; j++){ //2nd number
                if(arr[i] + arr[j] == x){ // check 1st +2nd numbers = x
                    ans++;
                }
            }
        } return ans;
    }
    static int triples(int[] arr, int x){
        int ans = 0;
        for(int i = 0; i < arr1.length; i++){ //get 1st number
            for(int j = i+1; j < arr1.length; j++){ //get 2nd number
                for(int k = j+1; k < arr1.length; k++){ // get 3rd number
                   if(arr1[i] + arr1[j] + arr1[k] == x){ //check 1st+2nd+3rd numbers = x
                       ans++;
                   }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int ansDuel = targets(arr,7);
        System.out.println(ansDuel);
        int ansTriple = triples(arr1, 12);
        System.out.println(ansTriple);
    }
}
