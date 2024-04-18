package recursion;

public class tillingProblem{
    public static int tilling(int n) //2 x n is floor size
    {
        //base case
        if(n==0 || n==1)
        {
            return 1;
        }
        //vertical
        int ver = tilling(n-1);
        //horizontal
        int hor = tilling(n-2);

        return ver+hor;

    }

    public static void main(String[] args) {
        System.out.println(tilling(2));
    }
}
