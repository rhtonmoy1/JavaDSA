package MIU;

import java.util.Scanner;

// Write a function that accepts a character array, a zero-based start position and a length.
// It should return a character array containing containing lengthcharacters starting with the startcharacter of the input array.
// The function should do error checking on the start position and the length and return null if the either value is not legal.
// The function signature is:
// char[ ] f(char[ ] a, int start, int len)
public class Problem3 {

    static char[ ] f(char[ ] a, int start, int len){
        int l = a.length;
        char[] ans = new char[len];
        if(start < 0 || start >= l || len < 0 || start + len >l){
            return null;
        }
        int k = 0;
        for(int i = start; i < start+len; i++){
            ans[k] = a[i];
            k++;
        }
        return ans;
    }

    static void showArray(char[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c'};
        int start = 0;
        int len = 3;
        char[] ans = f(arr, start, len);

        if (ans != null) {
            showArray(ans);
        } else {
            System.out.println("null");
        }
    }
}
