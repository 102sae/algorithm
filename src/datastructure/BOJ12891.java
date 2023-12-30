package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ12891 {
    static int [] myArr; //배열 안에 각 dna 갯스
    static int [] checkArr; //비밀번호 조건 갯수
    static char [] A; //자른 배열
    static int check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        A = new char[S];
        myArr = new int[4];
        checkArr = new int[4];
        check = 0;
        int count = 0;

        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<4; i++){
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                check++;
            }
        }

        for(int j = 0; j<P; j++){
            Add(A[j]);
        }

        if(check==4){
            count++;
        }

        //슬라이딩 윈도우
        for(int i=P; i<S; i++)
        {
            int j = i-P;
            Add(A[i]);
            Remove(A[j]);

            if(check==4){
                count++;
            }
        }

        System.out.println(count);
    }

    private static void Remove(char c) {
        switch (c){
            case 'A':
                if(myArr[0] == checkArr[0]) check--;
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1]) check--;
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2]) check--;
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3]) check--;
                myArr[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch (c){
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]) check++;
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]) check++;

                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]) check++;

                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]) check++;

                break;
        }
    }
}
