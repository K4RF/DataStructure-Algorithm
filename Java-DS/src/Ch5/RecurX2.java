package Ch5;
import java.util.Scanner;

import Ch4.IntStack;

public class RecurX2 {
    static void recur(int n){
        IntStack s = new IntStack(n);

        while(true){
            if(n>0){
                s.push(n);
                n=n-1;
                continue;
            }
            if(s.isEmpty() != true){
                n = s.pop();
                System.out.println(n);
                n = n-2;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int x = sc.nextInt();

        recur(x);

        sc.close();
    }
}
