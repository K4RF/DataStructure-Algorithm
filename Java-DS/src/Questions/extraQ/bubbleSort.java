package Questions.extraQ;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];

        for(int i =0; i<n;i++){     // 배열에 값 대입
            data[i] = sc.nextInt();
        }
        sc.close();

        for(int i =n-1; i>0;i--){
            for(int j =0; j<i; j++){
                if(data[j] > data[j+1]){    //data[j] > data[j+1]이면 둘의 데이터 값을 교환
                    int tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
            }
        }
        System.out.print("Sorted data: ");
        for(int i=0; i<n; i++){
            System.out.print(data[i]+ " ");
        }
        System.out.println();
    }
}
