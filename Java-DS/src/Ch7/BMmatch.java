package Ch7;

import java.util.Scanner;

public class BMmatch {
    static int bmMatch(String txt, String pat){
        int pt;
        int pp;
        int txtLen = txt.length();
        int patLen = pat.length();
        int[] skip = new int[Character.MAX_VALUE + 1];

        for(pt = 0; pt <= Character.MAX_VALUE; pt++){
            skip[pt] = patLen;
        }
        for(pt = 0; pt < patLen - 1; pt++){
            skip[pat.charAt(pt)] = patLen - pt - 1;
        }

        while(pt < txtLen){
            pp = patLen - 1;

            while(txt.charAt(pt) == pat.charAt(pp)){
                if(pp == 0){
                    return pt;
                }
                pp--;
                pt--;
            }
            pt += (skip[txt.charAt(pt)] > patLen - pp)? skip[txt.charAt(pt)]: patLen - pp;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("텍스트: ");
        String sl = sc.next();

        System.out.print("패 턴: ");

        String sp = sc.next();

        int idx = bmMatch(sl, sp);

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
