package CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

public class second {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		int max =0;
		while(tc-->0){
		//for(int t = 0;t < tc; t++){
		    int d = scn.nextInt();
		    int x = scn.nextInt();
		    int y = scn.nextInt();
		    int z = scn.nextInt();
		    int donework1 =7*x;
		    int donework2 =y*d + (7-d)*z;
		    max =Math.max(donework1 , donework2);
		    
		    System.out.println(max);
		}
	}
    
}
