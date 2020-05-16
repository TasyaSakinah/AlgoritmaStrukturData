package MergeSortTest;
public class SortMain {
   public static void main (String[] args){
       int data[] = {10,40,30,50,70,20,100,90};
       System.out.println("Sorting dengan Merge Sort");
       MergeSort mSort = new MergeSort();
       System.out.println("Datra awal");
       mSort.printArray(data);
       mSort.mergeSort(data);
       int cari = 30;
       System.out.println("Setelah diurutkan");
       mSort.printArray(data);
    
   } 
}
