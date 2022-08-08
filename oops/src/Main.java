import java.util.*;
public class Main {

    static int addNums(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        return n + addNums(n-1);
    }
    static void printtable(int n)
    {
        for(int i =1; i<=10; i++)
        {
            System.out.println(n+" x " + i +" = " + i*n);
        }
    }

    static void printPattern(int n)
    {
        for(int i=0; i<n; i++)
        {
            for (int j =0;j<i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        System.out.println("Sum of n Numbers");
//        System.out.println(addNums(10));
//        printtable(91);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);



        //patter
    }
}
