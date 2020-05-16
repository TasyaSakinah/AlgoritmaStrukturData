import java.util.Scanner;
public class BinaryTreeMain {
    public static void menu(){
       System.out.println("===================================");
       System.out.println("MENU");
       System.out.println("===================================");
       System.out.println("Pilihan menu");
       System.out.println("1.add");
       System.out.println("2.delete");
       System.out.println("3.find");
       System.out.println("4.traverseinorder");
       System.out.println("5.traversepreorder");
       System.out.println("6.traversepostorder");
       System.out.println("7.Menambahkan node dengan rekursif");
       System.out.println("8.Menampilkan data di leaf");
       System.out.println("9.Menampilkan jumlah di leaf");
       System.out.println("10.keluar");
       System.out.println("==================================");
        }
    public static void main(String[] args){
        Scanner tasya = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        
        int pilih=0;
        try{
            do{
                menu();
                System.out.print("pilih menu: ");
                pilih=tasya.nextInt();
                switch(pilih){
                case 1:
                    System.out.print("Input Data: ");
                    bt.add(tasya.nextInt());
                    break;
                
                case 2:
                    System.out.print("Input Data: ");
                    bt.delete(tasya.nextInt());
                    break;
                
                case 3:
                    System.out.print("Input Data: ");
                    int cr=tasya.nextInt();
                    bt.find(cr);
                    System.out.println("Hasil Find: "+bt.find(cr));
                    break;
                
                case 4:
                    bt.traverseInOrder(bt.root);
                    System.out.println();

                    break;
                
                case 5:
                    bt.traversePreOrder(bt.root);
                    System.out.println();
                    break;
                
                case 6:
                    bt.traversePostOrder(bt.root);
                    System.out.println();
                    break;
                
                case 7:
                    System.out.print("Input Data: ");
                    bt.addRecursion(bt.root, tasya.nextInt());
                    break;                    
                
                case 8:
                    bt.getDataLeaf(bt.root);
                    System.out.println();
                    break;
                
                case 9:
                    bt.getCountLeaf(bt.root);
                    System.out.println();
                    break;                    
                
                }
            }while(pilih!=10);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}