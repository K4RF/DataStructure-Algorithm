package Questions.Chap1;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        System.out.print("양의 정수 입력: ");
        int n = sc.nextInt();
        int count = 0;
        do{
            n/=10;
            count++;
        }while(n!=0);
        System.out.println("그 수는 " + count+ "자리입니다.");
        sc.close();
    }
}
