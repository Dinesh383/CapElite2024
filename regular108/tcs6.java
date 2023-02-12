import java.io.*;
import java.util.*;

public class Solution {
      static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner gg=new Scanner(System.in);
        int g=gg.nextInt();
        if(g%2==0){
            System.out.println(fib(g/2));
        }
        else{
            System.out.println(g);
        }
    }
}
