package Question;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값 : ");
        int n = stdIn.nextInt();

        int sum = 0;
        int i = 1;

        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("while문이 종료될 때 변수 i 값이 n+1 되는지 확인: " + i);
        System.out.println("1부터 " + "까지의 합은 " + sum + "입니다."); 
        stdIn.close();
    }
}
