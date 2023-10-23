package Ch01;

import java.util.Scanner;

public class Qzero {
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n){
        for(int i =0; i < n-1; i++){
            for(int j = n-1; j>i; j--){
                if(a[j-1] > a[j]){
                    swap(a, j-1, j);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int[] arr = new int[cnt];

        System.out.println("입력할 수의 개수:");
        for(int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr, cnt);

        System.out.println("정렬 후의 결과");
        for(int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
