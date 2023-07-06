package Questions.Chap4;

public class Q5 {
    private int[] que;
    private int capacity;
    private int front;
    private int rear;
    private int num;

    public class EmptyQ5Exception extends RuntimeException{
        public EmptyQ5Exception(){}
    }

    public class OverflowQ5Exception extends RuntimeException{
        public OverflowQ5Exception(){}
    }

    public Q5(int maxlen){
        num = front = rear = 0;
        capacity = maxlen;
        try{
            que = new int[capacity];
        }catch (OutOfMemoryError e){
            capacity = 0;
        }
    }

    public int enque(int x) throws OverflowQ5Exception{
        if(num >= capacity){
            throw new OverflowQ5Exception();
        }
        que[rear++] = x;
        num++;

        if(rear == capacity)
            rear = 0;
        return x;
    }

    public int deque() throws EmptyQ5Exception{
        if(num <= 0){
            throw new EmptyQ5Exception();
        }
        int x = que[front++];
        num--;

        if(front == capacity){
            front = 0;
        }
        return x;
    }

    public int peek() throws EmptyQ5Exception{
        if(num <= 0){
            throw new EmptyQ5Exception();
        }
        return que[front];
    }

    public void clear(){
        num = front = rear = 0;
    }

    public int indexOf(int x){
        for(int i = 0; i < num; i++){
            int idx = (i + front) % capacity;
            if(que[idx] == x)
                return idx;
        }
        return -1;
    }
    public int search(int x){
        for(int i = 0; i < num; i++){
            int idx = (i + front) % capacity;
            if(que[idx] == x)
                return i+1;
        }
        return 0;
    }

    public int getCapacity(){
        return capacity;
    }

    public int size(){
        return num;
    }

    public boolean isEmpty(){
        return num <= 0;
    }

    public boolean isFull(){
        return num >= capacity;
    }

    public void dump(){
        if(num <= 0){
            System.out.println("큐가 비어있습니다.");
        }
        else{
            for(int i = 0; i<num; i++){
                System.out.print(que[(i+front)%capacity] + " ");
            }
            System.out.println();
        }
    }
}
