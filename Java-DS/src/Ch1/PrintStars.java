package Ch1;
import java.util.Scanner;
public class PrintStars {
    public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

        int n;
        
        do{
            System.out.print("n값: ");
            n = stdIn.nextInt();
        }while(n<= 0);
        int w;
        do{
            System.out.print("n값: ");
            w = stdIn.nextInt();
        }while(w<= 0 || w>n);

        for(int i = 0; i < n/w; i++){
            System.out.println("*".repeat(w));
        }
        int rest = n % w;
        if(rest != 0){
            System.out.println("*".repeat(rest));
        }
        stdIn.close();
    }
}
