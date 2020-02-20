public class Tugas_1 {
   public double phi = 3.14;
   public double jrijri ;
   Tugas_1() {
   }Tugas_1 (double p, double r){
       phi = p;
       jrijri = r;
   } double hitungLuas (double p, double r){
       return phi*jrijri*jrijri;
   } double hitungKeliling (double p, double r){
       return 2*phi*jrijri;
   }
    
}
