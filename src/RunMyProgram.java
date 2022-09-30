public class RunMyProgram {

    public Hamburgers hamburger1;


    public static void main(String[] args) {


        Hamburgers hamburger1 = new Hamburgers();
        hamburger1.setTopping("Tomato");
        hamburger1.setPrice(20.55);
        printDetails();


    }

    public static void printDetails(){
        System.out.println(Hamburgers.getTopping()+", "+Hamburgers.getPrice());
    }


}
