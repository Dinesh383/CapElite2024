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
     * Complete the 'waiter' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY number
     *  2. INTEGER q
     */
     static List<Integer> generatePrimes(int n){
        List<Integer> primes = new ArrayList<>();
        int start = 2;
        //System.out.println("n="+n);
        while(primes.size()<n){
            int end = start;
            int count =0;
            while(end >=1){
                if(start%end==0){
                    count++;
                }
                end--;
            }
            if(count==2){
                primes.add(start);
            }
            start++;
        }
        return primes;
    }
        
public static List<Integer> waiter(List<Integer> number, int q) {
    // Write your code here
        List<Integer> answers = new ArrayList<>();
        Stack<Integer> A = new Stack<>();
        Stack<Integer> B = new Stack<>();
        List<Integer> C = new ArrayList<>();
        for(int n : number){
            A.push(n);
        }
        //System.out.println("q="+q);
        List<Integer> primes = generatePrimes(q);
        int i=0;
        while(i<q){
            int primeNum = primes.get(i);
            while(!A.isEmpty()){
                int num = A.pop();
                if(num%primeNum == 0){
                    B.push(num);
                }
                else{
                    C.add(num);
                }
            }
            while(!B.isEmpty()){
                answers.add(B.pop());
            }
            if(!C.isEmpty()){
               for(int j=0;j<C.size();j++){
                   A.push(C.get(j));
               }
               C.clear();
            }
            i++;
        }
        
        while(!A.isEmpty()){
            answers.add(A.pop());
        }
        return answers;
        
    }}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> number = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.waiter(number, q);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
