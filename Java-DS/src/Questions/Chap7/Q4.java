package Questions.Chap7;

import java.util.Scanner;

public class Q4 {
    static int cnt = 0;
    static int bmMatch(String txt, String pat){
        int pt;
        int pp;
        int txtLen = txt.length();
        int patLen = pat.length();
        int k = -1;
        int[] skip = new int[Character.MAX_VALUE + 1];

        for(pt = 0; pt <= Character.MAX_VALUE; pt++){
            skip[pt] = patLen;
        }
        for(pt = 0; pt < patLen - 1; pt++){
            skip[pat.charAt(pt)] = patLen - pt - 1;
        }

        while(pt < txtLen){
            pp = patLen - 1;               // pat의 마지막 문자에 주목

			if (k == pt - pp)
				System.out.print("    ");
			else {
				System.out.printf("%2d  ", pt - pp);
				k = pt - pp;
			} 
			for (int i = 0; i < txt.length(); i++)
				System.out.print(txt.charAt(i) + " ");
			System.out.println();

			for (int i = 0; i < pt * 2 + 4; i++)
				System.out.print(" ");
			System.out.print(txt.charAt(pt) == pat.charAt(pp) ? '+' : '|');
			System.out.println();

			for (int i = 0; i < (pt-pp) * 2 + 4; i++)
				System.out.print(" ");

			for (int i = 0; i < pat.length(); i++)
				System.out.print(pat.charAt(i) + " ");
			System.out.println();
			System.out.println();
			cnt++;

			while (txt.charAt(pt) == pat.charAt(pp)) {

				if (pp == 0)
					return pt;         // 검색 성공
				pp--;
				pt--;
				if (k == pt - pp)
					System.out.print("    ");
				else {
					System.out.printf("%2d  ", pt - pp);
					k = pt - pp;
				} 
				for (int i = 0; i < txt.length(); i++)
					System.out.print(txt.charAt(i) + " ");
				System.out.println();

				for (int i = 0; i < pt * 2 + 4; i++)
					System.out.print(" ");
				System.out.print(txt.charAt(pt) == pat.charAt(pp) ? '+' : '|');
				System.out.println();

				for (int i = 0; i < (pt-pp) * 2 + 4; i++)
					System.out.print(" ");

				for (int i = 0; i < pat.length(); i++)
					System.out.print(pat.charAt(i) + " ");
				System.out.println();
				System.out.println();
				cnt++;
			}
			pt += skip[txt.charAt(pt)];
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
