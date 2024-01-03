package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            boolean isTrue = true;
            int result = 0;
            char [] sarray = a.toCharArray();
            for (char c : sarray) {
                if (c == '(') {
                    result += 1;
                }
                else {
                    if(result>0){
                        result -= 1;
                    }
                    else{
                        isTrue = false;
                        break;
                    }
                }
            }
            if(result!=0 )
            {
                isTrue = false;
            }
            if(isTrue){
                sb.append("YES\n");
            }
            else{
                sb.append("NO\n");
            }

        }
        System.out.println(sb);
    }
}
