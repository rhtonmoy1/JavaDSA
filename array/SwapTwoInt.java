package array;

public class SwapTwoInt {
    static int a = 9;
    static int b = 3;

    static void swap(int a, int b){
        System.out.println("Before Swap a = "+a+" b = "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap a = "+a+" b = "+b);
    }

    static void noTempSwap(int a, int b){
        System.out.println("Before Swap a = "+a+" b = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap a = "+a+" b = "+b);

    }

    public static void main(String[] args){
        swap(a,b);
        noTempSwap(a,b);
    }
}
