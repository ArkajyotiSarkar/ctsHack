package cts_mock_hackathon;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		 File fr=new File("F:\\CPU.txt");    
         int i=0;
         Scanner sc=new Scanner(fr);
         ArrayList<String> cpu = new ArrayList<String>();
         while(sc.hasNextLine())
         {
        	cpu.add(sc.nextLine());
        	 i++;
         }
         int[] arr=new int[i];
         float sum=0;
         float max=0;
         for(String s1:cpu)
         {
        	 
        	 String p=s1.substring(42, 46);
        	 //System.out.println(p);
        	 String p1="";
        	 if(p.charAt(0)==' ')
        	 {
        		 p1=p.substring(1,4);
        		 System.out.println(p1);
        	 }
        	 else
        	 {
        		 p1=p;
        		 System.out.println(p1);
        	 }
        	 float num=Float.parseFloat(p1);
        	 System.out.println(num);
        	 sum=sum+num;
        	 if(num>max)
        	 {
        		 max=num;
        	 }
         }
         float avg=sum/i;
         System.out.println("Average is:"+avg);
         System.out.println("Maximum is:"+max);
		
	}

}