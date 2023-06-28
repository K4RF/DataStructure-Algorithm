package Questions.Chap2;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    static void rcopy(int[] a, int[] b){
        for(int i = 0; i<a.length; i++){
            b[i] = a[a.length-i-1];
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();

        int[] a= new int[num];
        int[] b = new int[a.length];
        for(int i = 0; i< num; i++){
            System.out.print("a["+i+"]: ");
            a[i] = sc.nextInt();
        }

        rcopy(a, b);

        System.out.println("배열 a를 역순으로 복사했습니다.\nb = " + Arrays.toString(b));
        sc.close();
    }
}
