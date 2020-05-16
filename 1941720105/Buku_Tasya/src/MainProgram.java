import java.util.Scanner;
public class MainProgram {
    public static void menu(){
        System.out.println("==============================");
        System.out.println("Pilih menu: ");
        System.out.println("1. Buku Masuk");
        System.out.println("2. Buku Keluar");
        System.out.println("3. Buku Rusak");
        System.out.println("4. Tampilkan semua data");
        System.out.println("5. Cari buku");
        System.out.println("6. Exit");
        System.out.println("==============================");
    }
    public static void main(String[] args) throws Exception{
        Scanner tasya = new Scanner (System.in);
        Scanner sakinah = new Scanner (System.in);
        DoubleLinkedList bl = new DoubleLinkedList();
        int pilih, k, js, jr, bk, br, jl, b;
        String j, p;
        do {
           
            menu();
            System.out.print("Masukkan pilihan menu: ");
            pilih = tasya.nextInt();
            System.out.println("==============================");
            try {
            switch (pilih) {
                case 1: 
                    System.out.print("Kode : ");
                    k = tasya.nextInt();
                    System.out.print("Judul : ");
                    j = sakinah.nextLine();
                    System.out.print("Penerbit : ");
                    p = sakinah.nextLine();
                    System.out.print("Jumlah Stok : ");
                    js = tasya.nextInt();
                    System.out.print("jumlah Rusak : ");
                    jr = tasya.nextInt();
                    bl.addFirst(k,j,p,js,jr);
                    break;
                case 2:
                    System.out.print("Masukkan indeks buku keluar : ");
                    bk = tasya.nextInt();
                    bl.remove(bk);
                    break;
                case 3:
                    System.out.print("Masukkan indeks buku rusak : ");
                    br = tasya.nextInt();
                    System.out.print("jumlah : ");
                    jl = tasya.nextInt();
                    bl.cek(jl);
                    break;
                case 4:
                    bl.print();
                    break;
                case 5:
                    System.out.print("Masukkan indeks buku : ");
                    b = tasya.nextInt();
                    bl.cari(b);
                    break;
                case 6:
                    break;
                    }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            }while (pilih==1 || pilih==2 || pilih==3 || pilih==4 || pilih==5 || pilih==6);
}
}
