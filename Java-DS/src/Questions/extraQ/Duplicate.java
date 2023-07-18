package Questions.extraQ;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];

        for(int i = 0; i<n; i++){
            data[i] = sc.nextInt();
        }
        sc.close();

        int count = 0;  // 중복된 쌍의 개수를 체크하기 위한 변수 count
        for(int i =0; i<n; i++){
            for(int j=i+1; j<n; j++){   // i<j 경우의 값만 체크하면 되기 때문에
                if(data[i] == data[j])
                    count++;
            }
        }
        System.out.println(count);
    }
}
