import java.util.Scanner;
public class SearchingMain {
    public static void main (String[] args){
        Scanner tasya = new Scanner (System.in);
      //  int data[] = {10,40,30,50,70,20,100,90};
      //  Searching pencarian = new Searching(data,8);
        System.out.print("Masukkan jumlah data: ");
        int jmlData = tasya.nextInt();
        int data[] = new int [jmlData];
        for (int i=0; i<jmlData; i++){
            System.out.print("Masukkan data, indek ke "+(i+1)+": ");
            data[i] = tasya.nextInt();
        }
        Searching sc = new Searching(data,jmlData);
        System.out.println("Isi Array: ");
        sc.TampilData();
        int cari = 30;
        System.out.println("Menggunakan Sequential Search");
        int posisi = sc.FindSeqSearch(cari);
     //   if (posisi !=-1){
     //       System.out.println("Data: "+ cari + "ditemukan pada indeks "+ posisi);
     //   } else {
     //       System.out.println("Data: "+ cari + "tidak ditemukan");
     //   }
        sc.TampilPosisi(cari, posisi);
        System.out.println("=============================");
        System.out.println("Menguunakan Binary Searh");
        posisi = sc.FindBinarySearch(cari, 1, data.length);
        sc.TampilPosisi(cari, posisi);
    }
}
