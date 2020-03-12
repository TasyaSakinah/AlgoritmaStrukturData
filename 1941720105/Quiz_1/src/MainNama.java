
import java.util.Scanner;

public class MainNama {

    public static void main(String[] args) {
        Scanner tasya = new Scanner(System.in);
        Nama jumlah = new Nama();                                   //O(1)
        Nama2 mxmn = new Nama2();                                   //O(1)
        System.out.println("Input nama: ");                         //O(1)
        jumlah.nm = tasya.nextLine();                               //O(1)
        jumlah.countHuruf(jumlah.nm);                               //O(1)
        mxmn.Nama_2(jumlah.nm);                                     //O(1)
        mxmn.MaxMin(jumlah.nm, 0, jumlah.nm.length() - 1);          //O(1)
        System.out.println("Brute Force");                          //O(1)
        System.out.println("Huruf terbesar: " + mxmn.max);          //O(1)
        System.out.println("Huruf terkecil: " + mxmn.min);          //O(1)
        System.out.println("Divide and Conquer");                   //O(1)
        System.out.println("Huruf terbesar: " + mxmn.hasilMax());   //O(1)
        System.out.println("Huruf terkecil: " + mxmn.hasilMin());   //O(1)
    }
}
// 1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1
// 18
//notasi BigO = O(1)