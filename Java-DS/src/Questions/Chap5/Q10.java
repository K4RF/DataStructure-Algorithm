package Questions.Chap5;

public class Q10 {
    static boolean[] flag_a = new boolean[8];
    static boolean[] flag_b = new boolean[15];
    static boolean[] flag_c = new boolean[15];

    static int[] pos = new int[8];

    static void print(){
        for(int i =0; i < 8; i++){
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }

    static void set(int i) {
		int j;
		int[] jstk = new int[8];

		Start : while (true) {
			j = 0;
			while (true) {
				while (j < 8) {
					if (!flag_a[j] && !flag_b[i + j] && !flag_c[i - j + 7]) {
						pos[i] = j;
						if (i == 7)								// 모든 열에 배치종료
							print();
						else {
							flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
							jstk[i++] = j;					// i열의 행을 Push
							continue Start;
						}
					}
					j++;
				}
				if (--i == -1) return;
				j = jstk[i];									// i열의 행을 Pop
				flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
				j++;
			}
		}
	}

    public static void main(String[] args){
        set(0);
    }
}
