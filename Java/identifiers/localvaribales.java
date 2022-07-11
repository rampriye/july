public class localvaribales {
    //scope of local variables inside logical block

    public static void m1(){
        int x ;

        if (true){
            x =10;
        }
        System.out.println(x);

    }

    public static void main(String[] args) {
        localvaribales.m1();
    }
}
