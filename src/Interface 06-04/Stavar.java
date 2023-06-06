package Interface;

public class Stavar {
    static int Sta;
    static
    {
        Sta = a();
    }
    static int a()
    {
        return 55;
    }
    static int getStaticvar( )
    {
        return Sta;
    }
    public static void main(String[] args)
    {
        Stavar s=new Stavar();
        int val= s.getStaticvar();
        System.out.println("Static value " +val);
    }
}
