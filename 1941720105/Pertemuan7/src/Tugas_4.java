public class Tugas_4 {
    public int jumData;
    public Pendduk listPendduk[];
    public int indeks;
    private int nik;
    private String nama;
    private String alamat;
    private String jenisK;
    public Tugas_4 (int jml){
        this.jumData = jml;
        listPendduk = new Pendduk[jml];
    }
    public void tambah (Pendduk p){
        if (indeks<listPendduk.length){
            listPendduk[indeks] = p;
            indeks++;
        } else {
            System.out.println("Data penuh");
        }
    }
    public int FindSeqSearch (int cari){
        int posisi = -1;
        for (int i=0; i<jumData; i++){
            if (listPendduk[i].NIK == cari){
                posisi = i;
                break;
            }
        }
        return posisi;
    }
    public void Tampilposisi(int x, int pos)
    {
        if (pos != -1) {
            System.out.println("NIK : " + x + " ditemukan pada indeks " + pos);
            System.out.println("Data Penduduk ke"+ (pos + 1));
            System.out.println("NIK Penduduk\t: " + listPendduk[pos].NIK);
            System.out.println("Nama Penduduk\t: " + listPendduk[pos].nama);
            System.out.println("Alamat Penduduk\t: " + listPendduk[pos].alamat);
            System.out.println("Jenis Kelamin\t: " + listPendduk[pos].jenisKlmn);
            System.out.println("===========================================================");
        }
        else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
    
}
