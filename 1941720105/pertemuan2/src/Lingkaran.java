public class Lingkaran {
      public double phi;
   public double jrijri;
   
   Lingkaran() {
   }Lingkaran (double p, double r){
       phi = p;
       jrijri = r;
   } double hitungLuas (double p, double r){
       return phi*jrijri*jrijri;
   } double hitungKeliling (double p, double r){
       return 2*phi*jrijri;
   }
}

