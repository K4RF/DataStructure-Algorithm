package Ch1.Question;

import java.util.Scanner;

public class Q16 {
    static void spira(int n){
        int tmp = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<tmp; j++){
                System.out.print(i);
            }
            for(int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            tmp+=2;
            System.out.println();
        }

    }
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n;

        do{
            System.out.print("몇 단 피라미드입니까?: ");
            n = stdIn.nextInt();
        }while(n<=0);

        spira(n);
        stdIn.close();
    }
}
