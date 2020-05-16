public class Nasabah {
    String noRekening, nama;
    public Nasabah(String noRek, String nm){
        noRekening = noRek;
        nama = nm;
    }
    public void Nasabah(){
        
    }
    void print(){
       System.out.println("Nama = " + nama);
       System.out.println("Nomor rekening = " + noRekening);
    }
}
