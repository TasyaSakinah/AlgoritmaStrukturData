package quiz_1;
public class Nama_2 {
    char min, max;
    public void Nama_2 (String nm){
        min = nm.charAt(0);
        max = nm.charAt(0);
        for (int i=0; i<nm.length(); i++){
            if (nm.charAt(i)<min){
                min=nm.charAt(i);
            } else if (nm.charAt(i)>max){
                max=nm.charAt(i);
            }
        }
    } public void Max_Min(String nm, int indeksAwal, int indeksTengah, int indeksAkhir){
       // int tengah;
        char min = 0, max = 0;
        if (indeksAwal==indeksAkhir){
            min = nm.charAt(indeksAwal);
            max = nm.charAt(indeksAkhir);
        } else {
            indeksTengah = (indeksAwal+indeksAkhir)/2;
            Max_Min(nm, indeksAwal, indeksTengah, indeksAkhir);
            Max_Min(nm, indeksTengah+1, indeksAkhir, indeksAwal);
            if (max!=' '&&min!=' '){
                if (max<min){
                    min=max;
                } else if (max>min){
                    max=min;
                }
        }
        }
    } public char hasilMax(){
            return max;
        } public char hasilMin(){
            return min;
        }
}
