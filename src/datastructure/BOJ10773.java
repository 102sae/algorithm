package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i<K; i++)
        {
            int command = Integer.parseInt(br.readLine());
            if(command!=0)
            {
                stack.push(command);
            }
            else {
                stack.pop();
            }
        }
        int sum = 0;
        while(!stack.isEmpty())
        {
            sum += stack.pop();
        }
        System.out.println(sum);

    }
}
