import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        Set<Integer> set = new HashSet<>();
        
        int minEven = 10;
        
        for(char ch : str.toCharArray())
        {
            if(!Character.isDigit(ch))
            {
                continue;
            }
            int digit = (ch-'0');
            
            if(digit%2==0)
            {
                minEven = Math.min(digit,minEven);
            }
            
            set.add(digit);
        }
        
        if(minEven==10)
        {
            System.out.println(-1);
        }
        else
        {
            set.remove(minEven);
            List<Integer> ans = new ArrayList<>(set);
            
            Collections.sort(ans,(o1,o2)->o2-o1);
            
            for(int i:ans)
            {
                System.out.print(i);
            }
            
            System.out.print(minEven);
        }
    }
}
