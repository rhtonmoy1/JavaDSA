package MIU;

// Consider an array A with n of positive integers. An integer idx is called a POE (point of equilibrium) of A,
// if A[0] + A[1] + … + A[idx – 1] is equal to A[idx + 1] + A[idx + 2] + … + A[n – 1].
// Write a function to return POE of an array, if it exists and -1 otherwise.
// The signature of the function is:
// int f(int[] a)
public class Problem6 {
    static int f(int[] a) {
        if (a.length < 3) return -1;
        int i = 0;
        int j = a.length - 1;
        int idx = 1;
        int leftSum = a[i];
        int rightSum = a[j];
        for (int k = 1; k < a.length - 2; k++)
        {
            if (leftSum < rightSum)
            {
                i++;
                leftSum += a[i];
                idx = i + 1;
            }
            else
            {
                j--;
                rightSum += a[j];
                idx = j - 1;
            }
        }
        if (leftSum == rightSum)
            return idx;
        else
            return -1;
    }



    public static void main(String[] args){
        int[] a = {1, 8, 3, 7, 10, 2};
        int ans = f(a);
        System.out.println(ans);
    }
}

