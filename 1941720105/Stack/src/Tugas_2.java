public class Tugas_2 {
    int size;
     int top;
     String data[];
    public Tugas_2 (int size){
        this.size = size;
        data = new String [size];
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
    public void print(){
        System.out.println("Kalimat setelah dibalik: ");
        for (int i=top; i>=0; i--){
            System.out.println(data[i]+" ");
        }
        System.out.println("");
    }
}
