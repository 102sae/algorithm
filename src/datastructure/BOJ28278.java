package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int su = Integer.parseInt(st.nextToken());
            switch (su)
            {
                case 1:
                    int X = Integer.parseInt(st.nextToken());
                    stack.push(X);
                    break;
                case 2:

                    if(!stack.isEmpty())
                    {
                        sb.append(stack.pop()).append('\n');
                    }
                    else{
                        sb.append("-1").append('\n');

                    }
                    break;
                case 3:
                    sb.append(stack.size()).append('\n');
                    break;
                case 4:
                    if(stack.isEmpty())
                    {
                        sb.append("1").append('\n');
                    }
                    else{
                        sb.append("0").append('\n');
                    }
                    break;
                case 5:
                    if(stack.isEmpty())
                    {
                        sb.append("-1").append('\n');
                    }
                    else{
                        sb.append(stack.peek()).append('\n');
                    }
                    break;
            }

        }
        System.out.println(sb);
        br.close();
    }
}
