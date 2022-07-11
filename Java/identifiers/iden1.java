class iden1{
    public static void main(String[] args) {
        System.out.println("Starting");
        var _d = 32;
        var $sd = 43;
        var String = 33;
        var Runnable = 35;
        System.out.println(_d + " " + $sd+ " "+ String +" "+Runnable);


        //integral literal
        int x = 011;    //9 in ocatal 
        System.out.println(x);

        int x1 = 0x11;  // 17 in hexadecimal

        
        // float x2= 12.4; //it is double precision by default
        // System.out.println(((Object)x2).getClass().getName());//j.l.Double

        var x3 = 12.5f;
        System.out.println(((Object)x3).getClass().getName());//j.l.Float

        char c1 = 97;
        char    c2 ='\n';
        char c3 = '\r';  //carriage return

        char c4 = '\u0062';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        


    }
}