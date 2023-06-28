package Questions.Chap1;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("a 값 입력: ");
        a = sc.nextInt();
        do{
            System.out.print("b 값 입력: ");
            b = sc.nextInt();
            if(b <= a){
                System.out.println("a보다 큰 값을 입력하세요");
            }
        }while(b <= a);

        System.out.println("b-a는 " + (b-a) + "입니다.");
        sc.close();
    }
}
