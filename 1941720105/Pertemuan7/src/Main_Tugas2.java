
import java.util.Scanner;
public class Main_Tugas2 {
   public static void main (String[]args){
       Scanner tasya = new Scanner (System.in);
       System.out.print("Masukkan jumlah baris: ");
        int jmlBaris = tasya.nextInt();
       System.out.print("Masukkan jumlah kolom: ");
        int jmlKolom = tasya.nextInt();
        int data[][] = new int [jmlBaris][jmlKolom];
        for (int i=0; i<jmlBaris; i++){
            for (int j=0; j<jmlKolom; j++){
                System.out.print("Masukkan baris, indek ke "+(i+1)+" "+(j+1)+": ");
            data[i][j] = tasya.nextInt();
            }
        }
        Tugas_2 tg = new Tugas_2(data, jmlBaris, jmlKolom);
        System.out.println("Isi Array: ");
        tg.TampilData();
        int cari = 100;
        System.out.println("Menggunakan Sequential Search");
        int[] posisi = tg.FindSeqSearch(cari);
        tg.TampilPosisi(cari, posisi);
        }
    
}
