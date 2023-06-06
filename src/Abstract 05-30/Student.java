package Abstract;

public class Student {
    String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public static void main (String args[]){
        Student s=new Student();
        s.getName();
        s.setName("bharav");
        System.out.println("name is "+s.getName());
    }
}
