package Questions.Chap6;

import java.util.Scanner;

public class Q10_2 {
    static int cnt = 0;
    static void shellSort(int[] a, int n){
        int h;
        for(h = 1; h < n; h = h*3+1){
            ;
        }
        for(; h > 0; h/=3){
            for(int i = h; i < n; i++){
                int j;
                int tmp = a[i];
                for(j = i - h; j >= 0 && a[j] > tmp; j-= h){
                    a[j+h] = a[j];
                    cnt++;
                }
                a[j+h] = tmp;
                cnt++;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("셸 정렬(버전) 1");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for(int i = 0; i < nx; i++){
            System.out.print("x["+i+"]: ");
            x[i] = sc.nextInt();
        }

        shellSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i =0; i < nx; i++){
            System.out.println("x[" + i + "]= " + x[i]);
        }
        System.out.println("총 이동 횟수: " + cnt);
        sc.close();
    }
}
