import java.util.Scanner;
public class ArrayObjects {
    public int panjang;
    public int lebar;
    public int sisi;
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        PersegiPanjang[] ppArray = new PersegiPanjang[7];
        for (int i=0; i<3; i++){
            ppArray[0] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Masukkan panjang: ");
            ppArray[0].panjang = sc.nextInt();
            System.out.println("Masukkan lebar: ");
            ppArray[0].lebar = sc.nextInt();
        } 
        for (int i=0; i<3; i++){
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[0].panjang+", lebar: "+ppArray[0].lebar);
        }
    }
}
