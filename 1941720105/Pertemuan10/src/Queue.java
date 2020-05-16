public class Queue {
    int max,size,front,rear;
    int [] Q;
    int [] data;
    public Queue(int n){
        max = n;
        Create();
    }
        public void Create(){
            Q = new int [max];
            size = 0;
            front = rear = -1;
        }
        public boolean IsEmpty(){
            if (size == 0){
                return true;
            } else {
                return false;
            }
        }
        public boolean IsFull(){
            if (size == max){
                return true;
            } else {
                return false;
            }
        }
        public void peek(){
            if (!IsEmpty()){
                System.out.println("Elemen terdepan: "+ Q[front]);
            } else {
                System.out.println("Antrian masih kosong");
            }
        }
        public void print(){
            if (IsEmpty()){
                System.out.println("Antrian masih kosong");
            } else {
                int i = front;
                while (i != rear){
                    System.out.print(Q[i] + " ");
                    i = (i+1) % max;
                }
                System.out.println(Q[i] + " ");
                System.out.println("Jumlah antrian = "+ size);
            }
        }
        public void Enqueue(int data){
            if (IsFull()){
                System.out.println("Antrian sudah penuh");
            } else {
                if (IsEmpty()){
                    front = rear = 0;
                } else {
                    if (rear == max - 1){
                        rear =0;
                    } else {
                        rear++;
                    }
                }
                Q[rear] = data;
                size++;
            }
        }
        public int Dequeue(){
            int data = 0;
            if (IsEmpty()){
                System.out.println("Antrian masih kosong");
            } else {
                data = Q[front];
                size--;
                if (IsEmpty()){
                    front = rear = -1;
                } else {
                    if (front == max - 1){
                        front = 0;
                    } else {
                        front++;
                    }
                }
            }
            return data;
        }
        public void peekRear(){
            if (!IsEmpty()){
                System.out.println("Elemen yang berada paling belakang: "+ Q[rear]);
            } else {
                System.out.println("Antrian masih kosong");
            }
        }
        public void peekPosition(int data){
            if (IsEmpty()){
                System.out.println("Antrian masih kosong");
            } else {
                int i = front;
                boolean found = false;
                if (data == Q[rear]){
                    System.out.println("Data " + data + " berada pada posisi " + rear);
                    found = true;
                } else {
                while (i != rear){
                    if (data == Q[i]){
                        System.out.println("Data " + data + " berada pada posisi: "+ i);
                        break;
                    }
                    i = (i+1) % max;
                }
                if (!found){
                System.out.println("Data " + data + " berada pada posisi " +i);
            }
          }
         }
        }
        public void peekAt(int data){
            if (IsEmpty()){
                System.out.println("Antrian masih kosong");
            } else {
                if (data >= max){
                    System.out.println("Melebihi antrian");
                } else {
                    boolean found = false;
                    if (data == rear){
                    System.out.println("Data yang berada pada posisi "+ data + ": " + Q[rear]);
                    found = true;
                }
                 else {
                    int i = front;
                    while (i != rear){
                        if (data == i){
                            System.out.println("Data yang berada pada posisi " + data + ": " +Q[i]);
                            found = true;
                    }
                        i++;
                    }
                  }
            if (!found){
            System.out.println("Antrian "+data+ "tidak tersedia");
        }
      }
    }
  }
}