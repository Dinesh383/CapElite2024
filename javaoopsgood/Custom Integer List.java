import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;

class IntegerList{

    private int[] list;

    private int elementIndex=0;

    private int capacity;

    public IntegerList(int capacity){

        list=new int[capacity];

        this.capacity=capacity;        

    }

    public void add(int num){

       if(elementIndex>capacity-1){

           System.out.println("can't add, list is full");

       }

        else{

            list[elementIndex]=num;

            elementIndex++;           

        }

}

    public void String(){

        for(int i=0;i<capacity;i++){

            System.out.println(i+" : "+list[i]);

        }        

    }        

    }

public class Solution {  

        public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int capacity = Integer.parseInt(in.nextLine());

        IntegerList nums = new IntegerList(capacity);

        while(in.hasNextLine()){

            int num = Integer.parseInt(in.nextLine());

            nums.add(num);

        }

        nums.String();

    }

    }

    
