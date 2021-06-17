package GFG.Searching_And_Sorting;
import java.util.*;

public class FindTransitionPoint {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            GfG obj = new GfG();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
    }
    
}

class GfG {
    int transitionPoint(int arr[], int n) {
        int firstIndex =-1;
        int low =0;
        int high =arr.length -1;
        while(low <= high){
            int mid =(low +high) /2 ;
            if(arr[mid]==1){
                firstIndex = mid;
                high =mid-1;
            }
            
            else {
                low=mid +1;
            }
                 
             }
             return firstIndex;
    }
}