package pertemuan3;
public class Nilai {
    public int nilaiTugas, nilaiKuis, nilaiUts, nilaiUas;
    public double tl, rata;
    public String nama;
    public double rata (double x, double y){
        double z;
        if (x>y){
            z = x;
        } else {
            z = y;
        } return z;
    } public double hitungTotalNilai(int t, int k, int ut, int us){
        double tl = ((t*30/100)+(k*20/100)+(ut*20/100)+(us*30/100));
        return tl;
    }
     double rataDC(double arr[], int x, int y){
         if (x==y){
             return arr[1];
         } else if (x<y){
             int nilai = (x+y)/2;
             double xnilai = rataDC(arr, x, nilai-1);
             double ynilai = rataDC(arr, nilai+1, y);
             return ynilai+xnilai+arr[nilai];
         } return 0;
     }
}
