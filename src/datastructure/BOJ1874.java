package datastructure;

import java.util.Scanner;
import java.util.Stack;

public class BOJ1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i =0; i<N; i++)
        {
            A[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();
        boolean no = false;
        int num = 1;
        for(int i=0; i<N; i++ )
        {
            int su = A[i];
            if(su >= num)
            {
                while(su>=num)
                {
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }
            else{
                int pop_su = stack.pop();
                if(pop_su > su)
                {
                    System.out.println("NO");
                    no = true;
                    break;
                }
                else{
                    bf.append("-\n");
                }
            }
        }
        if(!no){
            System.out.println(bf.toString());
        }


    }
}
