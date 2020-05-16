import java.util.Scanner;
public class NasabahMain {
    public static void menu() {
        System.out.println("Menu : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. PeekRear");
        System.out.println("6. PeekPosition");
        System.out.println("7. PrintNasabah");
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Scanner tasya = new Scanner(System.in);
        System.out.print("Input banyak Nasabah: ");
        int nsb = tasya.nextInt();
        QueueNasabah Q = new QueueNasabah(nsb);
        int pilih;
        do {
            menu();
            pilih = tasya.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Input Nomor Rekening baru: ");
                    int nr = tasya.nextInt();
                    Q.Enqueue(nr);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;

                case 5:
                    Q.peekRear();
                    break;

                case 6:
                    System.out.print("input Nama Nasabah Yang akan di Cari: ");
                    String cr = tasya.nextLine();
                    Q.peekPosition(cr);
                    break;

                case 7:
                    System.out.print("Input Nomor Antrian: ");
                    int antri = tasya.nextInt();
                    Q.printNasabah(antri);
                    break;
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}