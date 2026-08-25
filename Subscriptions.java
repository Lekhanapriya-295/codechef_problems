import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0){
	     int n=sc.nextInt();
	     int x=sc.nextInt();
	     int subscriptionNeeded=(n+5)/6;
	     int totalcost=subscriptionNeeded*x;
	     System.out.println(totalcost);
	 }

	}
}
