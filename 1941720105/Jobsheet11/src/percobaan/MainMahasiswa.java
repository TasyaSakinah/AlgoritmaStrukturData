package percobaan;
import java.util.Scanner;
public class MainMahasiswa {
    public static void menu(){
        System.out.println("-------------");
        System.out.println("Menu utama");
        System.out.println("-------------");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("4. Cetak");
        System.out.println("-------------");
    }

    public static void main(String[] args) {
        Scanner tasya = new Scanner(System.in);
        LinkedListsMahasiswa lm = new LinkedListsMahasiswa();
        int pilih;

        do {
           
            menu();
            System.out.print("Pilih menu: ");
            pilih = tasya.nextInt();
            try {
            switch (pilih) {
                case 1:
                        System.out.print("Input nama mahasiswa: ");
                        String nm = tasya.next();
                        System.out.print("Input NIM mahasiswa: ");
                        String nim = tasya.next();
                        System.out.print("Masukkan alamat mahasiswa: ");
                        String al = tasya.next();
                        lm.add(nm,nim,al);
                        break;
                        
                case 2:
                        System.out.println("Menghapus data mahasiswa: ");
                        lm.print();
                        System.out.print("Input nama mahasiswa yang dihapus: ");
                        System.out.print("Nama: ");
                        String hps = tasya.next();
                        lm.removeByValue(hps);
                        lm.print();
                        break;
                        
                case 3:
                        lm.print();
                        System.out.print("Input nama mahasiswa yang dicari: ");
                        String cr = tasya.next();
                        lm.carikey(cr);
                        
                        break; 
                } 
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
    } while (pilih==1 || pilih==2 || pilih==3);
   }
}