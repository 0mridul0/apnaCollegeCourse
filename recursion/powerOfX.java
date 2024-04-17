package recursion;

public class powerOfX {
    public static int calculatePower(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        return x*calculatePower(x,n-1);
    }
    public static int optimizedPower(int x, int n){
        if(n==0)
        {
            return 1;
        }
        int halfPow = optimizedPower(x,n/2);
        // for odd
        if(n%2!=0)
        {
            return x*halfPow*halfPow;
        }
        //for even
        if(n%2==0)
        {
            return halfPow*halfPow;
        }
        return halfPow*halfPow;
    }

    public static void main(String[] args) {
//        System.out.println(calculatePower(2,20));
        System.out.println(optimizedPower(2,20));
    }
}
