package recursion;

public class lastOccurence {
    public static int lastOccurenceInArray(int[] arr,int key,int i){
        if(i==-1)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return lastOccurenceInArray(arr,key,i-1);
    }

    public static void main(String[] args) {
        int[] arr = {3,5,6,7,8,3};
        int key = 2;
        System.out.println(lastOccurenceInArray(arr,key,arr.length-1));
    }
}
