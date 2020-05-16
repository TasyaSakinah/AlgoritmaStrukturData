package pertemuan6;
public class Maintiket {
    public static void main(String[] args) {
        String[] nama = { "Batik Air", "Lion Air", "Air Asia"};
        float[] harga = { 2000000, 3000000, 2000000};
        int[] availableTicket = { 20, 15, 10};
        int[] soldTicket = { 15, 15, 10};
        Tiket[] tk = new Tiket[3];
        for (int i = 0; i < tk.length; i++) {
            tk[i] = new Tiket(nama[i], harga[i], availableTicket[i], soldTicket[i]);
        } System.out.println("------------------");
        System.out.println("Sebelum Sorting : ");
        for (int i = 0; i < tk.length; i++) {
            tk[i].tampil();
        } System.out.println("------------------");
        System.out.println("Sorting Bubble Sort");
        Tiket.bubbleSort(tk);
        for (int i = 0; i < tk.length; i++) {
            tk[i].tampil();
        } System.out.println("------------------");
        System.out.println("Sorting Selection Sort");
        Tiket.selectionSort(tk);
        for (int i = 0; i < tk.length; i++) {
            tk[i].tampil();
        }

    }
}
