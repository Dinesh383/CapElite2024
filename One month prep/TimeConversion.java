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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    int t = Integer.parseInt(s.substring(0,2));
    
    if( s.contains("AM")){
        if(s.substring(0,2).equals("12") )
        {String str = "00";
        s = str+s.substring(2,s.length()-2);
        }
        s=s.substring(0,8);
        
    }
    if( s.contains("PM")){
        if(s.substring(0,2).equals("12") ){
            return s.substring(0,8);
        }
        
        t = t+12;
        s = t+s.substring(2,s.length()-2);
        
    
    }
    return s;
    }

    }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
