public class Methods {
    static int   add (int a, int b)
    {
        a = 100;
        b = 200;
        return a+b;
    }
    static void change(int[] arr)
    {
        arr[0] = 100;
    }

    //varargs: variable number of arguments
    static int addNums(int ...arr)
    {
        int ans = 0;
        for(int a: arr)
        {
            ans += a;
        }
        return ans;

    }
    static int multiply(int a, int ...arr)
    {
        int ans =a;
        for(int i: arr )
        {
            ans *= i;
        }
        return ans;
    }


    public static void main(String[] args) {
//        int a = 10;
//        int b= 20;
//        System.out.println(add(a, b));
//        System.out.println(a + " " + b);

        //reference pass
//        int[]  arr = {1,2,3,4,5,6};
//        change(arr);
//        System.out.println(arr[0]);

        //varargs: multiple arguments
//        System.out.println(addNums(1,2,3,4,5,6,7,7,7));
//        System.out.println(addNums());

        //optional and required arguments
        System.out.println(multiply(1,2,3,4,5,6,7));



    }
}
