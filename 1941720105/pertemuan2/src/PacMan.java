public class PacMan {
    int x, y, width, height;
    PacMan(){
    } PacMan (int w, int h){
        width = w;
        height = h;
    } void moveLeft(){
        if (x<0||x==0){
            System.out.println("Koordinat x kurang dari 0");
        }else {
        x--;}
    } void moveRight(){
        if (x>=width){
            System.out.println("Koordinat x melebihi area");
        } else {
        x++;
    }   
    } 
     void moveUp(){
        if (y<0||y==0){
            System.out.println("Koordinat y kurang dari 0");
        } else if (y<=height){
            System.out.println("Koordinat y melebihi area");
        }else {
            y--;
        }
    }
    void moveDown(){
        if (y<=height){
            System.out.println("Koordinat y melebihi area");
        } else {
            y++;
        }
    } void printPosition(){
        System.out.println("Posisi picman x: "+x+",y "+y);
    }
}
