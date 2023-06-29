package Questions.Chap2;

public class Q8 {
    static class YMD{
        int y;
        int m;
        int d;

        YMD(int y, int m, int d){
            this.y = y;
            this.m = m;
            this.d = d;
        }

        public int after(int n){
            int day = d;
            day += n;
            if(day> 31){
                day -= 31;
            }
            return day;
        }
        public int before(int n){
            int day = d;
            day -= n;
            if(day< 1){
                day += 31;
            }
            return day;
        }
    }

    public static void main(String[] args){
        YMD a = new YMD(2001, 10, 25);
        System.out.println("8일 후의 날짜는: " + a.y+"/" +a.m+"/"+a.after(8));

        System.out.println("20일 전의 날짜는: " + a.y+"/" +a.m+"/"+a.before(20));
    }
}
