package pertemuan6;
public class Liga {
    String namaKlub;
    int main;
    int selisihGol;
    int totalPoint;
    Liga(String namaKlub, int main, int selisihGol, int totalPoint){
       this.namaKlub = namaKlub;
       this.main = main;
       this.selisihGol = selisihGol;
       this.totalPoint = totalPoint;
    }
    void tampil (){
        System.out.println("Nama klub "+namaKlub);
        System.out.println("Main "+main);
        System.out.println("Selisih gol "+selisihGol);
        System.out.println("Total point "+totalPoint);
    }
}
