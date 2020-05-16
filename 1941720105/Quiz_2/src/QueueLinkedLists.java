public class QueueLinkedLists {
    Node head;
    int size;
    public QueueLinkedLists(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(int n, String nm, int k, int w) {
        head = new Node(n,nm,k,w,head);
        size++;
    }
    public void print(){
        if (!isEmpty()){
        Node tmp = head;    
        while (tmp != null){
        System.out.println("Nomor antrian: "+tmp.no);
        System.out.println("Nama pasien: "+tmp.nama);
        System.out.println("Keluhan pasien: "+tmp.keluhan);
        System.out.println("Waktu: "+tmp.waktu);
        System.out.println();
        tmp = tmp.next;
        } System.out.println();
        } else {
            System.out.println("Masih Kosong");
        }
    }
    public void Enqueue(int n, String nm, int k, int w){
        if (isEmpty()){
            addFirst(n,nm,k,w);
        } else {
            Node tmp = head;
            while (tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = new Node(n,nm,k,w,null);
            size++;
        }
    }
    public void Dequeue()throws Exception{
        head = head.next;
        size--;
    }
    public void cekAntrian(){
        int a=0,wktu = 0;
        if (!isEmpty()){
            Node tmp = head;
            while (tmp!=null){
                a++;
                int t = (int) tmp.waktu;
                wktu+=t;
                tmp = tmp.next;
            } System.out.println("Total Antrian: "+ a);
              System.out.println("Total Waktu Tunggu: "+ wktu +"menit");
        } else {
            System.out.println("Masih Kosong");
        }
    }
    public void cekAntrianByNo(int No){
        int t,wktu = 0, a = 0;
        Node tmp = head;
        while (tmp!=null) {
            ++a;
            int n = (int) tmp.no;
            if (No<n) {
                System.out.println("Tidak ditemukan");
                break;

            }
            t = (int) tmp.waktu;
            wktu+=t;
            tmp = tmp.next;
            if (n==No){
                System.out.println("Jumlah Antrian: "+ (a+1));
                System.out.println("Jumlah Waktu Tunggu: "+ (wktu) +"menit");
                break;
        }
    }
    }
    public void cekPasienByNo(int No)throws Exception{
        if (No<0){
            throw new Exception("indeks melebihi batas");
        } else {
            Node tmp = head;
            int a = 1;
            while(a<=No){
                a++;
                int n = (int) tmp.no;
                if (n == No){
                    break;
                } tmp = tmp.next;
            } System.out.println("Nomor urut: "+ No);
              System.out.println("Nama Pasien: "+ tmp.nama);
              System.out.println("Keluhan: "+ tmp.keluhan);
              System.out.println("Waktu Penanganan: "+ tmp.waktu);
        }
    }
    public void rataWaktu(){
        int a = 0, wktu = 0;
        if (!isEmpty()){
            Node tmp = head;
            while (tmp != null){
                a++;
                int t = (int) tmp.waktu;
                wktu+=t;
                tmp = tmp.next;
            } int r = wktu/a;
              System.out.print("Rata - rata Waktu Penanganan: "+ r);
        } else {
            System.out.print("Masih Kosong");
        }
    }
    public String keluhan(int pil){
        String klh = "Total";
        switch(pil){
            case 1 :
                System.out.println("Demam");
                break;
            case 2 :
                System.out.println("Flu");
                break;
            case 3 :
                System.out.println("Sakit Kepala");
                break;
            case 4 :
                System.out.println("Asma");
                break;
            case 5 :
                System.out.println("Diare");
                break;
            case 6 :
                System.out.println("Sakit Gigi");
                break;
            case 7 :
                System.out.println("Sakit Mata");
                break;
            case 8 :
                System.out.println("keseleo");
                break;
            case 9 :
                System.out.println("Susah tidur");
                break;
        }
        return klh;
    }
    public void statistikKeluhan(){
        if(!isEmpty()){
           for(int i=1; i<=9; i++){
               int jml = 0;
               Node tmp = head;
            while(tmp!=null){
                int kl = (int) tmp.keluhan;
                if (i == kl){
                   jml++; 
                }
                tmp=tmp.next;
            }
                String keluhan = keluhan(i);
                System.out.println(i+" "+keluhan+" : "+jml+" pasien");
           }
        }else{
            System.out.println("LinkedList kosong");
        }
    }
    public void cari (int index) throws Exception {
    if (index < 0 ) {
       throw new Exception("Nilai indeks melebihi batas");
    } else {
      int n;
      Node tmp = head;
      int a = 1;
      while (a <= index) {
      a++;
      n=(int) tmp.no;
      if(n==index){
      break;
   }
    tmp = tmp.next;
    }
       System.out.println("Data pada nomor urut ke- " + index);
       System.out.println("Nama = "+tmp.nama);
       System.out.println("Pilihan Keluhan = "+tmp.keluhan);
       System.out.println("Waktu Penanganan = "+tmp.waktu+" menit");
   }
 }
    public static int waktu(int plh){
        int waktu=0;
        switch(plh){
            case 1 :
                waktu=7;
                 break;
            case 2 :
                waktu=5;
                 break;
            case 3 :
                waktu=8;
                 break;
            case 4 :
                waktu=4;
                 break;
            case 5 :
                waktu=3;
                 break;
            case 6 :
                waktu=11;
                 break;
            case 7 :
                waktu=13;
                 break;
            case 8 :
                waktu=6;
                 break;
            case 9 :
                waktu=5;
                 break;
        }
        return waktu;
    }
}
