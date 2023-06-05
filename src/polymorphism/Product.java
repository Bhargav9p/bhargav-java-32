package polymorphism;
public class Product {
    int price=50;
    public int getPrice(){
        return(price);
    }
    public int setprice(){
        return(price);
    }
    public int getPrice(int quantity){
        return(quantity * price);
    }
    public static void main(String args[]){
        Product o=new Product();
        System.out.println("The price for 10 products is $"+ o.getPrice(10));

    }
}



