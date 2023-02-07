import java.io.*;
import java.util.*;
class Person{
    private String firstName;
    private String lastName;
    Person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
}
class Student extends Person{
    private int id;
    private List<Integer> scores;
    Student(String firstName,String lastName,int id,ArrayList<Integer> scores){
        super(firstName,lastName);
        this.id=id; 
        this.scores = scores;
    }

    public String calculate(){
        int total=0;
        int avg;
        for(Integer i:scores){
            total = total+i;
        }
        if(scores.size()==0){
            avg= 0;
        }
        else{     
           avg = total/scores.size();
        }
        if(avg<40){
            return "T";
        }
        else if(avg>=40 && avg<55){
            return "D";
        }
        else if(avg>=55 && avg<70){
            return "P";
        }
        else if(avg>=70 && avg<80){
            return "A";
        }
        else if(avg>=80 && avg<90){
            return "E";
        }
        else {
            return "O";
        }
        
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String[] s = in.nextLine().split(" ");
        
        int num = Integer.parseInt(in.nextLine());
        String[] list = in.nextLine().split(" "); 
        ArrayList<Integer> scores = new ArrayList<>(num);
        for(int i=0;i<list.length;i++){
            scores.add(Integer.parseInt(list[i]));
        }
        Student s1 = new Student(s[0],s[1],Integer.parseInt(s[2]),scores);
        System.out.println("Name: "+s[1]+", "+s[0]);
        System.out.println("ID: "+Integer.parseInt(s[2]));
        
        String grade=s1.calculate();
        System.out.println("Grade: "+grade);
        
    }
}
