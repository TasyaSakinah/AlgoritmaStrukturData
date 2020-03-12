public class Nama {
    String nm;
    public static void countHuruf(String nm){
    char []huruf=new char[nm.length()];                             //O(1)
    int []jmlhHuruf=new int[nm.length()];                           //O(1)
    huruf[0]=nm.charAt(0);                                          //O(1)
    jmlhHuruf[0]=1;                                                 //O(1)
    int beda=1;                                                     //O(1)
    for (int i=1; i<nm.length(); i++){                              //O(n)
        boolean benar=false;                                        //O(1)
        if (nm.charAt(i)!=' '){
            for (int j=0; j<beda; j++){                             //O(n)
                if (nm.charAt(i)==huruf[j]){
                    benar=true;                                     //O(1)
                    jmlhHuruf[j]+=1;                                //O(1)
                }
            } if (!benar){
                huruf[beda]=nm.charAt(i);                           //O(1)
                jmlhHuruf[beda]=1;                                  //O(1)
                beda++;                                             //O(1)
            }
        }
    } for (int i=0; i<beda; i++){                                   //O(n)
        System.out.println("Huruf "+huruf[i]+": "+jmlhHuruf[i]);    //O(1)
    }
}
}
// 1+1+1+1+1+(19*1*8)+(8*1*1)+(8*1)
// 5+152+8+8
// 173
// notasi Big O = O(n^2)