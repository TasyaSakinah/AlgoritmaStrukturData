public class uts {
    public char []data;
    public int jmlData;
    public char cari;
    public int []ind;
  public uts (char []Data, int jmlData){
      this.jmlData = jmlData;
      this.cari = cari;
      data = new char [jmlData];
      for (int i=0; i<jmlData; i++){
          data[i] = Data[i];
      }
 }
   public int FindSeqSearch (char cari){
        int posisi = -1;
        for (int j=0; j<jmlData; j++){
            if (data[j] == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
  public void TampilData(){
        for (int i=0; i<jmlData; i++){
            System.out.println(data[i] + " ");
        }
        System.out.println();
    }
    public int FindBinarySearch(char cari, char data[], int left, int right){
        int mid;
        if (right>=left){
            mid = (left+right)/2;
            if (cari==data[mid]){
                return (mid);
            } else if (data[mid]>cari){
                return FindBinarySearch(cari, data, left, mid-1);
            } else {
                return FindBinarySearch(cari, data, mid+1, right);
            }
        }
        return -1;
    }
    public void TampilPosisi(char x, int posisi){
        if (posisi != -1){
            System.out.print("Huruf: "+ x +" ditemukan pada indeks ");
            for (int i=0; i<jmlData; i++){
                if (data[i]==x){
                    System.out.print("'"+i);
                    System.out.print("',");
                }
            }
        } else {
            System.out.println("Data: "+ x +" tidak ditemukan");
        }
    }
}
 