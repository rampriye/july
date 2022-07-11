public class vararg1 {
    public static void main(String[] args) {
        m1();     // vararg
        m1(10);  // general
        m1(10,20);  // general with two arguments
        m1(10,20,30);  // var-arg

        m1("ram",12);   //var-arg with one formal var-arg parameter
        m1("ramaa",122,20,30,30); //var-arg with one formal var-arg parameter

        m1("ram ", 34, new double[] {2.3,3.4}, new int[]{23,34,34});   //passed anonymous array :)

        m2(new int[]{1,2,34},new int[]{12,25,234}); //var-arg for arrays

    }

    
    static void m2(int[]... id){
        System.out.println("\n var-arg for array - - kind of array of array");
        for(int[] i: id){
            System.out.println(" ");
            for(int a:i){
                System.out.print(" " + a);
            }
        }
    }

    static void m1(String s,int df, int    ... a){
        System.out.println("var-arg with one formal var-arg parameter");
        System.out.println(s+" "+df+ "\n");
        for(int aa:a){
            System.out.print(aa+ " ");
        }
    }
    static void m1(String s,int df,double[] dff, int...sdf){
        System.out.println("var-arg with two formal var-arg parameter");
        System.out.println(s+" "+df+ "\n");
        for(double d:dff){
            System.out.print(d+ "\t");
        }
        System.out.println("\n");
        for(int i : sdf){
            System.out.println(i+"\t");
        }
    }
    static void m1(int x){
        System.out.println("general");
    }

    static void m1(int... x){
        System.out.println("var-arg");
    }

    static void m1(int x,int y ){
        System.out.println("general with two arguments");
    }


}
