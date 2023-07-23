package Ch8;

import java.util.Comparator;

public class ArrayLinkedList<E> {
    class Node<E>{
        private E data;
        private int next;
        private int dnext;

        void set(E data, int next){
            this.data = data;
            this.next = next;
        }
    }

    private Node<E>[] n;
    private int size;
    private int head;
    private int max;
    private int crnt;
    private int deleted;
    private static final int NULL = -1;

    public ArrayLinkedList(int capacity){
        head = crnt = max = deleted = NULL;
        try{
            n = new Node[capacity];
            for(int i = 0; i < capacity; i++){
                n[i] = new Node<E>();
            }
            size = capacity;
        }
        catch(OutOfMemoryError e){
            size = 0;
        }
    }

    private int getInsertIndex(){
        if(deleted == NULL){
            if(max < size){
                return ++max;
            }
            else{
                return NULL;
            }
        }
        else{
            int rec = deleted;
            deleted = n[rec].dnext;
            return rec;
        }
    }

    private void deletedIndex(int idx){
        if(deleted == NULL){
            deleted = idx;
            n[idx].dnext = NULL;
        }
    }

    public E search(E obj, Comparator<? super E>  c){
        int ptr = head;

        while(ptr != NULL){
            if(c.compare(obj, n[ptr].data) == 0){
                crnt = ptr;
                return n[ptr].data;
            }
            ptr = n[ptr].next;
        }
        return null;
    }

    public void addFirst(E obj){
        int ptr = head;
        int rec = getInsertIndex();
        if(rec != NULL){
            head = crnt = rec;
            n[head].set(obj, ptr);
        }
    }

    public void addLast(E obj){
        if(head == NULL){
            addFirst(obj);
        }
        else{
            int ptr = head;
            while(n[ptr].next != NULL){
                ptr = n[ptr].next;
            }
            int rec = getInsertIndex();
            if(rec != NULL){
                n[ptr].next = crnt = rec;
                n[rec].set(obj, NULL);
            }
        }
    }

    public void removeFirst(){
        if(head != NULL){
            int ptr = n[head].next;
            deletedIndex(head);
            head = crnt = ptr;
        }
    }

    public void removeLast(){
        if(head != NULL){
            if(n[head].next == NULL){
                removeFirst();;
            }
            else{
                int ptr = head;
                int pre = head;

                while(n[ptr].next != NULL){
                    pre = ptr;
                    ptr = n[ptr].next;
                }
                n[pre].next = NULL;
                deletedIndex(ptr);
                crnt = pre;
            }
        }
    }

    public void remove(int p){
        if (head != NULL) {
            if (p == head)                                // p가 머리 노드이면
                removeFirst();                            // 머리노드 삭제
            else {
                int ptr = head;

                while (n[ptr].next != p) {
                    ptr = n[ptr].next;
                    if (ptr == NULL) return;    // p가 리스트에 없음
                }
                n[ptr].next = NULL;
                deletedIndex(ptr);
                n[ptr].next = n[p].next;
                crnt = ptr;
            }
        }
    }

    public void removeCurrentNode() {
        remove(crnt);
    }

    //--- 전체 노드 삭제 ---//
    public void clear() {
        while (head != NULL)                        // 비게 될 때까지
            removeFirst();                          // 머리 노드 삭제
        crnt = NULL;
    }

    //--- 선택 노드를 하나 뒤쪽으로 진행 ---//
    public boolean next() {
        if (crnt == NULL || n[crnt].next == NULL)
            return false;                                    // 나아갈 수 없음
        crnt = n[crnt].next;
        return true;
    }

    //--- 선택 노드 표시 ---//
    public void printCurrentNode() {
        if (crnt == NULL)
            System.out.println("선택 노드가 없습니다.");
        else
            System.out.println(n[crnt].data);
    }

    //--- 전체 노드 표시 ---//
    public void dump() {
        int ptr = head;

        while (ptr != NULL) {
            System.out.println(n[ptr].data);
            ptr = n[ptr].next;
        }
    }
}
