
public class Faktorial {

    public int nilai;

    public int faktorialBF(int n) {
        int fakto = 1;              //O(1)
        int i = 1;                  //O(1)
        while (i <= n) {            //O(n)
            fakto = fakto * i;      //O(1)
            i++;                    //O(1)
        }
        return fakto;               //O(1)
    }

    public int faktorialDC(int n) {
        if (n == 1) {               
            return 1;                           //O(1)
        } else {
            int fakto = n * faktorialDC(n - 1); //O(n)
            return fakto;                       //O(1)
        }
    }
}
