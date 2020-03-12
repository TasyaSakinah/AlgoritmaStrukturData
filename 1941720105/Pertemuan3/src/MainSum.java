import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
public class MainSum {
    public static void main(String[]args){
        Scanner tasya = new Scanner (System.in).useLocale(Locale.US);
        System.out.println("======================================");
        System.out.println("Program menghitung keuntungan total (Satuan Juta. Misal 5.9)");
        System.out.println("Masukkan jumlah perusahaan: ");
        int elemen = tasya.nextInt();
        for (int x=0; x<elemen; x++){
        System.out.println("======================================");
        System.out.println("Program menghitung keuntungan total (Satuan Juta. Misal 5.9)");
        System.out.println("Masukkan jumlah bulan: ");
        int bulan = tasya.nextInt();      
        Sum sm = new Sum (bulan);
        System.out.println("======================================");
        for (int i=0; i<sm.elemen; i++){
            System.out.println("Masukkan untung bulan ke "+(i+1)+": ");
            sm.keuntungan[i] = tasya.nextDouble();
        }
        System.out.println("======================================");
        System.out.println("Algoritma Brute Force");
       // System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah: "+sm.totalBF(sm.keuntungan));
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah: "+(df.format(sm.totalBF(sm.keuntungan))));
        System.out.println("======================================");
        System.out.println("Algoritma Divide and Conquer");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah: "+sm.totalDC(sm.keuntungan,0,sm.elemen-1));
    }
}
}