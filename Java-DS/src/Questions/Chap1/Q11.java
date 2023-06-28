package Questions.Chap1;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("  |  1  2  3  4  5  6  7  8  9");
        System.out.println("--+---------------------------");

        for(int i =1; i<=9; i++){
            for(int j = 0; j<=9; j++){
                if(j == 0){
                    System.out.printf(i + " |");
                }
                else{
                    System.out.printf("%3d", i*j);
                }
            }
            System.out.println();
        }
        stdIn.close();
    }
}
