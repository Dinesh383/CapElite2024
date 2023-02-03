import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    // Write your code here
    
    // store the string as char elements in a set a
    // if size of the set is 26, return pangram
    // else its not a pangram
    
        s = s.replace(" ", "");
        s = s.toLowerCase();
        
        HashSet<Character> pan = new HashSet<>();
        char[] alpha = s.toCharArray();
        
        for (char ch : alpha){
            pan.add(ch);
        }
        
        if (pan.size() == 26){
            return "pangram";
        }
        return "not pangram";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
