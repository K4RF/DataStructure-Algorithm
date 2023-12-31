package Ch2;

import java.util.Scanner;

public class MaxOfArray {
    static int maxOf(int [] a){
        int max = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("키의 최댓값을 구합니다.\n사람 수: ");
        int num = sc.nextInt();

        int[] height = new int[num];

        for(int i = 0; i <num; i++){
            System.out.print("height[" +i+ "]: ");
            height[i] = sc.nextInt();
        }

        System.out.println("최댓값: " +maxOf(height));
        sc.close();
    }
}
