import java.util.Scanner;
public class DoubleLinkedListsMain {
    public static void menu(){
        System.out.println("==============================");
        System.out.println("Memilih menu");
        System.out.println("1. Tambah awal");
        System.out.println("2. Tambah akhir");
        System.out.println("3. Tambah Data Indeks Tertentu");
        System.out.println("4. Hapus Awal");
        System.out.println("5. Hapus Akhir");
        System.out.println("6. Hapus Indeks Tertentu");
        System.out.println("7. Cetak Data");
        System.out.println("8. Cari");
        System.out.println("9. Sorting Ascending");
        System.out.println("10. Sorting Descending");
        System.out.println("11. Keluar");
        System.out.println("==============================");
    }
    public static void main(String[] args) throws Exception{
        Scanner tasya = new Scanner (System.in);
        DoubleLinkedLists dll = new DoubleLinkedLists();
        int pilih, d, p;
        do {
           
            menu();
            System.out.print(">> ");
            pilih = tasya.nextInt();
            System.out.println("==============================");
            try {
            switch (pilih) {
                case 1: 
                    System.out.print("Masukkan data : ");
                    d = tasya.nextInt();
                    dll.addFirst(d);
                    break;
                case 2: 
                    System.out.print("Masukkan data : ");
                    d = tasya.nextInt();
                    dll.addLast(d);
                    break;
                case 3:
                    System.out.print("Masukkan data : ");
                    d = tasya.nextInt();
                    System.out.print("Masukkan posisi indeks data : ");
                    p = tasya.nextInt();
                    dll.add(d, p);
                    break;
                case 4:
                    dll.removeFirst();
                    dll.print();
                    break;
                case 5:
                    dll.removeLast();
                    dll.print();
                    break;
                case 6:
                    System.out.print("Masukkan posisi indeks data : ");
                    p = tasya.nextInt();
                    dll.remove(p);
                    dll.print();
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.print("Masukkan data yang dicari : ");
                    d = tasya.nextInt();
                    dll.cari(d);
                    break;
                case 9:
                    System.out.println("Data yang sudah di sorting dengan ascending");
                    dll.selectionSort();
                    dll.print();
                    break;
                case 10:
                    System.out.println("Data yang sudah di sorting dengan descending");
                    dll.selectionSortDesc();
                    dll.print();
                    break;
                case 11:
                    break;
            }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
    /*    dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=========================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=========================================");
        dll.add(40, 1);
        dll.print();
    /*    System.out.println("Size : "+dll.size());
        System.out.println("=========================================");
        dll.clear();
        dll.print();*/
    /*    System.out.println("Size : "+dll.size());
        System.out.println("=========================================");
        System.out.println("Data awal pada Linked Lists adalah: " + dll.getFirst());
        System.out.println("Data akhir pada Linked Lists adalah: " + dll.getLast());
        System.out.println("Data indeks ke-1 pada Linked Lists adalah: " + dll.get(1));
        
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=========================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=========================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=========================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : "+dll.size());*/
    }while (pilih==1 || pilih==2 || pilih==3 || pilih==4 || pilih==5 || pilih==6 || pilih==7 || pilih==8 || pilih==9 || pilih == 10 || pilih == 11);
}
        }