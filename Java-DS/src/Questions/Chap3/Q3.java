package Questions.Chap3;

import java.util.Scanner;

public class Q3 {
    static int seqSearch(int[] a, int n, int key){
        int i = 0;
        int cnt= 0;
        while(true){
            if(i==n){
                break;
            }
            if(a[i] == key){
                cnt++;
            }
            i++;
        }
        return cnt;
    }
    static int searchIdx(int[] a, int n, int key,int[] idx){
        int cnt = 0;
        int i =0;

        a[n] = key;
        while(true){
            if( i == n){
                break;
            }
            if(a[i] == key){
                idx[i] = i;
                cnt++;
            }
            i++;
        }
        return cnt;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();

        int[] x = new int[num+1];

        for(int i = 0; i < num; i++){
            System.out.print("x[" + i +"]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값: ");
        int ky = sc.nextInt();
        int[] index = new int[num];
        int count = searchIdx(x, num, ky, index);

        System.out.println("key 값 "+ky+"의 총 개수는: "+count);
        sc.close();
    }
}
