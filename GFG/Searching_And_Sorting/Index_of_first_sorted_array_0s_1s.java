package GFG.Searching_And_Sorting;

public class Index_of_first_sorted_array_0s_1s {
    public static void main(String args[]){
    }

    
}

class Index_of_first {
    
    public long firstIndex(long arr[], long n)
    {
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
