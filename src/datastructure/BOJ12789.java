package datastructure;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        int index = 1;

        while(!queue.isEmpty())
        {
            if(queue.peek() == index)
            {
                queue.poll();
                index++;
            }
            else if(!stack.isEmpty() && stack.peek() == index)
            {
                stack.pop();
                index++;
            }
            else{
                stack.push(queue.poll());
            }
        }
        while(!stack.isEmpty())
        {
            if(stack.peek() == index)
            {
                stack.pop();
                index++;
            }
            else{
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
    }
    }