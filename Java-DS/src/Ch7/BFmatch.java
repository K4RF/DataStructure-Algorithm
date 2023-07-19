package Ch7;

import java.util.Scanner;

public class BFmatch {
    static int bfMatch(String txt, String pat){
        int pt = 0;
        int pp = 0;

        while(pt != txt.length() && pp != pat.length()){
            if(txt.charAt(pt) == pat.charAt(pp)){
                pt++;
                pp++;
            }else{
                pt = pt - pp+1;
                pp = 0;
            }
        }
        if(pp == pat.length()){
            return pt -pp;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("텍스트: ");
        String sl = sc.next();

        System.out.print("패 턴: ");

        String sp = sc.next();

        int idx = bfMatch(sl, sp);

        if(idx == -1){
            System.out.println("텍스트에 패턴이 존재하지 않습니다.");
        }
        else{
            int len = 0;
            for(int i = 0; i<idx; i++){
                len+= sl.substring(i, i+1).getBytes().length;
            }
            len+= sp.length();

            System.out.println((idx + 1)+ "번째 문자부터 일치합니다");
            System.out.println("텍스트: " + sl);
            System.out.printf(String.format("패  턴: %%%ds\n", len), sp);
        }
        sc.close();

    }
}
