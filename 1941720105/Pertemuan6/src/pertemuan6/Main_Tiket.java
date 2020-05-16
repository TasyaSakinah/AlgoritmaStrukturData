package pertemuan6;
public class Main_Tiket {
    public static void main (String[]args){
        String[] nama = { "Batik Air", "Lion Air", "Air Asia"};
        float[] harga = { 2000000, 3000000, 2000000};
        int[] availableTicket = { 20, 15, 10};
        int[] soldTicket = { 15, 15, 10};
        Tugas_Tiket[] tk = new Tugas_Tiket[3];
        for (int i = 0; i < tk.length; i++) {
            tk[i] = new Tugas_Tiket(nama[i], harga[i], availableTicket[i], soldTicket[i]);
        } System.out.println("------------------");
        System.out.println("Sebelum Sorting : ");
        for (int i = 0; i < tk.length; i++) {
            tk[i].tampil();
        } System.out.println("------------------");
        System.out.println("Sorting Bubble Sort");
        DaftarTiket.bubbleSort(tk);
        for (int i = 0; i < tk.length; i++) {
            tk[i].tampil();
        } System.out.println("------------------");
        System.out.println("Sorting Selection Sort");
        DaftarTiket.selectionSort(tk);
        for (int i = 0; i < tk.length; i++) {
            tk[i].tampil();
        }
    }
}
