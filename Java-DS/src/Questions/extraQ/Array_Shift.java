package Questions.extraQ;
import java.util.Scanner;

public class Array_Shift{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data= new int[n];

        for(int i=0; i<n; i++)
            data[i] = sc.nextInt();
        sc.close();

        int tmp = data[n-1];
        for(int i=n-2; i>=0; i--){  // 끝에서 두번째부터 시작하므로 i=n-2부터 시작해서 하나씩 줄여나감
            data[i+1] = data[i];
        }
        data[0] = tmp;

        for(int i=0; i<n; i++){
            System.out.println(data[i]);
        }
    }
}
