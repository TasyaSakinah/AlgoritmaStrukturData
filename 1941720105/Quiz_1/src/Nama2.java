
public class Nama2 {

    char min, max, min1, max1;

    public void Nama_2(String nm) {
        min = nm.charAt(0);                                             //O(1)
        max = nm.charAt(0);                                             //O(1)
        for (int i = 0; i < nm.length(); i++) {                         //O(n)
            if (nm.charAt(i) != ' ') {
                if (nm.charAt(i) < min) {
                    min = nm.charAt(i);                                 //O(1)
                } else if (nm.charAt(i) > max) {
                    max = nm.charAt(i);                                 //O(1)
                }
            }
        }
    }

    public void MaxMin(String nm, int indeksAwal, int indeksAkhir) {
        int tengah;
        char min2, max2;                                                
        if (indeksAwal == indeksAkhir) {
            min1 = nm.charAt(indeksAwal);                               //O(1)
            max1 = nm.charAt(indeksAkhir);                              //O(1)
        } else {
            tengah = (indeksAwal + indeksAkhir) / 2;                    //O(1)
            MaxMin(nm, indeksAwal, tengah);                             //O(1)
            max2 = max1;                                                //O(1)
            min2 = min1;                                                //O(1)
            MaxMin(nm, tengah + 1, indeksAkhir);
            if (max2 != ' ' && min2 != ' ') {
                if (max2 > max1) {
                    max1 = max2;                                        //O(1)
                }
                if (min2< min1) {
                    min1 = min2;                                        //O(1)
                }
            }
        }
    }

    public char hasilMax() {
        return max1;                                                    //O(1)
    }

    public char hasilMin() {
        return min1;                                                    //O(1)
    }
}
// 1+1(19*1*1)+1+1+1+(2^6*1*1)+1+1+1+1
// 2+19+3+64+4
// 92
// notasi BigO = O(2^k)