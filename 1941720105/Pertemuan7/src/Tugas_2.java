public class Tugas_2 {
    public int [][] data;
    public int jumBaris, jumKolom;
     public Tugas_2 (int[][] Data, int jmlBaris, int jmlKolom){
        this.jumBaris = jmlBaris;
        this.jumKolom = jmlKolom;
        data = new int [jmlBaris][jmlKolom];
        for (int i=0; i<jumBaris; i++){
            for (int j=0; j<jumKolom; j++){
                data[i][j] = Data[i][j];
            }         
        }
    }
    public int[] FindSeqSearch (int cari){
        int[]posisi = new int [2];
        posisi[0] = -1;
        posisi[1] = -1;
        for (int i=0; i<jumBaris; i++){
            for (int j=0; j<jumKolom; j++){
                if (data[i][j] == cari){
                posisi[0] = i;
                posisi[1] = j;
                break;
            }
            }
        }
        return posisi;
    }
    public void TampilData(){
        for (int i=0; i<jumBaris; i++){
            for (int j=0; j<jumKolom; j++){
                System.out.println(data[i][j] + "\t ");
            }
        }
        System.out.println();
    }
    public void TampilPosisi(int x, int[] pos){
        if (pos[0] != -1&&pos[1] != -1){
            System.out.println("Data: "+ x +"ditemukan pada indeks "+pos[0]+","+pos[1]);
        } else {
            System.out.println("Data: "+ x +"tidak ditemukan");
        }
    }
}
