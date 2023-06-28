package Questions.Chap2;

import java.util.Scanner;

public class Q3 {
    static int sumOf(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("배열 요소의 합을 구합니다.\n요소 수: ");
        int num = sc.nextInt();

        int[] a = new int[num];

        for(int i = 0; i <num; i++){
            System.out.print("a[" +i+ "]: ");
            a[i] = sc.nextInt();
        }

        System.out.println("모든 요소들의 합: " + sumOf(a));
        sc.close();
    }
}
