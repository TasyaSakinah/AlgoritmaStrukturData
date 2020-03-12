package pertemuan3;
import java.util.Scanner;
public class MainPemilihanSuara {
    public static void main (String[]args){
        Scanner tasya = new Scanner (System.in);
        Scanner sakinah = new Scanner (System.in);
        PemilihanSuara jmlh = new PemilihanSuara();//instansiansi jmlh
        PemilihanSuara[] obj = new PemilihanSuara[jmlh.banyakKandidat];//array menyimpan banyaknya kandidat
        for (int i=0; i<jmlh.banyakKandidat; i++){
            obj[i] = new PemilihanSuara();
            System.out.println("Nama kandidat ke "+(i+1)+": ");
            obj[i].kandidat = sakinah.nextLine();
        } System.out.println(" ");
        for (int i=0; i<jmlh.banyakKandidat; i++){
            System.out.println("Jumlah suara ke "+(i+1)+": ");
            obj[i].suara = tasya.nextInt();
            jmlh.banyakSuara += obj[i].suara;
        } int hasil = jmlh.hitungSuara(jmlh.banyakSuara, obj[0].suara, obj[1].suara, obj[2].suara, obj[3].suara);
        if (hasil==0){
            System.out.println("Kandidat memiliki mayoritas hampir sama");
        } else {
            System.out.println("Ketua yang terpilih adalah "+obj[hasil-1].kandidat);
        }
    }
}
