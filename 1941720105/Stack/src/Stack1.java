public class Stack1 {
    int size;
     int top;
     String data[];
    public Stack1 (int siz){
        this.size = siz;
        data = new String [siz];
        top = -1;
    }
    public boolean IsEmpty(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull(){
        if (top == size-1){
            return true;
        } else {
            return false;
        }
    }
    public void push (String dt){
        if (!IsFull()){
            top++;
            data[top] = dt;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }
    public void pop(){
        if (!IsEmpty()){
            String x = data[top];
            top--;
            System.out.println("Data yang keluar: "+x);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    public void peek(){
        System.out.println("Elemen teratasi: "+data[top]);
    }
    public void print(){
        System.out.println("Isi stack: ");
        for (int i=top; i>=0; i--){
            System.out.println(data[i]+" ");
        }
        System.out.println("");
    }
    public void clear(){
        if (!IsEmpty()){
            for (int i=top; i>0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}