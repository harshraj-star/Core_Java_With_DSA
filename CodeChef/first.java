package CodeChef;
import java.util.*;
import java.util.Scanner;


public class first {
    public static void main(String[] args)
	{
	    Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		while(tc-->0){
		//for(int t = 0;t < tc; t++){
		    int d = scn.nextInt();
		    int x = scn.nextInt();
		    int y = scn.nextInt();
		    int z = scn.nextInt();
		    if((7*x) > (d*y+z)){
		        System.out.println(7*x);
		    }else{
		        System.out.println(d*y+z);
		    }
		}
			// your code goes here
		}

    
}
