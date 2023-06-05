package polymorphism;

abstract class Department {
    abstract int getdepartment();
}
class Indepartment extends Department {
    public int getdepartment() {
        int size = 10;
        System.out.println(size);
        return size;
    }
    public static void main(String[] args)
    {
        Indepartment obj = new Indepartment();
        obj.getdepartment();
    }
}

