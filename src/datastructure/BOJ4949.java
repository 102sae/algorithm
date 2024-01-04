package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        boolean is_balance;
        char [] A;
        while(true){
            String str = br.readLine();
            A = str.toCharArray();
            is_balance = true;
            stack.clear();
            if (A[0] == '.') break;
            for(int i=0; i<str.length(); i++)
            {
                if(A[i] == '('){
                    stack.push('(');
                }
                else if(A[i] == ')'){
                    if(stack.isEmpty()){
                        is_balance = false;
                        break;
                    }
                    else {
                        char c = stack.peek();
                        if (c=='['){
                            is_balance = false;
                            break;
                        }
                        stack.pop();
                    }
                }
                else if(A[i] == '['){
                    stack.push('[');
                }
                else if(A[i] == ']'){
                    if(stack.isEmpty()){
                        is_balance = false;
                        break;
                    }
                    else {
                        char c = stack.peek();
                        if (c=='('){
                            is_balance = false;
                            break;
                        }
                        stack.pop();
                    }
                }
                else {
                    continue;
                }
            }
            if(!stack.isEmpty())
            {
                is_balance = false;
            }
            if(is_balance){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
