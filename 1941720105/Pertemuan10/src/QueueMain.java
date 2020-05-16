import java.util.Scanner;
public class QueueMain {
        public static void menu(){
            System.out.println("Masukkan operasi yang diinginkan: ");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. PeekRear");
            System.out.println("6. PeekPosition");
            System.out.println("7. PeekAt");
            System.out.println("-------------------");
        }
        public static void main (String[]args){
        Scanner tasya = new Scanner (System.in);  
        System.out.println("Masukkan jumlah maksimal antrian: ");
        int n = tasya.nextInt();
        Queue Q = new Queue(n);
        int pilih;
        do {
            menu();
            pilih = tasya.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = tasya.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0){
                        System.out.println("Data yang dikeluarkan: "+ dataKeluar);
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
                    System.out.println("Input posisi data yang dicari: ");
                    int cr = tasya.nextInt();
                    Q.peekPosition(cr);
                    break;
                case 7:
                    System.out.println("Posisi antrian: ");
                    int c = tasya.nextInt();
                    Q.peekAt(c);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih ==4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}