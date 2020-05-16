package pertemuan6;
public class DaftarTiket {
  
   public static void bubbleSort(Tugas_Tiket[]tk){
       for (int i=0; i<tk.length-1; i++){
           for (int j=1; j<tk.length-i; j++){
               if (tk[j].harga>tk[j-1].harga){
                   Tugas_Tiket temp = tk[j];
                   tk [j] = tk [j-1];
                   tk [j-1] = temp;
           }
       }
       }
   }
   public static void selectionSort(Tugas_Tiket[]tk){
       for (int i=0; i<tk.length-1; i++){
           int ixMin = i;
           for (int j=i+1; j<tk.length; j++){
               if (tk[j].harga<tk[ixMin].harga){
                   ixMin = j;
               }
               Tugas_Tiket temp = tk[ixMin];
               tk[ixMin] = tk[i];
               tk[i] = temp;
           }
       }
   }
}
