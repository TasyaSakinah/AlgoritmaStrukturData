package percobaan;
import java.util.Scanner;
public class QueueMain {
    public static void main (String[]args){
        Scanner tasya = new Scanner (System.in);
        Queue q = new Queue();
        boolean status = true;
        while (status){
            System.out.println("------MENU------");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Cari");
            System.out.println("4. Daftar gerbong");
            System.out.println("Pilih menu: ");
            int plh = tasya.nextInt();
            System.out.println();
            switch (plh){
                case 1: 
                    System.out.print("Nomor gerbang: ");
                    String n = tasya.next();
                    System.out.print("Jumlah penumpah: ");
                    String jum = tasya.next();
                    q.Enqueue(n, jum);
                    break;
                case 2:
                    q.peek();
                    q.Dequeue();
                    break;
                case 3:
                    System.out.println("1. Cari gerbong terdepan");
                    System.out.println("2. Cari gerbong terbelakang");
                    System.out.print("Pilih: ");
                    int pil = tasya.nextInt();
                    System.out.println();
                    if (pil == 1){
                        q.peek();
                    } else if (pil == 2){
                        q.peekRear();
                    }else {
                        System.out.print("Input salah");
                    } break;
                case 4: 
                    System.out.println("Daftar gerbong: ");
                    q.print();
                    break;
            }
        }
        System.out.println("");
    }
}
