package Questions.Chap6;

import java.util.Scanner;

public class Q4 {
    static int cnt = 0;
    static int lcnt = 0;
    static void swap(int[] a, int idx1, int idx2){
        for(int m = 0; m <= idx1; m++){
                        System.out.print(a[m]+ " ");
        }
        System.out.print("+ ");
        System.out.print(a[idx2]+ " ");
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
        cnt++;
    }

    static void bubbleSort(int[] a, int n){
        int k = 0;
        int pass = 1;
        while(k < n-1){
            System.out.println("패스 " + pass + ": ");
            pass++;
            int last = n-1;
            for(int j = n-1; j > k; j--)
                if(a[j-1]  > a[j]){
                    swap(a, j-1, j);
                    last = j;
                    for(int m = j+1; m<=n-1; m++){
                        System.out.print(a[m] + " ");
                    }
                    System.out.println();
                }else{
                    for(int m = 0; m <= j-1; m++){
                        System.out.print(a[m]+ " ");
                    }
                    System.out.print("- ");
                    for(int m = j; m<=n-1; m++){
                        System.out.print(a[m] + " ");
                    }
                    System.out.println();
                }
                lcnt++;                    
            k = last;           
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

        bubbleSort(x, nx);

        System.out.println("비교를 " + lcnt + "회 했습니다.\n교환을 " + cnt + "회 했습니다.");
        sc.close();
    }
}
