import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
 public static String isValid(String s) {
    // Write your code here
        int[] gg = new int[26];
        for (int i = 0; i < s.length(); i++) {
            gg[s.charAt(i) - 'a']++;
        }
        int count=0;
        int temp = gg[s.charAt(0)-'a'];
        for (int i = 1; i < gg.length && gg[i] >0; i++) {
            if(temp != gg[i]) count++;
        }
        if(count >1) return "NO";
        
        return "YES";

    }}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
