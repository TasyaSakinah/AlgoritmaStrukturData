public class JajarGenjang {
    int tinggi, panjang, sisiMiring;
    JajarGenjang(){
    } JajarGenjang (int t, int p, int sm){
        tinggi = t;
        panjang = p;
        sisiMiring = sm;
    } int hitungLuas (){
        return panjang*tinggi;
    } int hitungKeliling (){
        return 2*(panjang+sisiMiring);
    } 
}
