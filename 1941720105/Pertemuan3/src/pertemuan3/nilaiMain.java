package pertemuan3;
import java.util.Scanner;
public class nilaiMain {
    public static void main (String[]args){
        Scanner tasya = new Scanner(System.in);
        Scanner sakinah = new Scanner (System.in);
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jmlh = tasya.nextInt();
        Nilai[] angka = new Nilai [jmlh];
        for (int i= 0; i<jmlh; i++){
            angka[i] = new Nilai();
           System.out.println("Mahasiswa ke "+(i+1)+": ");
            System.out.println("Nama Mahasiswa: ");
            angka[i].nama = sakinah.nextLine();
            System.out.println("Masukkan nilai tugas: ");
            angka[i].nilaiTugas = tasya.nextInt();
            System.out.println("Masukkan nilai kuis: ");
            angka[i].nilaiKuis = tasya.nextInt();
            System.out.println("Masukkan nilai uts: ");
            angka[i].nilaiUts = tasya.nextInt();
            System.out.println("Masukkan nilai uas: ");
            angka[i].nilaiUas = tasya.nextInt();
        } for (int i= 0; i<jmlh; i++){
           
            angka[i].tl=angka[i].hitungTotalNilai(angka[i].nilaiTugas, angka[i].nilaiKuis, angka[i].nilaiUts, angka[i].nilaiUas);
            System.out.println("Nilai akhir mahasiswa "+(i+1)+": "+angka[i].tl);
        } double t = 0;
        for (int i=1; i<jmlh; i++){
            t = angka[i].rata(angka[i].tl,angka[i-1].tl);
        } System.out.println("Rata-rata seluruhnya: "+t);
     
            System.out.println("Rata-rata DC: "+String.format("%.2f",angka.rataDC(angka.rata,0,angka.jmlh)));
        
    }
}
