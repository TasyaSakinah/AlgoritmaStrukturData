/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */import java.util.Scanner;
public class ArrayBarang1 {
    public static void main(String[] args) {
        Scanner tasya = new Scanner(System.in);
        Barang1[] b1 = new Barang1[3];

        for (int i = 0; i < 3; i++) {
            b1[i] = new Barang1();

            System.out.print("input nama barang ke " + i + ": ");
            b1[i].nama = tasya.nextLine();
            System.out.print("Harga satuan: ");
            b1[i].hargaSatuan = tasya.nextInt();
            System.out.print("Jumlah: ");
            b1[i].jumlah = tasya.nextInt();
            tasya.nextLine();
            }
        for (int i = 0; i < 3; i++) {
            System.out.println("Harga Satuan: " + b1[i].hargaSatuan);
            System.out.println("Total = " + b1[i].hitungHargaBayar());        
        }

    }
}
