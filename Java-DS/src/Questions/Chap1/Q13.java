package Ch1;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

        int n;
        System.out.print("정사각형을 출력합니다.\n변의 길이: ");
        do{
            System.out.print("n값: ");
            n = stdIn.nextInt();
        }while(n<= 0);

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        stdIn.close();
    }
}
