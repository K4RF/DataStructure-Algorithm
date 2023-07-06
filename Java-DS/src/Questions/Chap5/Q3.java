package Questions.Chap5;

public class Q3 {
    static int gcd(int x, int y){
        if(y == 0){
            return x;
        }
        else{
            return gcd(y, x % y);
        }
    }
    static int gcdArray(int[] a){
        int gcdArr = gcd(a[0], a[1]);
        for(int i = 2; i<a.length; i++){
            gcdArr = gcd(gcdArr, a[i]);
        }
        return gcdArr;
    }
    
    public static void main(String[] args){
        int[] a = {6, 24, 4, 12, 32};

        System.out.println("최대공약수는 " + gcdArray(a) + "입니다.");
    }
}
