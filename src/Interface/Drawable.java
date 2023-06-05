package Interface;
interface Rectangle{
    void draw();
}
interface Sqaure{
    void draw();
}
public class Drawable implements Rectangle,Sqaure {
    public void draw(){
        System.out.println("drawing.......");
    }
    public static void main (String[] args){
        Drawable obj = new Drawable();
        obj.draw();
    }
}

