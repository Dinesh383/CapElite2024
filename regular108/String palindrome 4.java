import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner gg=new Scanner(System.in);
        String g=gg.nextLine();
        char ch;
        String s="";
        for(int i=0;i<g.length();i++){
            ch=g.charAt(i);
            s=ch+s;
        }
        String l=s.toLowerCase();
            if(g.toLowerCase().equals(l)){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not Palindrome");
            }
        }
    }
