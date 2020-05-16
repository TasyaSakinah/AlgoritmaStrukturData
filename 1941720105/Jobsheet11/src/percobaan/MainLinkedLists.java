package percobaan;
public class MainLinkedLists {
    public static void main (String[]args){
        LinkedLists data = new LinkedLists();
    
    try {
    data.addFirst(7);
    data.print();
    data.add(8, 1);
    data.print();
    data.addFirst(1);
    data.print();
    data.remove(1);
    data.print();
    data.clear();
    data.print();
    data.addByValue(3, 1, 7, 3);
    data.print();
    data.removeByValue(2, 0, 2);
    data.print();
    } catch (Exception e){
        System.out.println(e.getMessage());
    }
}
}
