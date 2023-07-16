package Questions.Chap6;

import java.util.Scanner;

public class Q14 {
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static int sort3elem(int[] x, int a, int b, int c){
        if(x[b] < x[a]) swap(x, b, a);
        if(x[c] < x[b]) swap(x, c, b);
        if(x[b] < x[a]) swap(x, b, a);

        return b;
    }

    static void quickSort(int[] a, int left, int right){
        if(left - right < 9){
            insertionSort(a, left, right);
        }
        int pl = left;
        int pr = right;
        int m = sort3elem(a, pl, (pr+pl)/2, pr);
        int x = a[m];

        swap(a, m, right-1);
        pl++;
        pr-=2;

        do{
            while(a[pl] < x) pl++;
            while(a[pr] > x) pr--;
            if(pl <= pr)
                swap(a, pl++, pr--);
        }while(pl <= pr);
        if(left < pr){
            quickSort(a, left, pr);
        }
        if(pl < right){
            quickSort(a, pl, right);
        }
    }
    static void qSort(int[] x, int n){
            quickSort(x, 0,n-1);
    }

    static void insertionSort(int[] a, int left, int right) {
		for (int i = left + 1; i <= right; i++) {
			int tmp = a[i];
			int j;
			for (j = i; j > left && a[j - 1] > tmp; j--)
				a[j] = a[j - 1];
			a[j] = tmp;
		}
	}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("배열을 나눕니다.");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for(int i = 0; i< nx; i++){
            System.out.print("x[" + i+ "]: ");
            x[i] = sc.nextInt();
        }
        qSort(x, nx);
        System.out.println("오름차순으로 정렬했습니다.");
        for(int i =0; i < nx; i++){
            System.out.println("x[" + i + "]= " + x[i]);
        }
        sc.close();
    }
}
