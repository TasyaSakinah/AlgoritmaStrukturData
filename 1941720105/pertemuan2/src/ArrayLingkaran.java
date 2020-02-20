public class ArrayLingkaran {
    public static void main (String[]args){
      Lingkaran[] lgArray = new Lingkaran[4];
      
      lgArray[0] = new Lingkaran();
      lgArray[0].phi = 3.14;
      lgArray[0].jrijri = 4;
      
      lgArray[1] = new Lingkaran();
      lgArray[1].phi = 3.14;
      lgArray[1].jrijri = 3;
      
      lgArray[2] = new Lingkaran();
      lgArray[2].phi = 3.14;
      lgArray[2].jrijri = 6;
      
      lgArray[3] = new Lingkaran();
      lgArray[3].phi = 3.14;
      lgArray[3].jrijri = 5;
      for (int i=0; i<lgArray.length; i++){
          System.out.println("Lingkaran ke "+i);
          System.out.println("phi: "+lgArray[i].phi+", jari-jari: "+lgArray[i].jrijri);
          System.out.println("Luas lingkaran ke "+i+": "+lgArray[i].hitungLuas(lgArray[i].phi,lgArray[i].jrijri));
          System.out.println("Keliling lingkaran ke "+i+": "+lgArray[i].hitungKeliling(lgArray[i].phi,lgArray[i].jrijri));
          System.out.println();
      }
  }
}
