public class Node<T> {
    T no, waktu;
    T nama;
    T keluhan;
    Node<T> next;
    
    public Node(T no, T nama, T keluhan, T waktu,Node<T> next){
        this.no = no;
        this.nama = nama;
        this.keluhan = keluhan;
        this.waktu = waktu;
    }
    
}
