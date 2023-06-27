package Question;

public class Q3 {
    static int min4(int a, int b, int c, int d){
        int min = a;
        if(b < min)
         min = b;
        if(c < min)
         min = c;
        if(d < min)
         min = d;
        return min;
    }
    public static void main(String[] args){
        System.out.println("min4(4, 3, 2, 1) = " + min4(4, 3, 2, 1));
        System.out.println("min4(4, 3, 1, 2) = " + min4(4, 3, 1, 2));
    }
}
