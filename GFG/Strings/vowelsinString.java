package GFG.Strings;
import java.io.*;

public class vowelsinString {
    public static void main(String[] args)throws IOException {
        
        //using BufferedReader class to the read the input
        BufferedReader read = new BufferedReader((new InputStreamReader(System.in)));
        
        //reading total count of testcases
        int t = Integer.parseInt(read.readLine());

        while(t-- >0)
        {
            //reading the string
            String str = read.readLine();
            
            //calling the countVowels method
            //while passing String and
            //printing the output
            System.out.println(new Solution1().countVowels(str));

        }
    }
}



class Solution1
{
    // Complete the funciton
    // str: input string
    public  int countVowels(String str)
    {
        int count=0;
        String vowels ="aeiou";
        for(int i=0; i<vowels.length(); i++){
            for(int j=0; j<str.length();j++){
                
                char p =vowels.charAt(i);
                if(str.charAt(j)==p){
                count++;
            }
                
            }
            
        }
        
        return count;
        // count number of vowels present in string
    }
}
