package Questions.Chap6;

import java.util.Scanner;

public class Q6 {
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void selectionSort(int[] a, int n){
        int j;
        for(int i = 0; i <n-1; i++){
            int min = i;
            for(int m = 0; m < i; m++){
                System.out.print(" ");
            }
            
            System.out.print("* ");
            
            for(j = i+1; j < n; j++){

                if(a[j] < a[min]){
                    min = j;
                }
            }
            for(int m =i+1; m<=min; m++){
                System.out.print(" ");
            }
            System.out.println("+");
            for(int m =0; m<n-1; m++){
                System.out.print(a[m] + " ");
            }
            swap(a, i, min);
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("버블정렬(버전 1)");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for(int i = 0; i < nx; i++){
            System.out.print("x["+i+"]: ");
            x[i] = sc.nextInt();
        }

        selectionSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i =0; i < nx; i++){
            System.out.println("x[" + i + "]= " + x[i]);
        }
        sc.close();
    }
}
