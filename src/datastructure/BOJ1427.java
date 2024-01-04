package datastructure;

import java.util.Scanner;

public class BOJ1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] A = new int[str.length()];
        for(int i = 0; i<str.length(); i++){
            A[i] = Integer.parseInt(str.substring(i,i+1));
        }
        for(int i = 0; i<str.length(); i++){
            int max = i;
            for(int j = i+1; j<str.length(); j++)
            {
                if(A[max] < A[j]){
                    max = j;
                }
            }
            if(A[i] < A[max]){
                int temp = A[i];
                A[i] = A[max];
                A[max] = temp;
            }
        }
        for(int i =0; i<A.length; i++){
            System.out.print(A[i]);
        }
    }
}
