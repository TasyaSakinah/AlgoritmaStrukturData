import java.util.Scanner;
public class Main_Penduduk {
    public static void main (String[]args){
        Scanner tasya = new Scanner (System.in);
        Scanner sakinah = new Scanner (System.in);
        System.out.println("Jumlah data: ");
        int jml = tasya.nextInt();
        Tugas_4 sc = new Tugas_4(jml);
        for (int i=0; i<sc.jumData; i++){
            System.out.println("Penduduk ke "+(i+1)+": ");
            System.out.println("Inputkan NIK: ");
            int NIK = tasya.nextInt();
            System.out.println("Inputkan nama: ");
            String nama = sakinah.nextLine();
            System.out.println("Inputkan alamat: ");
            String alamat = sakinah.nextLine();
            System.out.println("inputkan jenis kelamin: ");
            String jenisKlmn = sakinah.nextLine();
            System.out.println();
            Pendduk p = new Pendduk (NIK, nama, alamat, jenisKlmn);
            sc.tambah(p);
        }
        System.out.println("Inputkan NIK penduduk yang dicari: ");
        int cari = tasya.nextInt();
        int posisi = sc.FindSeqSearch(cari);
        sc.Tampilposisi(cari, posisi);
    }
}
