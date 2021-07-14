package GFG.Strings;

public class repeatingleftmostChar {
    
}

class Solution
{
    //Function to find repeated character whose first appearance is leftmost.
    static int repeatedCharacter(String S)
    {
        int res =Integer.MAX_VALUE;
        
        int[] fi = new int[256];
        for(int i=0; i<256; i++){
            fi[i] =-1;
        }
        
        for(int i=0; i<S.length();i++){
            if(fi[S.charAt(i)] ==-1){
                fi[S.charAt(i)] = i;
            }
            
            else {
                res =Math.min(res, fi[S.charAt(i)]);
            }
        }
        
        return (res==Integer.MAX_VALUE) ? -1 : res;
        
        
        // add your code here
    }
}
