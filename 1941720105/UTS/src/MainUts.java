import java.util.Scanner;
public class MainUts {
  public static void main (String[]args){
      Scanner tasya = new Scanner (System.in);
      Scanner sakinah = new Scanner (System.in);
      System.out.println("*** UTS - Praktikum ASD ***");
      System.out.println("~~~ Program Pencarian Data ~~~");
      System.out.println(" ");
      System.out.println("Nama: Tasya Rachmah Sakinah");
      System.out.println("NIM: 1941720105");
      System.out.println(" ");
      System.out.println("Data: {'T', 'A', 'S', 'Y', 'A', 'R', 'A', 'C', 'H', 'M', 'A', 'H', 'S', 'A', 'K', 'I', 'N', 'A', 'H'}");
      System.out.println(" ");
      char []data = {'T', 'A', 'S', 'Y', 'A', 'R', 'A', 'C', 'H', 'M', 'A', 'H', 'S', 'A', 'K', 'I', 'N', 'A', 'H'};
      uts t = new uts(data,19);
      MergeSort ms = new MergeSort();
      System.out.println("Pilih metode pencarian: ");
      System.out.println("1. Sequential Search");
      System.out.println("2. Binary Search");
      System.out.println("");
      System.out.print("Pilih metode nomor: ");
      int pilih = tasya.nextInt();
      System.out.print("Data yang dicari: ");
      char cari = sakinah.next().charAt(0);
      System.out.println("");
      if (pilih==1){
          System.out.println("Hasil Pencarian dengan Sequential Search");
          int posisi = t.FindSeqSearch(cari);
          t.TampilPosisi(cari, posisi);
          System.out.println("");
      } else if (pilih==2){
          System.out.println("Hasil Pengurutan dengan MergeSort: ");
          System.out.print(">> ");
          ms.mergeSort(data);
          ms.printArray(data);
          System.out.println("");
          System.out.println("Hasil Pencarian dengan Binary Search");
          System.out.print(">> ");
          int posisi = t.FindBinarySearch(cari, data, 0, data.length-1);
          t.TampilPosisi(cari, posisi);
      }
      System.out.println("");
      System.out.println("*** End Program ***");
  }  
}