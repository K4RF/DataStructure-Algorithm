package Question;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("n 값 입력: "); int n = sc.nextInt();
        int sum = ((1+n)*n)/2;

        System.out.println("가우스 덧셉을 활용한 1부터 " + "까지의 합은 " + sum + "입니다."); 
        sc.close();
    }
}
