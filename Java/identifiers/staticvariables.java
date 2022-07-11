public class staticvariables {

    static int x = 19;     // static variable are stored in method area
    int y = 20;   // instance variables are stored in heap area where objects reside
    
    public static void main(String[] args) {
        staticvariables t = new staticvariables();
        staticvariables t1 = new staticvariables();
        t1.x = 34;    // same variable of class level is shared by all objects
        System.out.println(x);
        System.out.println(t.x);// here t.x is also 34 now
        System.out.println(staticvariables.x);
    }
}
