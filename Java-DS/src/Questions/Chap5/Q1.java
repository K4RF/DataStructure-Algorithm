package Questions.Chap5;

import java.util.Scanner;

public class Q1 {
    static int factorial(int n){
        int cnt = 1;
        for(int i = 1; i <=n; i++){
            cnt =cnt*i;
        }

        return cnt;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int x = sc.nextInt();

        System.out.println(x+"의 팩토리얼은 " +factorial(x)+"입니다.");
        sc.close();
    }




}
