import java.util.*;
public class inbuiltSort {
    public static void printArray(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+", ");

        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,3,2,1,4};
        Arrays.sort(arr);
        printArray(arr);
    }
}
