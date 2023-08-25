package MIU.Extra;

public class Problem2 {
    static int f(int n){
        int rev = 0;
        while(n != 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n = n / 10;
        }
        return rev;
    }
    public static void main(String[] args){
        int n = 23;
        int s = f(n);
        System.out.println(s);

    }
}
