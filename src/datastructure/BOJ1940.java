package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        for (int i =0; i<N; i++)
        {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(A);
        int count = 0;
        int i = 0;
        int j = N-1;
        int sum = 0;
        while(i<j){
            sum = A[i]+A[j];
                if(sum < M){
                    i++;
                }
                else if(sum > M)
                {
                    j--;
                }
                else{
                    count++;
                    i++;
                    j--;
                }
        }
        System.out.println(count);
    }
}
