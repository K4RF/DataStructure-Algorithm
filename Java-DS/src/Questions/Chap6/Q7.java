package Questions.Chap6;

import java.util.Scanner;

public class Q7 {
    static void insertionSort(int[] a, int n){
        for(int i = 1; i < n; i++){
            int cnt = 0;
            for(int m =0; m<n-1; m++){
                System.out.print(a[m] + " ");
            }
            System.out.println();
            for(int m = 1; m < i; m++){
                System.out.print(" ");
            }
            int j;
            int tmp = a[i];
            for(j = i; j> 0&&a[j-1]>tmp; j--){
                a[j] = a[j-1];
                cnt++;
            }
            if(cnt != 0){
                System.out.print("^");
                for(j = i; j> 0&&a[j-1]>tmp; j--){
                
                    System.out.print("---");
                }
            }
            else
            {
                for(j = i; j> 0&&a[j-1]>tmp; j--){
                
                    System.out.print(" ");
                }
            }
            System.out.println("+");
            a[j] = tmp;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("단순 삽입 정렬");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for(int i = 0; i < nx; i++){
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        insertionSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i =0; i < nx; i++){
            System.out.println("x[" + i + "]= " + x[i]);
        }
        sc.close();
    }
}
