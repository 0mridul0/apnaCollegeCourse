package strings;

import java.sql.SQLOutput;

public class upperCase {
    public static String tuUpperCase(StringBuilder sb)
    {
        char ch;
        ch = Character.toUpperCase(sb.charAt(0));
        sb.setCharAt(0,ch);
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)==' ')
            {
                i++;
                ch = Character.toUpperCase(sb.charAt(i));
                sb.setCharAt(i,ch);
            }
        }
        String str = sb.toString();
        return str;
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("my name is mridul");
        String str = tuUpperCase(sb);
        System.out.println(str);


    }
}
