package Questions.Chap5;

import java.util.Scanner;

public class Q2 {
    static int gcd(int x, int y){
        int tmp;
        
        do{
            tmp = x;
            x = y;
            y = tmp%y;
        }while(x%y != 0);

        return y;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다.");

        System.out.print("정수를 입력하세요: "); int x = sc.nextInt();
        System.out.print("정수를 입력하세요: "); int y = sc.nextInt();

        System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");
        sc.close();
    }
}
