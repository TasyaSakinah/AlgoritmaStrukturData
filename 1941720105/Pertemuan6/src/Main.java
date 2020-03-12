import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        Scanner s = new Scanner (System.in);
        Scanner s1 = new Scanner (System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs = 5;
        for (int i=0; i<jumMhs; i++){
            System.out.print("Nama = ");
            String nama = s1.nextLine();
            System.out.print("Thn masuk = ");
            int thn = s.nextInt();
            System.out.print("Umur = ");
            int umur = s.nextInt();
            System.out.print("IPK = ");
            double ipk = s.nextDouble();
            Mahasiswa m = new Mahasiswa(nama,thn,umur,ipk);
            data.tambah(m);
        }   System.out.println("Data mahasiswa sebelum sorting = ");
            data.tampil();
            System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk = ");
            data.bubbleSort();
            data.tampil();
            System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk = ");
            data.selectionSort();
            data.tampil();
            System.out.println("Data mahasiswa setelah Di Insertion Sort = ");
            data.insertionSort(true);
            data.tampil();
        }
    }

