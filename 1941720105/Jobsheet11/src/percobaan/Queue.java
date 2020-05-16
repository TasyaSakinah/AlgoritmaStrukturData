package percobaan;
public class Queue {
    public int size;
    Tugas2 front, rear;
    public Queue(){
        front = null;
        size = 0;
    }
    public boolean isEmpty(){
        if (size==0){
            return true;
        } else {
            return false;
        }
    }
    public void peek(){
        if (!isEmpty()){
            System.out.println("Gerbong terdepan");
            front.print();
        } else {
            System.out.println("Gerbong masih kosong");
        }
    }
    public void print(){
        if (isEmpty()){
            System.out.println("Gerbong masih kosong");
        } else {
            Tugas2 tmp = front;
            while (tmp != null){
                tmp.print();
                tmp = tmp.next;
            }
            System.out.println("Jumlah antrian: "+ size);
        }
    }
    public void Enqueue(String n, String j){
        if (isEmpty()){
            front = rear = new Tugas2(n,j);
        } else {
            Tugas2 tmp = front;
            while (tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = rear = new Tugas2(n,j);
        }
        size++;
    }
    public void Dequeue(){
        if (isEmpty()){
            System.out.println("Gerbong masih kosong");
        } else {
            Tugas2 tmp = front;
            size--;
            if (isEmpty()){
                front = rear = null;
            } else {
                front = tmp.next;
            }
        }
    }
    public void peekRear(){
        if (!isEmpty()){
            System.out.println("Gerbong terbelakang: ");
            rear.print();
        } else {
            System.out.println("Gerbong masih kosong");
        }
    }
    public void peekPosition(String data){
        if (!isEmpty()){
            int a = 1;
            Tugas2 tmp = front;
            while (tmp.next != null){
                if (data.equalsIgnoreCase(tmp.nogerbong)){
                    break;
                }
                a++;
                tmp = tmp.next;
            }
            System.out.println("Gerbong "+ data +"ada pada antrian ke "+ a +": ");
            tmp.print();
        }
    }
    public void peekAt(int position){
        if (!isEmpty()){
            int a = 1;
            Tugas2 tmp = front;
            while (tmp.next != null){
                if (a == position){
                    break;
                }
                a++;
                tmp = tmp.next;
            }
            System.out.println("Data pada kursi ke "+ position +": ");
            tmp.print();
        }else {
            System.out.println("Kursi masih kosong");
        }
    }
}
