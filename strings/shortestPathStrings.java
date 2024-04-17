package strings;

import java.util.Map;
import java.util.Scanner;

public class shortestPathStrings {
    public static double shortestPath(String str)
    {
        int x=0;
        int y=0;
        double sp = 0;
        for (int i=0;i<str.length();i++)
        {
            char dir = str.charAt(i);
            if(dir=='N')
            {
                y++;
            }
            else if(dir == 'S')
            {
                y--;
            }
            else if(dir == 'E')
            {
                x++;
            }
            else  {
                x--;
            }
//            System.out.println(x+" "+y);
        }
        int x2 = x*x;
        int y2 = y*y;

        sp = Math.sqrt(x2+y2);
        return sp;
    }
    public static void main(String[] args) {
        String str = new String("WNEENESENNN");
        double ans = shortestPath(str);
        System.out.println(ans);
    }
}
