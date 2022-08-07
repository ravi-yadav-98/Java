public class Arrays {
    public static void main(String[] args) {
        //method:01
//      int [] A = new int[5];
//      A[0] = 10;
//      A[1] = 20;
//      A[2] = 30;
//      A[3] = 44;
//      A[4]  = 40;

        //method:02
//        int [] marks;
//        marks = new int[5];
//
        //method:03
//        int[] marks = {1,2,3,4,5,7};
//        for(int i=0; i< marks.length; i++)
//        {
//            System.out.print(marks[i]);
//            System.out.print(" ");
//        }

        String[] names = {"Ravi", "Kru", "John", "Harry"};
//        for(int i =0; i<names.length; i++)
//        {
//            System.out.println(names[i]);
//        }

        //for each
        for(String s: names)
        {
            System.out.println(s);
        }
    }
}
