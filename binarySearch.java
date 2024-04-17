package ytSlidingWinndow;

public class binarySearch {
    public static int binSearch(int[] arr,int key)
    {
        int res = -1;
        int l = 0;
        int r = arr.length-1;
        int m;
        while (l<=r)
        {
            m = (l+r)/2;
            if(arr[m]==key)
            {
                return m;
            } else if(key>arr[m]){
                l=m;
            } else if (key<arr[m]) {
                r=m;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,6,7,10};
        System.out.println(binSearch(arr,6));
    }
}
