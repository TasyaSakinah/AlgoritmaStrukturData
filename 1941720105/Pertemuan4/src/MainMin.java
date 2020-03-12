//import static MinMax.max_min;
//import static MinMax.max_min;
import java.util.Scanner;
public class MainMin {
    public static void main (String[]args){
        MinMax[] ppArray = new MinMax[5];
        ppArray[0] = new MinMax();
        Scanner tasya = new Scanner (System.in);
        for (int i=0; i<5; i++){
            ppArray[i] = new MinMax();
            System.out.println("Nilai array indeks ke-"+i);
            System.out.println("Masukkan nilai: ");
            ppArray[i].nilaiArray = tasya.nextInt();
        } 
            int arr[] = new int [5];
            for (int i=0; i<5; i++){
                arr[i] = ppArray[i].nilaiArray;
            } System.out.println();
              MinMax arrmnmx = new MinMax();
              arrmnmx.MinMax (arr,5);
           for (int i=0; i<5; i++){
              System.out.println("Nilai pada indeks ke "+i+": "+ppArray[i].nilaiArray);
          } 
          System.out.println("Brute force");
            System.out.println("Nilai minimal : "+arrmnmx.hasilMin());
            System.out.println("Nilai maksimal : "+arrmnmx.hasilMax());
          
             MaxMin hasil = new MaxMin();
            MinMax.max_min(arr, 0, 4, hasil);
            System.out.println("Divide conquer");
            System.out.print("Nilai minimal: "+hasil.minimum+"/nNilai Maksimaly: "+hasil.maximum);
            System.out.print("/n");
    } 
}
    

