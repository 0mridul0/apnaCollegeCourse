public class countingSort {
    public static int arrayMax(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
   public static void sort(int[] arr)
   {
       int[] count = new int[arrayMax(arr) + 1];
       for (int i=0;i<count.length;i++)
       {
           count[arr[i]]++;
           //arr[i] will return the element at ith index of arr and we are taking the elements as index for our new array
//           so lets assume [1,4,1,3,2,4,3,7]
//           now count[arr[2]]
//           arr[2] will be 1
//               count[1]++
//           and for us the are taking the index of our count as elements like
//              value at index 2 will represent the fequency of 2 in arr
//
//           int temp = 0;
//           for (int j=0;j<count.length;j++) {
//               if (arr[j] == i) {
//                    temp++;
//               }
//           }
//           count[i] = temp;
       }
//       printArray(count);
       int arrayPointer = 0;
       for (int i=0;i<count.length;i++)
       {
           while (count[i]>0)
           {
               arr[arrayPointer] = i;
               arrayPointer++;
               count[i]--;
           }
       }
   }
    public static void printArray(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+", ");

        }System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,4,1,3,2,4,3,7};
        sort(arr);
        printArray(arr);
    }
}
