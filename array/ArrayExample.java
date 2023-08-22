package array;

public class ArrayExample {
    int[] arr1 = {2,2,5,5,12,15,22};

    void sum(){
        int sum = 0;
        for(int i : arr1){
            sum = sum +i;
        }
        System.out.println(sum);
    }
    void sum2(){
        int sum = 0;
        for(int i = 0; i < arr1.length; i++){
            sum = sum +arr1[i];
        }
        System.out.println(sum);
    }

    void max(){
        int max = 0;
        for(int i = 0; i < arr1.length; i++){
            if(max < arr1[i]){
                max = arr1[i];
            }
        }
        System.out.println(max);
    }

    int searchX(int x){
        for(int i = 0; i < arr1.length; i ++){
            if(x == arr1[i]){
                return i;
            }
        }
        return -1;
    }

    void searchX2(int x){
        int index = -1;
        for(int i = 0; i <arr1.length; i++){
            if(x == arr1[i]){
                index = i;
                break;
            }
        }
        System.out.println("Index of x = "+ index);
    }
    void countX(int x){
        int count = 0;
        for(int i = 0; i <arr1.length; i++){
            if(x == arr1[i]){
                count++;
            }
        }
        System.out.println("Total count of x: "+count);
    }

    void lastOccurrenceX(int x){
        int index = -1;
        for(int i = arr1.length -1; i > 0; i--){
            if(x == arr1[i]){
                index = i;
                break;
            }
        }
        System.out.println("Last index of x: "+index);
    }

    void lastOccurrenceX2(int x){
        int index = -1;
        for(int i = 0; i < arr1.length; i++){
            if(x == arr1[i]){
                index = i;
            }
        }
        System.out.println("Last index of x: "+index);
    }
    void countGreaterThanX(int x){
        int count = 0;
        for(int i = 0; i < arr1.length; i ++){
            if(arr1[i] > x){
                count++;
            }
        }
        System.out.println("Elements that are greater than x are: "+count);
    }

    void sortedIncrement(){
        boolean sorted = true;
        for(int i = 1; i < arr1.length; i++){
            if(arr1[i] < arr1[i - 1] && arr1[0] > arr1[1]){
                sorted = false;
                break;
            }
        }
        System.out.println(sorted);
    }

    void sortestAndLargest() {

        int large = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > large) {
                large = arr1[i];
            }
        }
        System.out.println("largest element: " + large);
        int sort = large;
        for(int i = 0; i < arr1.length; i++){
            if (arr1[i] < sort) {
                sort = arr1[i];
            }
        }
        System.out.println("Shortest element: " + sort);
    }
    public static void main(String[] args){
        ArrayExample obj = new ArrayExample();
        obj.sum();
        obj.sum2();
        obj.max();
        System.out.println(obj.searchX(5));
        obj.searchX2(5);
        obj.countX(5);
        obj.lastOccurrenceX(5);
        obj.lastOccurrenceX2(5);
        obj.countGreaterThanX(5);
        obj.sortedIncrement();
        obj.sortestAndLargest();
    }
}
