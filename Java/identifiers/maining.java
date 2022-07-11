public class maining{
    public final synchronized static void main(String[] args) {
        System.out.println("hello");
        maining m = new maining();
        m.main(1,23);
        m.main("ramaa");

        Child c = new Child();
        c.main(1,23);
        c.main("ramaa");
    }
    
    public static void main(int... args) {
        for(int i: args){
            System.out.println(" " + i);
        }  
    }
    public static void main(String args) {
            System.out.println("hello " + args);
        }
}

class Child extends maining{

}