package Questions.extraQ;
import java.util.Scanner;

public class powerMethod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two integers and press Enter");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = power(a, b);
        System.out.println("The result is " + result);
        sc.close();
    }

    public static int power(int n, int m){
        int result = 1;
        for(int i =0; i<m; i++){
            result *= n;
        }
        return result;
    }
}
