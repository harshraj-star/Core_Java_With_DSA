package GFG.Searching_And_Sorting;
import java.util.*;
import java.io.*;

public class FaceTheSunProblem {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] h = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                h[i] = Integer.parseInt(inputLine[i]);
            }


            int ans = new Solution().countBuildings(h, n);
            System.out.println(ans);
        }
    }
    
}

class Solution {
    int countBuildings(int h[], int n) {
        int Max =Integer.MIN_VALUE;
        int count =0;
        
        for(int i= 0; i<h.length;i++){
            if(h[i]> Max){
                Max =h[i];
                count++;
            }
        }
        
        return count;
        // code here
    }

    
}
