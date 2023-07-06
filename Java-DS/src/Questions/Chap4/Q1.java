package Questions.Chap4;

import java.util.Scanner;

import Ch4.IntStack;

public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while(true){
            System.out.println();
            System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1)푸시 (2) 팝 (3) 피크 (4)덤프 (5)검색 (6)초기화 (7)빔 (8)가득 (0) 종료: ");

            int menu = sc.nextInt();
            if(menu == 0) break;
        
            int x;
            switch (menu){
                case 1:
                    System.out.print("데이터: ");
                    x = sc.nextInt();

                    try{
                        s.push(x);
                    }catch (IntStack.OverflowIntStackException e){
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;
                case 2:
                    try{
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    }catch(IntStack.EmptyintStackException e){
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                
                case 3:
                    try{
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x +"입니다.");
                    }catch(IntStack.EmptyintStackException e){
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                
                case 4:
                    s.dump();
                    break;
                
                case 5:
                    System.out.print("검색할 데이터: ");
                    x = sc.nextInt();
                    
                    if(s.indexOf(x) == -1){
                        System.out.println("해당하는 데이터가 없습니다.");
                    }
                    else{
                        System.out.println(s.indexOf(x));
                    }
                    break;
                
                case 6:
                    System.out.println("스택을 초기화 합니다.");
                    s.clear();
                    break;
                
                case 7:
                    if(s.isEmpty() == true){
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;

                case 8:
                    if(s.isFull() == true){
                        System.out.println("스택이 꽉 차 있습니다.");
                    }
                    break;
            }
        }
        sc.close();
    }
}
