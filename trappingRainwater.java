public class trappingRainwater {
    static int waterStored(int[] rainWater, int[] leftMax,int[] rightMax)
    {
        int[] waterAmt = new int[rainWater.length];
        int waterSum = 0;
        for(int i=0;i<rainWater.length;i++)
        {
            int water;
            if(leftMax[i]<rightMax[i])
            {
                water = leftMax[i] - rainWater[i];
            }
            else {
                water = rightMax[i] - rainWater[i];
            }
            waterAmt[i] = water;
            waterSum = waterSum + waterAmt[i];
        }


        return waterSum;
    }
    public static void main(String[] args) {
//        int[] rainWater = new int[7];
       int[] rainWater = {4,2,0,6,3,2,5};
       int[] leftMax = new int[rainWater.length];
       int[] rightMax = new int[rainWater.length];
        int max = rainWater[0];
//        System.out.println(rainWater.length);
       for(int i=0;i<leftMax.length;i++)
       {
           if(rainWater[i]>=max)
           {
               max = rainWater[i];
           }
           leftMax[i] = max;
       }
       max = rainWater[rainWater.length-1];
        for(int i=rightMax.length-1;i>=0;i--)
        {
            if(rainWater[i]>=max)
            {
                max = rainWater[i];
            }
            rightMax[i] = max;
        }
        System.out.println("the ammount of water collected is : " + waterStored(rainWater,leftMax,rightMax));

    }
}
