package Pattern_Problems;
import java.util.*;

public class P1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Input");
        System.out.println();
        int n =sc.nextInt();
        int mid =n/2;
        for(int i =1; i<=mid+1; i++){
            for(int j=1 ;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

            
        }

        for(int i =mid+2; i<=n; i++){
            for(int j=i ;j>1; j++){
                System.out.print("*");
            }
            System.out.println();

            
        }
        

    }
    
}
