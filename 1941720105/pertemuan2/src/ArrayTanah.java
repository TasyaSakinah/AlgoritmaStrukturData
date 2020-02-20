import java.util.Scanner;
public class ArrayTanah {

    public static void main(String[] args) {
        Scanner tasya = new Scanner (System.in);
        System.out.println("Jumlah tanah: ");
        int jmlh = tasya.nextInt();
        Tanah[] tgArray = new Tanah[jmlh];
        for (int i = 0; i < jmlh; i++) {
            tgArray[i] = new Tanah();
            tgArray[i].no = (i+1);
            System.out.println("Tanah ke"+(i+1)+": ");
            System.out.println("Input panjang: ");
            tgArray[i].panjang = tasya.nextInt();
            System.out.println("Input lebar: ");
            tgArray[i].lebar = tasya.nextInt();
             
        }
        int maks = tgArray[0].hitungLuasTanah();
        int nTanah = tgArray[0].no;
        for (int i = 0; i < jmlh; i++) {
            System.out.println("Luas tanah ke-"+(i+1)+": "+tgArray[i].hitungLuasTanah());
            tgArray[0] = new Tanah();
            if (tgArray[i].hitungLuasTanah()>maks){
                nTanah = tgArray[i].no;
            }
//            tgArray[i].luasTanah = tgArray[i].hitungLuasTanah();
//            System.out.println("Luas tanah ke " + i + ": " + tgArray[i].luasTanah);
          
        }
        System.out.println("Tanah terluas: " + nTanah);
    }
}
