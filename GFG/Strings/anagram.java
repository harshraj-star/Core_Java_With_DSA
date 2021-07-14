package GFG.Strings;

import java.io.*;

public class anagram {
    public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}



class Solution
{    
    public boolean isAnagram(String a,String b)
    {
        int[] count = new int[256];

    for (int i = 0; i <256; i++) {
        count[i] =0;
    }
    
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0; i<a.length(); i++){
            count[a.charAt(i)]++;
        }
        
        for(int i=0; i<b.length();i++){
            count[b.charAt(i)]--;
        }
        
        for(int i=0; i<256;i++){
            if(count[i]!=0){
                return false;
            }
        }
        
        return true;
        
        // Your code here
        
    }
    
}

