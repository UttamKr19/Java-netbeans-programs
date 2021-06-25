package aug2;
import static aug2.Aug2.arr;
import java.math.BigInteger;
import java.util.*;

public class Aug2 {
    
    static int arr[]=new int [1000];
        
    int factRec(int n){
        if(n==0)
            return 1;
        
        return n*factRec(n-1);
        
                   
    }
    
    int factOpt(int n){
       
        if(arr[n]!=0){
            return arr[n];
        }
        else{
            for(int i=1;i<=n;i++){
                arr[i]=n*(factOpt(n-1));
            }
            return arr[n];
        }
        
    }
    
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Aug2 o=new Aug2();
        
        System.out.println("factNormal "+o.factRec(5));
        System.out.println("factOpt "+o.factRec(5));
        System.out.println("factOpt "+o.factRec(3));
        
        for(int j=0;j<5;j++)
            System.out.println(arr[j]);
        
        
        
        
        
    
    }
    
}
