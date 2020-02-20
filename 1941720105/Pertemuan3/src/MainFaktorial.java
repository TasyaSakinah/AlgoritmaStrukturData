
import java.util.Scanner;

public class MainFaktorial {

    public static void main(String[] args) {
        Scanner tasya = new Scanner(System.in);
        long main, berhenti;
        System.out.println("=============================================");
        System.out.println("Masukikan jumlah elemen yang ingin dihitung: ");
        int elemen = tasya.nextInt();
        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke " + (i + 1) + ": ");
            fk[i].nilai = tasya.nextInt();
        }
        main = System.nanoTime();
        System.out.println("=========================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + fk[i].faktorialBF(fk[i].nilai));
        }
        berhenti = System.nanoTime();
        System.out.println("Waktu bejalan selama: " + (berhenti - main) / 1000000.0 + " millisecond");
        
        main = System.nanoTime();
        System.out.println("=========================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + fk[i].faktorialDC(fk[i].nilai));
        }
        berhenti = System.nanoTime();
        System.out.println("Waktu bejalan selama: " + (berhenti - main) / 1000000.0 + " millisecond");
        System.out.println("=========================================");
    }

}
