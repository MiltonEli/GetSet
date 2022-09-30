import org.w3c.dom.ls.LSOutput;

public class Hamburgers {
    static private String topping;
    static private double price;

    public static void constructor(){

    }
    public void setTopping(String topping){
        this.topping=topping;

    }
    public static String getTopping(){
        return topping;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public static double getPrice(){
        return price;
    }
    public void printDetails(){
        System.out.println(getTopping()+", "+getPrice());
    }


}
