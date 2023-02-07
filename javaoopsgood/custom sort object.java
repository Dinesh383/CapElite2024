import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



    
  public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Candidate>  students = new ArrayList<Candidate>();
        for(int i=0;i<n;i++){
           String name = in.next();
           int marks = in.nextInt();
           students.add(new Candidate(name,marks));
        }
        Collections.sort(students);
        for(Candidate student : students){
            System.out.println(student.getName()+" "+student.getMark());
        }
    }
}

class Candidate implements Comparable<Candidate>{
    private String name;
    private int marks;
    
    Candidate (String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    public String getName(){
        return name;
    }
    public int getMark(){
        return marks;
    }
    
    public int compareTo(Candidate second){
        return marks-second.marks;
   }
}  
