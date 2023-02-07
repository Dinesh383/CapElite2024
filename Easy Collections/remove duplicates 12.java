import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String string = in.next();
        Set <Character> ordered = new LinkedHashSet<>();
        for (int i=0;i<string.length();i++){
            Character str = string.charAt(i);
            ordered.add(str);
        }
        for(Character str:ordered){
            System.out.print(str);
        }
    }
}
