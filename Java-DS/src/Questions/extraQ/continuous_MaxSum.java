package Questions.extraQ;
import java.util.Scanner;

public class continuous_MaxSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for(int i=0; i<n; i++){
            data[i] = sc.nextInt();
        }
        sc.close();

        int maxSum = 0;
        for(int i =0; i<n; i++){
            int sum=0; // sum 값 0으로 초기화
            for(int j=i; j<n; j++){ // 시작점과 끝점을 같게 하여 구간이 1로 시작하여 길이가 j인 구간까지 생성                    
                sum += data[j];
                if(sum > maxSum){     // sum이 현재까지의 최댓값보다 크다면 최대값에 sum 대입
                    maxSum = sum;
                }
            }
        }
        System.out.println("The Max Sum is " + maxSum);
    }
}
