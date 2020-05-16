package pertemuan6;
//import java.util.Scanner;
public class MainLiga {
    public static void main (String[]args){
      //  Scanner tasya = new Scanner (System.in);
        //Scanner sakinah = new Scanner (System.in);
        String[] namaKlub = {"Liverpool","Manchester City","Leicester","Chelsea",
            "Wolverhampton Wanderers","Sheffield United","Manchester United",
            "Tottenham Hotspur","Arsenal","Bumley","Crystal Palace","Everton",
            "Newcastle United","Southampton","Brighton & Hove Albion",
            "Wesr Ham United","Watford","AFC Boumemouth","Aston Villa","Norwich City"};
        int []main = {29,27,28,29,29,28,28,29,28,29,29,29,29,29,29,29,29,29,27,29};
        int []selisihGol = {45,39,26,9,7,5,12,7,4,-6,-6,-6,-16,-17,-8,-15,-17,-18,-18,27};
        int []totalPoint = {82,57,50,48,43,43,42,41,40,39,39,37,35,34,29,27,27,27,25,21};
       // Liga[] lg = new Liga[20];
        Liga[] lg = new Liga[namaKlub.length];
        for (int i=0; i<lg.length; i++){
            lg[i] = new Liga(namaKlub[i],main[i],selisihGol[i],totalPoint[i]);
        } System.out.println("----------------------");
        System.out.println("Sebelum proses sorting");
        for (int i=0; i<lg.length; i++){
            lg[i].tampil();
        } System.out.println("----------------------");
        System.out.println("Sorting Insertion Sort Ascending");
          DaftarLiga.insertionSort(lg,false);
          for (int i=0; i<lg.length; i++){
              lg[i].tampil();
          } System.out.println("----------------------");
          System.out.println("Sorting Insertion Sort Descending");
          DaftarLiga.insertionSort(lg, true);
          for (int i=0; i<lg.length; i++){
              lg[i].tampil();
          }
    }
}
