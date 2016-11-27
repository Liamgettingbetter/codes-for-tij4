package practice.holding;

import java.util.Stack;

/**
 * Created by Liam on 27/11/2016.
 */
public class Practice15 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        char[] strings = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s".toCharArray();

        for(int i = 0; i < strings.length; i++) {
            if(strings[i] == '+')
                stack.push(strings[++i]);
            else if(strings[i] == '-')
                System.out.print(stack.pop());
        }
    }
}
