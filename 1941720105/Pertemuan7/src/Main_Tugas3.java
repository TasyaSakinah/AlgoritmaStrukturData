public class Main_Tugas3 {
    public static void main (String[]args){
   int []data = {12,17,2,1,70,50,90,17,2,90};
   Tugas_3 sc = new Tugas_3(data,10);
   MergeSort mSort = new MergeSort();
   System.out.println("Isi Array");
   sc.TampilData();
   System.out.println("Sorting: ");
   mSort.mergeSort(data);
   mSort.printArray(data);
   System.out.println("Nilai array terbesar: "+sc.mx(data));
   int cari = sc.mx(data);
   System.out.println("Total nilai terbesar pada array: "+sc.Max(cari, data));
   int posisi[] = new int [sc.max];
   for (int i=0; i<sc.max; i++){
       posisi[i] = sc.FindBinarySearch(cari, data, 0, data.length-1);
       if (i>0){
           sc.TampilPosisi(cari, posisi[i]+1);
       } else {
           sc.TampilPosisi(cari, posisi[i]);
       }
   }
  }
}