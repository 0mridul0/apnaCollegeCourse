package stacks;
import java.util.*;
public class balancePara {
    public static boolean checkBalance(String str)
    {
        Stack<Character> balanceStack = new Stack<>();
        char cur;
        for(int i=0;i<str.length();i++)
        {
            cur = str.charAt(i);
            if(cur == '(' || cur == '{' || cur =='[')
            {
                balanceStack.push(cur);
            }
            else {
                if(balanceStack.isEmpty())
                {
                    return false;
                }
                else if((balanceStack.peek()=='(' && cur==')') ||(balanceStack.peek()=='{' && cur=='}') ||(balanceStack.peek()=='[' && cur==']') ) {
                    balanceStack.pop();
                }
                else {
                    return false;
                }
            }
        }
        if(balanceStack.isEmpty())
        {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str = new String("({({}{})})");
        System.out.println(checkBalance(str));
    }
}
