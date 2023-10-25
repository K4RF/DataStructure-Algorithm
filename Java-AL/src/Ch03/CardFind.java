package Ch03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CardFind {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();

        int N = sc.nextInt();
        for(int i = 0; i <= N; i++){
            myQueue.add(i);
        }

        while(myQueue.size() > 1){
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }
        System.out.println(myQueue.poll());

        sc.close();
    }
}
