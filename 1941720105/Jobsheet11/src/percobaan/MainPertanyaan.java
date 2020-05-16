package percobaan;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MainPertanyaan {
    public static void menu(){
        System.out.println("-------------");
        System.out.println("Menu utama");
        System.out.println("-------------");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("4. Keluar");
        System.out.println("-------------");
    }
    
    public static void subMenu1(){
        System.out.println("----------------");
        System.out.println("Submenu Tambah");
        System.out.println("----------------");
        System.out.println("1. AddFirst");
        System.out.println("2. AddIndex");
        System.out.println("3. AddLast");
        System.out.println("4. Print");
        System.out.println("5. Out");
        System.out.println("----------------");
    }
    
    public static void subMenu2(){
        System.out.println("-----------------");
        System.out.println("Submenu Hapus");
        System.out.println("-----------------");
        System.out.println("1. RemoveIndex");
        System.out.println("2. RemoveKey");
        System.out.println("3. Clear");
        System.out.println("4. Print");
        System.out.println("5. Out");
        System.out.println("-----------------");
    }
    
    public static void subMenu3() {
        System.out.println("-----------------");
        System.out.println("Submenu Cari");
        System.out.println("-----------------");
        System.out.println("1. SearchIndex");
        System.out.println("2. SearchKey");
        System.out.println("3. Out");
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        Scanner tasya = new Scanner(System.in);
        LinkedListsPertanyaan data = new LinkedListsPertanyaan();
        int pilih1, pilih2 = 0, kmbl = 0, lagi = 0, n, i;

        do {
            kmbl = 1;
            menu();
            System.out.print("Pilih menu: ");
            pilih1 = tasya.nextInt();
            switch (pilih1) {
                case 1:
                    do {
                        subMenu1();
                        System.out.print("Pilih submenu: ");
                        pilih2 = tasya.nextInt();
                        if (pilih2 == 1) {
                            System.out.print("Nilai: ");
                            n = tasya.nextInt();
                            data.addFirst(n);
                            System.out.print("Lagi? (1/0) ");
                            lagi = tasya.nextInt();
                        } else if (pilih2 == 2) {
                            try {
                                System.out.print("Nilai: ");
                                n = tasya.nextInt();
                                System.out.print("Index: ");
                                i = tasya.nextInt();
                                data.add(n, i);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.print("Lagi? (y/t)");
                        } else if (pilih2 == 3) {
                            System.out.print("Nilai: ");
                            n = tasya.nextInt();
                            data.addLast(n);
                            System.out.print("Lagi? (y/t)");
                        } else if (pilih2 == 4) {
                            data.print();
                        } else if (pilih2 == 5) {
                            break;
                        } else {
                            lagi = 1;
                        }
                    } while (lagi == 1 || pilih2 == 1 || pilih2 == 2 || pilih2 == 3 || pilih2 == 4 || pilih2 == 5);
                case 2:
                    do {
                        lagi = 1;
                        subMenu2();
                        System.out.print("pilih submenu: ");
                        pilih2 = tasya.nextInt();
                        if (pilih2 == 1) {
                            try {
                                System.out.print("Index: ");
                                i = tasya.nextInt();
                                data.remove(i);
                                System.out.print("Lagi? (y/t)");
                                lagi = tasya.nextInt();
                            } catch (Exception e) {
                                Logger.getLogger(MainPertanyaan.class.getName()).log(Level.SEVERE, null, e);
                            }
                        } else if (pilih2 == 2) {
                            try {
                                System.out.print("Nilai yang dicari: ");
                                n = tasya.nextInt();
                                System.out.print("Index: ");
                                i = tasya.nextInt();
                                System.out.print("Nilai yang dicari: ");
                                n = tasya.nextInt();
                                data.removeByValue(n, i, n);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.print("Lagi? (y/t)");
                            lagi = tasya.nextInt();
                        } else if (pilih2 == 3) {
                            data.clear();
                            System.out.print("Lagi? (y/t)");
                            lagi = tasya.nextInt();
                        } else if (pilih2 == 4) {
                            data.print();
                        } else if (pilih2 == 5) {
                            break;
                        } else {
                            lagi = 1;
                        }
                    } while (lagi == 1 || pilih2 == 1 || pilih2 == 2 || pilih2 == 3 || pilih2 == 4 || pilih2 == 5);
                case 3:
                    do {
                        lagi = 1;
                        subMenu3();
                        System.out.print("pilih submenu: ");
                        pilih2 = tasya.nextInt();
                        if (pilih2 == 1) {
                            try {
                                System.out.print("Index yang dicari: ");
                                i = tasya.nextInt();
                                data.get(i);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.print("Lagi? (y/t)");
                            lagi = tasya.nextInt();
                        } else if (pilih2 == 2) {
                            System.out.print("Nilai yang dicari: ");
                            n = tasya.nextInt();
                            data.getByValue(n);
                            System.out.print("Lagi? (y/t)");
                            lagi = tasya.nextInt();
                        } else if (pilih2 == 3) {
                            break;
                        } else {
                            lagi = 1;
                        }
                    } while (lagi == 1 || pilih2 == 1 || pilih2 == 2 || pilih2 == 3);
                default:
                    break;
            }
            break;
        } while (pilih1 == 1 || pilih1 == 2 || pilih1 == 3 || pilih1 == 4);
    }
}
