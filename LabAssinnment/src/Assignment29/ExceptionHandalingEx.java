package Assignment29;

import java.util.Scanner;

public class ExceptionHandalingEx
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		
        System.out.println("Enter First value ");
        
        int i=sc.nextInt();
        
        System.out.println("Enter Second value ");
        
        int j=sc.nextInt();
        
        sc.close();
        
        System.out.println("Values of before calculation i:"+i+" j:"+j);
        
        try 
        { 
        	System.out.println(i/j); 
        }
        catch (Exception e) 
        { 
        	System.out.println(e);
        }
        
            System.out.println("calculation done");
	


}

	



	}


