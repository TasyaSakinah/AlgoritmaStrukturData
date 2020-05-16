package pertemuan6;
public class DaftarLiga {

       
   // int indx;
   // void tambah(Liga l){
     //   if (indx<lg.length){
       //     lg[indx] = l;
         //   indx++;
        //} else {
          //  System.out.println("Data penuh");
        //} 
   // }
  //  void tampil(Liga[]arr){
    //    for (Liga l:arr){
      //      l.tampil();
        //    System.out.println("--------------");
        //}
   // }
    public static void insertionSort(Liga[]lg,boolean ascending){
        int i, j;
        for (i=1; i<lg.length; i++){
            Liga tmp ;
            tmp = lg[i];
            j = i;
            if (ascending==true){
                while ((j>0)&&(lg[j-1].totalPoint>tmp.totalPoint));
                lg[j] = lg[j-1];
                j--;
            } else {
                while ((j<0)&&(lg[j-1].totalPoint<tmp.totalPoint));
                lg[j] = lg[j-1];
                j--;
            }
            lg[j] = tmp;
        }
    }
}
