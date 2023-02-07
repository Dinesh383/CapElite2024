import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Grades
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int [] g=new int[n];
        for(int i=0;i<n;i++)
        {
            g[i]=scan.nextInt();
        }
        int l=g.length;
        for(int i=0;i<l;i++)
        {
            if(g[i]<38)
            {
                System.out.println(g[i]);
            }
        else
        {
            int x=g[i]%5;
            int y=g[i]+(5-x);
            int z=Math.abs(g[i]-y);
            if(z<3)
            {
                System.out.println(y);
            }
        else
        {
            System.out.println(g[i]);
        }
        }}
    }
}

