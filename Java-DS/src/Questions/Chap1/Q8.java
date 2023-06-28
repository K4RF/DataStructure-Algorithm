package Questions.Chap1;

import java.util.Scanner;

public class Q8 {
    static int sumof(int a, int b){
        int sum = 0;
        for(int i = a; i<= b; i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("a 값 입력: ");
        int a = sc.nextInt();
        System.out.print("b 값 입력: ");
        int b = sc.nextInt();
        if(a > b){
            int tmp;
            tmp = a;
            a = b;
            b = tmp;
        }

        System.out.println("a와 b를 포함한 a에서 b사이의 정수의 합은 " + sumof(a, b));
        sc.close();
    }
}
