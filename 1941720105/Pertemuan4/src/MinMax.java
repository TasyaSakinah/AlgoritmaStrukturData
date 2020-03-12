public class MinMax {
    public int nilaiArray, min, max;
    void MinMax(int[] arr, int n){
        min = arr[0];                                           //O(1)
        max = arr[0];                                           //O(1)
        for (int i=0; i<n; i++){                                //O(n)
            if (arr[i]<min){
                min = arr[i];                                   //O(1)
            } else if (arr[i]>max){
                max = arr[i];                                   //O(1)
            }
        }
    } int hasilMin(){
      return min;                                                //O(1)
    } int hasilMax(){
        return max;                                              //O(1)
    }
    public static void max_min(int[] arr, int indeks_awal, int indeks_akhir, MaxMin hasil){
        int indeks_tengah;
        MaxMin hasil1 = new MaxMin();
        MaxMin hasil2 = new MaxMin();
        if (indeks_awal == indeks_akhir){
            hasil.minimum = hasil.maximum = arr[indeks_awal];                               //O(1)
        } else if (indeks_akhir - indeks_awal == 1){
            if (arr[indeks_awal]>arr[indeks_akhir]){
                hasil.minimum = arr[indeks_akhir];                                          //O(1)
                hasil.maximum = arr[indeks_awal];                                           //O(1)
            } else{
                hasil.minimum = arr[indeks_awal];                                           //O(1)
                hasil.maximum = arr[indeks_akhir];                                          //O(1)
            }
        } else{
            indeks_tengah = (indeks_awal+indeks_akhir)/2;                                   //O(n)
            max_min(arr, indeks_awal, indeks_tengah, hasil1);                               //O(n)
            max_min(arr, indeks_tengah+1, indeks_akhir, hasil2);                            //O(n)
            hasil.minimum = (hasil1.minimum<hasil2.minimum)?hasil1.minimum:hasil2.minimum;
            hasil.maximum = (hasil1.maximum>hasil2.maximum)?hasil1.maximum:hasil2.maximum;
        }
    }
}
