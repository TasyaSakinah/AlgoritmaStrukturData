public class Node {
    int data, jumlah, stok;
    Node prev, next;
    
    Node(Node prev, int data, Node next, int jumlah, int stok){
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jumlah = jumlah;
        this.stok = stok;
    }
}
