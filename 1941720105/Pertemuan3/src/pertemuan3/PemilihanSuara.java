
package pertemuan3;
public class PemilihanSuara {
    public static int angka;
    public static int temp;
    public static int terima;
    public int banyakKandidat = 4, banyakSuara, suara;
    public String kandidat;
    public static int arr[] = new int [500];
  public static int hitungSuara(int jml, int kd1, int kd2, int kd3, int kd4){
      if (angka==5){
          angka=1;
      } if (angka==1&&kd1>0){
          arr[temp] = angka;
          temp++;
          angka++;
          return hitungSuara(jml, kd1-1, kd2, kd3, kd4);
      } else if (angka==2&&kd2>0){
          arr[temp] = angka;
          temp++;
          angka++;
          return hitungSuara(jml, kd1, kd2-1, kd3, kd4);
      } else if (angka==3&&kd3>0){
          arr[temp] = angka;
          temp++;
          angka++;
          return hitungSuara(jml, kd1, kd2, kd3-1, kd4);
      } else if (angka==4&&kd4>0){
          arr[temp] = angka;
          temp++;
          angka++;
          return hitungSuara(jml, kd1, kd2, kd3, kd4-1);
      }else if (kd1==0&&kd2==0&&kd3==0&&kd4==0){
          if (arr[terima]==arr[terima+1]&&terima+1<jml){
              return arr[terima];
          } else if (terima+2<jml){
              terima+=2;
              return hitungSuara(jml, kd1, kd2, kd3, kd4);
          } else {
              return 0;
          }
      } else {
          angka++;
          return hitungSuara(jml, kd1, kd2, kd3, kd4);
      }
  }  
}
