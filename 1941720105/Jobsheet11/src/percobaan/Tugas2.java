package percobaan;
public class Tugas2 {
    public String nogerbong;
    public String jml;
    public Tugas2 next;

    public Tugas2(String ng, String jm) {
        nogerbong = ng;
        jml = jm;
    }
    public void print(){
        System.out.println("Nomor gerbong: "+ nogerbong);
        System.out.println("Jumlah: "+ jml);
        System.out.println();
    }
}
