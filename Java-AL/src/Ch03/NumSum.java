package Ch03;

import java.util.Scanner;

public class NumSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        String num;
        num = sc.next();
        int sum = 0;
    
        for(int i =0; i < N; i++){
        sum += num.charAt(i) - '0';
        }
        System.out.println(sum);
        sc.close();
    }
}