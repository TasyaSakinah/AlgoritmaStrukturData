import java.util.Scanner;
public class Main2 {
    public static void main (String[]args){
        Scanner tasya = new Scanner(System.in);
        System.out.println("Input kalimat: ");
        String kl = tasya.nextLine();
        String kt[] = kl.split("\\s+");
        Tugas_2 tumpukan = new Tugas_2(kt.length);
        for (int i=0; i<kt.length; i++){
            tumpukan.push(kt[i]);
        }
        tumpukan.print();
    }
}
 