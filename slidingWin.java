package ytSlidingWinndow;
import java.util.*;

public class slidingWin {
    public static int[] maxSubArray(int[] arr)
    {
        int k =3;
        int wSum = 0;
        int mSum = Integer.MIN_VALUE;
//        int[] arr2 = new int[k];
        for(int i=0;i<k;i++)
        {
            wSum += arr[i];
        }
        int f = 0;
        for(int i=k;i<arr.length;i++)
        {

                wSum = wSum- arr[i - k] + arr[i];

//                mSum = Math.max(wSum, mSum);
                if(wSum>=mSum)
                {
                    mSum = wSum;
                    f=i;
                }

        }
        int[] arr2 = new int[k];
        for(int i=0;i<k;i++)
        {
            arr2[i] = arr[f-k+i];
        }
        for(int i=0;i<3;i++)
        {
            System.out.println(arr2[i]);
        }
        return arr2;
    }

    public static void main(String[] args) {
        int[] arr = {2,9,31,-4,21,7};
//        System.out.println(maxSubArray(arr));
        int[] arr2 = maxSubArray(arr);
        for(int i=0;i<3;i++)
        {
            System.out.println(arr2[i]);
        }
    }

}
