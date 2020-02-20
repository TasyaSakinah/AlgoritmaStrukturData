import java.util.Scanner;
public class TokoMain {
    public static void main (String[]args){
        Scanner tasya = new Scanner (System.in);
        Toko[] tArray = new Toko[3];
        tArray[0] = new Toko();
        tArray[0].namaMember = "Tasya";
        tArray[0].id = 300601;
        tArray[0].namaGame = "Plants vs zombie";
        tArray[0].lamaPinjam = 5;
        tArray[0].hargaSewa = 20000;
        tArray[1] = new Toko();
        tArray[1].namaMember = "Rachmah";
        tArray[1].id = 765778;
        tArray[1].namaGame = "cooking";
        tArray[1].lamaPinjam = 2;
        tArray[1].hargaSewa = 20000;
        tArray[2] = new Toko();
        tArray[2].namaMember = "Sakinah";
        tArray[2].id = 78544;
        tArray[2].namaGame = "Puzzle";
        tArray[2].lamaPinjam = 2;
        tArray[2].hargaSewa = 20000;
            for (int i=0; i<tArray.length; i++){
            System.out.println("Nama member: "+tArray[i].namaMember);
            System.out.println("id member: "+tArray[i].id);
            System.out.println("Nama game: "+tArray[i].namaGame);
            System.out.println("Lama pinjam: "+tArray[i].lamaPinjam);
            System.out.println("Harga sewa: "+tArray[i].hargaSewa);
            System.out.println("Harga total: "+tArray[i].hargaTotal());
    }
}
}