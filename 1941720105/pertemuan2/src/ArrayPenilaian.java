import java.util.Scanner;
public class ArrayPenilaian {
   public static void main (String[]args){
       Scanner tasya = new Scanner (System.in);
       System.out.println("Jumlah mahasiswa: ");
       int bnyk = tasya.nextInt();
       Penilaian[] angka = new Penilaian[bnyk];
       for (int i=0; i<bnyk; i++){
           angka[i] = new Penilaian();
           System.out.println("mhs ke"+i);
           System.out.println("Masukkan nialai 1: ");
           angka[i].nilai1 = tasya.nextInt();
           System.out.println("Masukkan nilai 2: ");
           angka[i].nilai2 = tasya.nextInt();
       }  
       for (int i=1; i<bnyk; i++){
       System.out.println("Nilai terbaik Mhs "+i+": "+angka[i].hitungTerbaik(angka[i-1].nilai1, angka[i].nilai2));
      }
}
}