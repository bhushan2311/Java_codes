package DSA.Stack_problems;

import java.util.*;

public class Parenthesis_checker {
    public static boolean isOpening(char c){
        return (c=='{' || c=='(' || c=='[');
    }

    public static boolean isMatching(char a,char b){
        return (a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}');
    }

    public static boolean check(String s){
        Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(isOpening(c))
                st.push(c);
            else{
                if(st.isEmpty())
                    return false;
                else if(isMatching(st.peek(),c))
                    st.pop();
                else
                    return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {

        String s = "(]";
        boolean ans = check(s);
        System.out.println(ans);
    }
}
