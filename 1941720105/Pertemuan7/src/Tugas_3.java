public class Tugas_3 {
    public int [] data;
    public int jumData;
    int max;
    public Tugas_3 (int[] Data, int jmlData){
        this.jumData = jmlData;
        data = new int [jmlData];
        for (int i=0; i<jumData; i++){
            data[i] = Data[i];
        }
    }
    public void TampilData(){
        for (int i=0; i<jumData; i++){
            System.out.println(data[i] + " ");
        }
        System.out.println();
    }
    public int FindBinarySearch(int cari, int data[], int left, int right){
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
    public int Max (int cari, int data[]){
        for (int i=0; i<jumData; i++){
            if (cari == data[i]){
                max++;
            }
        }
        return max;
    }
    public void TampilPosisi(int x, int pos){
        if (pos != -1){
            System.out.println("Data terbesar: "+ x +"ditemukan pada indeks "+pos);
        } else {
            System.out.println("Data: "+ x +"tidak ditemukan");
        }
    }
    public int mx (int angk[]){
        int makx = angk[0];
        for (int i=0; i<10; i++){
            if (angk[i]>makx){
                makx = angk[i];
            }
        }
        return makx;
    }
}
