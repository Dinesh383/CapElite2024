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
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */
    public static void minimumBribes(List<Integer> q) {
        int counter = 0;
        int temp;
        for (int i = q.size() - 2; i >= 0; i--) {
            int diff = q.get(i) - i - 1;
            if (diff > 2) {
                System.out.println("Too chaotic");
                return;
            }
            while (diff > 0) {
                diff--;
                counter++;
                temp = q.get(i + 1);
                q.set(i + 1, q.get(i));
                q.set(i, temp);
                if(diff == 1) i++;
            }
        }
        System.out.println(counter);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                Result.minimumBribes(q);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
