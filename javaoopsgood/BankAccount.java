import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Account{
    String name;
    int accountNo;
    static int balance=0;
    static int temp;
   Account(String name,int a)
   {
        this.name=name; 
        accountNo=a;
    }
    public void Deposit(int d){
        balance+=d;
    }
    public void Withdraw(int w)
    {
        temp=balance;
        balance-=w;
    }
    public void display(){
        if(balance<0){
            System.out.println("Negative Balance Transaction Cancelled");
            System.out.println(accountNo+" "+name+" "+temp);
        }else{
            System.out.println(accountNo+" "+name+" "+balance);
        }
    }
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int a=in.nextInt();
            in.nextLine();
            String str=in.nextLine();
            int n=in.nextInt();
            in.nextLine();
            for(int i=0;i<n;i++){
                String [] s=in.nextLine().split(" ");
                Account obj=new Account(str,a);
                if(s.length==2){
                    if(s[0].equals("Deposit")){
                        obj.Deposit(Integer.parseInt(s[1]));
                    }else if(s[0].equals("Withdraw")){
                        obj.Withdraw(Integer.parseInt(s[1]));
                    }
                }else{
                    obj.display();
                }
            }
    }
}
