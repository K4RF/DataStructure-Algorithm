package Questions.extraQ;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class fileInput {
    public static void main(String[] args){
        String[] name = new String[1000];
        String[] number = new String[1000];
        int n =0;
        String fileName = "input.txt";
        try{
            Scanner inFile = new Scanner(new File(fileName));
            while(inFile.hasNext()){
                name[n] = inFile.next();
                number[n] = inFile.next();
                n++;
            }

            inFile.close();
        }catch(FileNotFoundException e){
            System.out.println("No FIle");
            System.exit(9);
        }
        for(int i =0; i<n; i++){
            System.out.println(name[i]+": " + number[i]);
        }
    }
}
