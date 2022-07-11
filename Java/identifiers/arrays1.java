public class arrays1 {
    public static void main(String[] args) {


        int[] x = new int[3];

        for(int i = 0; i < x.length; i++) { //
            System.out.println("Array " + i + ": " + x[i]);
        }
        System.out.println(x.getClass().getName());
        x[0] = 23;
        x[1] = 24;
        x[2] = 25;
        for(int i = 0; i < x.length; i++) { //
            System.out.println("Array " + i + ": " + x[i]);
        }


        Student[] students = new Student[2];
        students[0] = new Student();
        students[1] = new Student();
        students[0].age = 23;
        students[1].age = 24;
        for(Student s1:students){
        System.out.println("The age of the student is: "+ s1.age);
       }



        //2-D
        int [] []y,z[];// both y and z are of 2-D
        y = new int[2][];
        z = new int[3][][];
        System.out.println("The type of array y:" +y.getClass().getName());
        System.out.println("The type of array z:" +z.getClass().getName());


        //    2D matrix
        int[][] X = new int [3][];   //array of arrays
        System.out.println("The size of the X is: "+ X.length); // represent only base size
        X[0] = new int[1];
        X[1] = new  int[3];
        X[2] = new  int[1];
       X[0][0] = 34;
       X[1][0] = 35;
       X[1][1] = 36;
       X[1][2] = 37;
       X[2][0] = 38;

       for(int[] a:X){
        System.out.println(" ");
        for(int b:a){
            System.out.print(b+" ");
        }
       }


       //Anonymous Array
       System.out.println("\n");
       printArray(   new int[] {1,2,3}   );

    }

    static void printArray(int[] arr){
        for(int a:arr){
            System.out.print(a+"  ");
        }
    }
    
}

class Student {
    int age;
}