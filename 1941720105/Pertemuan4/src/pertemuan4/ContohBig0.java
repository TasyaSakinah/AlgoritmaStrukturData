package pertemuan4;
public class ContohBig0 {
    public static void contohBig0(int[] angka){
        System.out.println("Pairs: ");          //O(1)
        int n = angka.length;                   //O(1)
        for (int i=0; i<n; i++){                //O(n)
            for (int j=0; j<n; j++){            //O(n)
                System.out.println("Hai");      //O(1)
            }
        }
        for (int i=0; i<n; i++){                //O(n)
            for (int j=0; j<n; i++){            //O(n)
                System.out.println("Hai");      //O(1)
            }
        }
    }
}
