import java.util.Scanner;
public class StackMain {
   public static void main (String[]args){
       Scanner tasya = new Scanner (System.in);
     //  Scanner sakinah = new Scanner (System.in);
       System.out.println("Masukkan jumlah elemen: ");
       int jml = tasya.nextInt();
       Stack tumpukan = new Stack(jml);
    //   System.out.println("array awal yang diisi: ");
    //   int aw = tasya.nextInt();
       for (int i=0; i<jml; i++){
           System.out.println("Elemen ke "+(i+1)+": ");
           int arr = tasya.nextInt();
           tumpukan.push(arr);
       }
       tumpukan.print();
       System.out.println("Menu: ");
       System.out.println("1. Push");
       System.out.println("2. Pop");
       System.out.println("3. Peek");
       System.out.println("4. Print");
       System.out.println("Masukkan pilihan: ");
       int pil = tasya.nextInt();
       if (pil==1){
           System.out.println("Input tambahan elemen: ");
           int t = tasya.nextInt();
           tumpukan.push(t);
           tumpukan.print();
       } else if (pil==2){
           tumpukan.pop();
           tumpukan.print();
       } else if (pil==3){
           tumpukan.peek();
       } else if (pil==4){
           tumpukan.print();
       } else {
           
       }
    //   Stack tumpukan = new Stack(4);
    //   tumpukan.push(15);
    //   tumpukan.push(31);
    //   tumpukan.push(9);
    //   tumpukan.push(12);
    //   tumpukan.print();
    //   tumpukan.pop();
    //   tumpukan.peek();
    //   tumpukan.push(17);
    //   tumpukan.push(98);
    //   tumpukan.print();
       }
   } 

