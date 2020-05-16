package pertemuan6;
public class Tiket {
    String nama;
    float harga;
    int availableTicket;
    int soldTicket;

    Tiket (String nama,float harga,int availableTicket,int soldTicket){
        this.nama = nama;
        this.harga = harga;
        this.availableTicket = availableTicket;
        this.soldTicket = soldTicket;
    }

    void tampil(){
        System.out.println("Nama pesawat "+nama);
        System.out.println("Harga tiket "+harga);
        System.out.println("Tiket yang tersedia "+availableTicket);
        System.out.println("Tiket yang terjual "+soldTicket);
    }

    public static void bubbleSort(Tiket[]arry){
       for (int i=0; i<arry.length-1; i++){
           for (int j=1; j<arry.length-i; j++){
               if (arry[j].harga>arry[j-1].harga){
                   Tiket temp = arry[j];
                   arry [j] = arry [j-1];
                   arry [j-1] = temp;
           }
           }
       }
    }

    public static void selectionSort(Tiket[] arry) {
        for (int i=0; i<arry.length-1; i++){
           int ixMin = i;
           for (int j=i+1; j<arry.length; j++){
               if (arry[j].harga<arry[ixMin].harga){
                   ixMin = j;
               }
               Tiket temp = arry[ixMin];
               arry[ixMin] = arry[i];
               arry[i] = temp;
           }
       }
    }
}
       DaftarTiket dt = new DaftarTiket();
        int jumTkt = 3;
        for (int i=0; i<jumTkt; i++){
            System.out.println("Nama pesawat : ");
            String nama = sakinah.nextLine();
            System.out.println("Harga pesawat : ");
            float harga = tasya.nextInt();
            System.out.println("Tiket yang tersedia : ");
            int availableTicket = tasya.nextInt();
            System.out.println("Tiket yangb terjual : ");
            int soldTicket = tasya.nextInt();
            Tugas_Tiket t = new Tugas_Tiket(nama,harga,availableTicket,soldTicket);
            dt.tambah(t);
        }
        System.out.println("Data sebelum sorting : ");
        dt.tampil();
        System.out.println("Data setelah sorting : ");
        dt.bubbleSort();
        dt.tampil();
        System.out.println("Data selection sort sorting : ");
        dt.selectionSort();
        dt.tampil();
    }
}