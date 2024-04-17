package recursion;

public class fibonacci {
    public static int fibonacciPrint(int n)
    {
        if(n==0 || n==1) {
            return n;
        }

        int fnm1 = fibonacciPrint(n-1);
        int fnm2 = fibonacciPrint(n-2);
        int nFibo = fnm1+fnm2;
        return nFibo;
    }
    public static void main(String[] args) {
        System.out.println(fibonacciPrint(9));
    }
}
