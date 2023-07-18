package Questions.extraQ;
import java.util.Scanner;

public class orderedList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] data = new int[n];

        for(int i=0; i<n; i++){
            int tmp = sc.nextInt();

            int j=i-1;
            while(j>=0 && data[j] > tmp){   // tmp의 값이 data[j]의 값 보다 작으면 data[j]가 한 칸 시프트
                data[j+1] = data[j];
                j--;
            }
            data[j+1]=tmp;  // 뒤에서부터 찾은 tmp의 배열 인덱스 번호 j+1에 tmp 저장
            for(int k=0; k<=i; k++){
                System.out.print(data[k] + " ");

            }
            System.out.println();
        }
        sc.close();
    }
}
