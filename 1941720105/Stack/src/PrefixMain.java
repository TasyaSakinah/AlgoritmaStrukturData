import java.util.Scanner;
public class PrefixMain {
    public static void main (String[]args){
        Scanner tasya = new Scanner (System.in);
        String P, Q, k="";
        System.out.println("Masukkan ekspresi matematika: ");
        Q = tasya.nextLine();
        for(int i=(Q.length()-1); i>=0; i--){
            k = k+Q.charAt(i);
        } k = k.trim();
          k = k+"(";
          int jml = k.length();
          Prefix p = new Prefix(jml);
          P = p.konversi(k);
          System.out.println("Prefix: "+new StringBuffer(P).reverse());
    }
}
