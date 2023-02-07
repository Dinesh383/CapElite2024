import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner s = new Scanner(System.in);
        String t1 = s.next();
        String t2 = s.next();
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<t1.length();i++){
            list.add(t1.charAt(i));
        }
        ArrayList<Character> list1 = new ArrayList<>();
        for(int j=0;j<t2.length();j++){
            list1.add(t2.charAt(j));
        }
        for(Character j:list1){
            if(list.contains(j)){
                list.remove(j);
            }
        }
        for(Character k:list){
            System.out.print(k);
        }
    }
}
