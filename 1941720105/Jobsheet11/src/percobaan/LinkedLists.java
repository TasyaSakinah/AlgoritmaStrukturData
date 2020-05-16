package percobaan;
public class LinkedLists {
    Node head;
    int size;
    
    public LinkedLists(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(int item){
        head = new Node(item, head);
        size++;
    }
    public void add(int item, int index) throws Exception {
        if (index < 0 || index > size){
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0){
        addFirst(item);
    } else {
            Node tmp = head;
            for (int i=1; i<index; i++){
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(item, next);
            size++;
        } 
    }
    public void addLast(int item){
        if (isEmpty()){
            Node tmp = head;
        while (tmp.next != null){
               tmp = tmp.next;
            }
            tmp.next = new Node(item, null);
        } 
        size++;
    }
    public int getFirst() throws Exception{
        if (isEmpty()){
            throw new Exception("LinkedLists kosong");
        }
        return (int)head.data;
    }
   public int getLast() throws Exception {
       if (isEmpty()){
           throw new Exception("LinkedLists kosong");
       }
       Node tmp = head;
       while (tmp.next != null){
           tmp = tmp.next;
       }
       return (int)tmp.data;
   }
    public int get(int index) throws Exception {
        if (isEmpty() || index >= size){
            throw new Exception("Nilai index di luar batas");
        }
        Node tmp = head;
        for (int i=0; i<index; i++){
            tmp = tmp.next;
        }
        return (int)tmp.data;
    }
    public void remove(int index) throws Exception{
        if (isEmpty() || index >= size){
            throw new Exception("Nilai index di luar batas");
        } else if (index == 0){
            removeFirst();
        } else {
            Node prev = head;
            Node cur = head.next;
            for (int i=1; i<index; i++){
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }
    public void removeFirst() throws Exception{
        head = head.next;
        size--;
    }
    public void clear(){
        head = null;
        size = 0;
    }
    public void print(){
        if (!isEmpty()){
            Node tmp = head;
            while (tmp != null){
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists kosong");
        }
    }
    public void addByValue(int item2, int item, int index, int cari) throws Exception{
        if (cari == item2){
            add(item, index);
        } else {
            System.out.println("Nilai yang dicari tidak ada");
        }
    }
    public void removeByValue(int itm2, int index, int cari) throws Exception{
        if (cari == itm2){
            remove(index);
            System.out.println("Yang dihapus index ke: " + index);
        } else {
            System.out.println("Nilai yang di cari tidak ada");
        }
    }
}
