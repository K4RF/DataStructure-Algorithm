package Ch01;

public class calcComplexity {
    public static void main(String[] args){
        int N = 100000;
        int cnt = 0;

        System.out.println("연산 횟수가 N일 경우");
        for(int i = 0; i < N; i++){
            System.out.println("연산 횟수: " + cnt++);
        }
        
        System.out.println("연산 횟수가 3N일 경우");
        cnt = 0;
        for(int i = 0; i < N; i++){
            System.out.println("연산 횟수: " + cnt++);
        }

        for(int i = 0; i < N; i++){
            System.out.println("연산 횟수: " + cnt++);
        }

        for(int i = 0; i < N; i++){
            System.out.println("연산 횟수: " + cnt++);
        }

        System.out.println("연산 횟수가 N^2일 경우");
        cnt = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
            System.out.println("연산 횟수: " + cnt++);
            }
        }
    }
}
