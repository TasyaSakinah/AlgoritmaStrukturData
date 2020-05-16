public class DoubleLinkedList {
    Node head;
    int size;
    
    public DoubleLinkedList(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(int item){
        if (isEmpty()){
            head = new Node (null, item, null, item, item);
        } else {
            Node newNode = new Node (null, item, null, item, item);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void print(){
        if (!isEmpty()){
            Node tmp = head;
            while (tmp != null){
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size){
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    public void cek(int Jml){
        int s,stok = 0, a = 0;
        Node tmp = head;
        while (tmp!=null) {
            ++a;
            int j = (int) tmp.jumlah;
            if (Jml<j) {
                System.out.println("Tidak ditemukan");
                break;

            }
            s = (int) tmp.stok;
            stok+=s;
            tmp = tmp.next;
            if (j==Jml){
                
                System.out.println("Jumlah: "+ (stok));
                break;
        }
    }
    }
    public void cari(int cr) throws Exception{
        if (isEmpty())
            throw new Exception("Nilai indeks di luar batas");
        int index = -1;
        int i = 0;
        Node tmp = head;
        while (tmp != null){
            if (cr == tmp.data){
                index = i;
            } tmp = tmp.next;
            i++;
        } System.out.println("Data ditemukan pada indeks ke: " + index);
        
    }
}
