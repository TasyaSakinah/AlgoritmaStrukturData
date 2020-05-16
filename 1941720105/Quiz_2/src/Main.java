import java.util.Scanner;
public class Main {
    public static void menu(){
        System.out.println("-------------");
        System.out.println("Menu");
        System.out.println("-------------");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Total Antrian dan Total Waktu Tunggu");
        System.out.println("4. Jumlah Antrian dan Jumlah Waktu Tunggu dari Nomor Urut");
        System.out.println("5. Data Pasien dari Nomor Urut");
        System.out.println("6. Rata-Rata Waktu");
        System.out.println("7. Menghitung dan Menampilkan Statistik Setiap Keluhan");
        System.out.println("-------------");
    }
    public static void subMenu(){
        System.out.println("-------------");
        System.out.println("Keluhan");
        System.out.println("-------------");
        System.out.println("1. Demam");
        System.out.println("2. Flu");
        System.out.println("3. Sakit Kepala");
        System.out.println("4. Asma");
        System.out.println("5. Diare");
        System.out.println("6. Sakit Gigi");
        System.out.println("7. Sakit Mata");
        System.out.println("8. Keseleo");
        System.out.println("9. Susah Tidur");
        System.out.println("-------------");     
    }
    public static void main (String[]args){     
        System.out.println("Nama  : Tasya Rachmah Sakinah");
        System.out.println("Kelas : TI 1D");
        System.out.println("NIM   : 1941720105");
        Scanner tasya = new Scanner (System.in);
        Scanner sakinah = new Scanner (System.in);
        QueueLinkedLists ql = new QueueLinkedLists();
        int pilih = 0, lagi = 0,  i, keluhan,n = 0, wktu;
        String m,klh;
        try{
        do {
            menu();
            System.out.print("Pilih menu: ");
            pilih = tasya.nextInt();
          //  System.out.print("Input nama pasien: ");
          //  m = tasya.next();
            switch (pilih) {
                case 1:
                    n++;
                    System.out.print("Input nama pasien: ");
                    m = tasya.next();
                    subMenu();
                    System.out.println("Pilih keluhan: ");
                    keluhan = tasya.nextInt();
                    klh = ql.keluhan(keluhan);
                    wktu = ql.waktu(keluhan);
                    ql.Enqueue(n, m, keluhan, wktu);
                    ql.print();
                    break;
                case 2:
                    ql.Dequeue();
                    ql.print();
                    break;
                case 3:
                    ql.cekAntrian();
                    break;
                case 4:
                    System.out.print("Input nomor antrian: ");
                    int urt = tasya.nextInt();
                    ql.cekAntrianByNo(urt);
                    break;
                case 5:
                    System.out.println("Input nomor antrian: ");
                    int nr = tasya.nextInt();
                    ql.cekPasienByNo(nr);
                    break;
                case 6: 
                    ql.rataWaktu();
                    break;
                case 7:
                    ql.statistikKeluhan();
                    break;
}
        } 
        while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}