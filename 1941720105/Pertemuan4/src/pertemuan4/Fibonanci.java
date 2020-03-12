package pertemuan4;
public class Fibonanci {
    public int a;
    
    public static void FibonanciBF(int n){
        int a1=0, a2=1, jumlah = 0;                     //O(1)
        for (int i=0; i<n; i++){                        //O(n)
                a1=a2;                                  //O(1)
                a2=jumlah;                              //O(1)
                System.out.println(jumlah+" ");         //O(1)
                jumlah=a1+a2;                           //O(1)
            } 
        }
      
    public static int FibonanciDC(int n){
        if (n<=1){
            return n;                                   //O(1)
        }
              return FibonanciDC(n-1)+FibonanciDC(n-2); //O(n)
        }
}

    

