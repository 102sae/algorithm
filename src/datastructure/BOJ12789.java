package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stack = new Stack<>();
        int index = 1;
        int i = 0;
        boolean check = false;
        while(index < N){

            while(!check){
                if(A[i]==index){
                    index++;
                    check = true;
                }
                else if(!stack.isEmpty()){
                    if(stack.peek()==index){
                        index++;
                        stack.pop();
                        check = true;
                    }
                    else{
                        if(i<=N-1){
                            stack.push(A[i]);
                        }
                        else{
                            System.out.println("Sad");
                            break;
                        }

                    }
                }
                else {
                    stack.push(A[i]);
                }
                if(i<N-1){
                    i++;
                }
            }
            if(i==N-1 && stack.isEmpty()){
                System.out.println("Sad");
                break;
            }
            check = false;
        }
        if(stack.isEmpty()){
            System.out.println("Nice");
        }


    }
}
