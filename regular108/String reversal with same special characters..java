import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String g = sc.nextLine();
        
        char[] gg = g.toCharArray();
        
        int n=g.length(),i=0,j=n-1;
        
        while(i<j)
        {
            while(!Character.isLetterOrDigit(gg[i]))
            {
                i++;
            }
            
            while(!Character.isLetterOrDigit(gg[j]))
            {
                j--;
            }
            
            if(i<j)
            {
                char temp = gg[i];
                gg[i] = gg[j];
                gg[j] = temp;
                i++;
                j--;
            }
        }
        
        System.out.println(new String(gg));
        
    }
}
