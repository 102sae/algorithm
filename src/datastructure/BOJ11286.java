package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)->{

            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if(first_abs==second_abs){
                return o1 > o2 ? 1 : -1; //같으면 음수 우선
            }
            //절대값이 작은 데이터 우선
            //첫번째 데이터가 크면 양수, 두번째 데이터가 크면 음수 return
            return first_abs - second_abs;
        });

        for(int i = 0; i<N; i++)
        {
            int request = Integer.parseInt(br.readLine());
            if(request==0)
            {
                if(queue.isEmpty())
                {
                    System.out.println("0");

                }
                else{
                    System.out.println(queue.poll());
                }
            }
            else{
                queue.add(request);
            }
        }

    }
}
