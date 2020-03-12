package pertemuan4;
import java.util.Scanner;
public class MainFibonanci {
    public static void main (String[]args){
        Scanner tasya = new Scanner (System.in);
        System.out.println("Masukkan jumlah nilai: ");
        int total = tasya.nextInt();
        Fibonanci fb = new Fibonanci();
        System.out.println("Brute Force");
        fb.FibonanciBF(total);
        System.out.println("Devide and Conquer");
        int pjng[]=new int[total];
        System.out.println();
        for(int i=0; i<total; i++){
            System.out.println(fb.FibonanciDC(i)+" ");
        }
        }
    }

