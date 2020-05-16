package pertemuan6;
public class Tugas_Tiket {
    String nama;
    float harga;
    int availableTicket;
    int soldTicket;
    Tugas_Tiket (String nama,float harga,int availableTicket,int soldTicket){
        this.nama = nama;
        this.harga = harga;
        this.availableTicket = availableTicket;
        this.soldTicket = soldTicket;
    }
    void tampil(){
        System.out.println("Nama pesawat "+nama);
        System.out.println("Harga tiket "+harga);
        System.out.println("Tiket yang tersedia "+availableTicket);
        System.out.println("Tiket yang terjual "+soldTicket);
    }
}
