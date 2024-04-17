package recursion;

public class firstOccurence {
    public static int firstOccurenceInArray(int[] arr,int key,int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return firstOccurenceInArray(arr,key,i+1);
    }

    public static void main(String[] args) {
        int[] arr = {3,5,6,7,8,3};
        int key = 2;
        System.out.println(firstOccurenceInArray(arr,key,0));
    }
}
