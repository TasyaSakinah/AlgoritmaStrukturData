package percobaan;
public class NodeMahasiswa {
    String nama;
    String nim;
    String alamat;
    NodeMahasiswa next;

    public NodeMahasiswa(String nama, String nim, String alamat, NodeMahasiswa next) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.next = next;
    }
}