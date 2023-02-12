import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner gg=new Scanner(System.in);
        int size_of_string=gg.nextInt();
        String s=gg.next();
        int queries=gg.nextInt();
        for(int i=0;i<queries;i++){
           int p=gg.nextInt();
           k(p,s);
        
        }}
public static void k(int p,String s){
       char g=s.charAt(p-1);
            int count=0;
            for(int j=0;j<p-1;j++){
                if(s.charAt(j)==g){
                    count+=1;
                }
                
            }
            System.out.println(count);
           }

}
