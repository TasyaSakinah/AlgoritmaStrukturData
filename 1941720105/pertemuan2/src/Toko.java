import java.util.Scanner;
public class Toko {
    Scanner tasya = new Scanner (System.in);
   int id, lamaPinjam, hargaSewa;
   String namaMember, namaGame;
   Toko(){
   } Toko (int d, int lp, int hs, String nm, String ng){
       id = d;
       lamaPinjam = lp;
       hargaSewa = hs;
       namaMember = nm;
       namaGame = ng;
   }  int hargaTotal (){
       return lamaPinjam*hargaSewa;
   }
}
