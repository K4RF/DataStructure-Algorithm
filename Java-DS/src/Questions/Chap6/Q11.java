package Questions.Chap6;

import java.util.Scanner;

import Ch4.IntStack;

public class Q11 {
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void quickSort(int[] a, int left, int right){
        IntStack lstack = new IntStack(right-left+1);
        IntStack rstack = new IntStack(right - left + 1);

        lstack.push(left);
        System.out.print("lstack: ");
        lstack.dump();
        rstack.push(right);
        System.out.print("rstack: ");
        rstack.dump();
        

        while(lstack.isEmpty() != true){
            int pl = left = lstack.pop();
            System.out.print("lstack: ");
            lstack.dump();
            int pr = right = rstack.pop();
            System.out.print("rstack: ");
            rstack.dump();
            int x = a[(left+right)/2];

            System.out.printf("a[%d]~a[%d]: {", left, right);
            for(int i =left; i < right; i++){
                System.out.printf("%d ,", a[i]);
            }
            System.out.printf("%d}\n", a[right]);

            do{
                while(a[pl] < x) pl++;
                while(a[pr] > x) pr--;
                if(pl <= pr)
                    swap(a, pl++, pr--);
            }while(pl <= pr);
            if(left < pr){
                lstack.push(left);
                System.out.print("lstack: ");
                lstack.dump();
                rstack.push(pr);
                System.out.print("rstack: ");
                rstack.dump();
            }
            if(pl < right){
                lstack.push(pl);
                System.out.print("lstack: ");
                lstack.dump();
                rstack.push(right);
                System.out.print("rstack: ");
                rstack.dump();
            }
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
        quickSort(x, 0,nx-1);
        System.out.println("오름차순으로 정렬했습니다.");
        for(int i =0; i < nx; i++){
            System.out.println("x[" + i + "]= " + x[i]);
        }
        sc.close();
    }
}
