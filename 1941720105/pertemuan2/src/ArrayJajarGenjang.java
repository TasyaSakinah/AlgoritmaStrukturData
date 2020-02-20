public class ArrayJajarGenjang {
    public static void main (String[]args){
      JajarGenjang[] jgArray = new JajarGenjang[4];
      
      jgArray[0] = new JajarGenjang();
      jgArray[0].panjang = 10;
      jgArray[0].tinggi = 4;
      jgArray[0].sisiMiring = 2;
      
      jgArray[1] = new JajarGenjang();
      jgArray[1].panjang = 20;
      jgArray[1].tinggi = 10;
      jgArray[1].sisiMiring = 3;
      
      jgArray[2] = new JajarGenjang();
      jgArray[2].panjang = 15;
      jgArray[2].tinggi = 6;
      jgArray[2].sisiMiring = 2;
      
      jgArray[3] = new JajarGenjang();
      jgArray[3].panjang = 25;
      jgArray[3].tinggi = 10;
      jgArray[3].sisiMiring = 3;
      for (int i=0; i<jgArray.length; i++){
          System.out.println("Jajar genjang ke "+i);
          System.out.println("panjang: "+jgArray[i].panjang+", tinggi: "+jgArray[i].tinggi);
          System.out.println("Luas jajar genjang ke "+i+": "+jgArray[i].hitungLuas());
          System.out.println("Keliling jajar genajng ke "+i+": "+jgArray[i].hitungKeliling());
          System.out.println();
      }
}
}
