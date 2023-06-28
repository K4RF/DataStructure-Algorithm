package Questions.Chap2;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    static void copy(int[] a, int b[]){
        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("배열 요소의 합을 구합니다.\n요소 수: ");
        int num = sc.nextInt();

        int[] a = new int[num];
        int[] b = new int[a.length];

        for(int i = 0; i <num; i++){
            System.out.print("a[" +i+ "]: ");
            a[i] = sc.nextInt();
        }
        copy(a, b);
        System.out.println("배열 a를 복사한 배열 b: " +  Arrays.toString(b));
        sc.close();
    }
}
