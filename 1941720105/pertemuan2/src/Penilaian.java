public class Penilaian {
   int nilai1, nilai2;
    Penilaian(){
    } Penilaian (int n, int nl){
        nilai1 = n;
        nilai2 = nl;
    } int hitungTerbaik (int nil1, int nil2){
        int s = 0;
        if (nil1>nil2){
            s = nil1;
        } else if (nil2>nil1){
            s = nil2;
        }return s;
    }    
} 
