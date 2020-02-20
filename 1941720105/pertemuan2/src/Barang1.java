
import java.util.Scanner;

public class Barang1 {

    String nama;
    int hargaSatuan, jumlah;

    Barang1() {
    }
//    Barang1(String nm, int hs, int jml){
//        nama = nm;
//        hargaSatuan = hs;
//        jumlah = jml;
//    } 

    int hitungHargaTotal() {
        return hargaSatuan * jumlah;
    }

    int hitungDiskon() {
        int diskon = 0;
        if (hitungHargaTotal() > 100000) {
            diskon = 10;
        } else if (hitungHargaTotal() >= 50000 && hitungHargaTotal() <= 100000) {
            diskon = 5;
        } else {
            diskon = 1;
        }
        return (hitungHargaTotal() * diskon) / 100;
    }

    int hitungHargaBayar() {
        return hitungHargaTotal() - hitungDiskon();
    }

    
}
