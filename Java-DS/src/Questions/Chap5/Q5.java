package Questions.Chap5;

import java.util.Scanner;

public class Q5 {
    private static int cnt = 0;
    static void recur(int n){
        if(n > 0){
            recur(n-1);
            System.out.println(n);
            System.out.println("메서드 호출 카운트: " + ++cnt);
            recur(n-2);
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
