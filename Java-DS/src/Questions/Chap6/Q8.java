package Questions.Chap6;

import java.util.Scanner;

public class Q8 {
    static void insertionSort(int[] a, int n){
        for(int i = 1; i <= n; i++){
            int j;
            a[0] = a[i];
            for(j = i; j> 0&&a[j-1]>a[0]; j--){
                a[j] = a[j-1];
            }
            a[j] = a[0];
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("단순 삽입 정렬");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx+1];

        for(int i = 1; i <= nx; i++){
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        insertionSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i =1; i <= nx; i++){
            System.out.println("x[" + (i-1) + "]= " + x[i]);
        }
        sc.close();
    }
}
