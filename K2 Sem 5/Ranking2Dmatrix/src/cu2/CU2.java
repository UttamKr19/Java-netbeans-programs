package cu2;
import java.util.*;

public class CU2 {
    int newLen=0;
    
    int[] dup(int arr[]){
        int n=arr.length;
        if (n==0 || n==1) 
            return arr; 
       
        int[] temp = new int[n];
        
        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j]=arr[i];
                j++; newLen++;
            }
        }
        temp[newLen]=arr[n-1];
        return temp;
    }
    
    public static void main(String args[] ) throws Exception {

        Scanner sc=new Scanner(System.in);

        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]= new int[r][c];
        int brr[][]= new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

     
    int arrL[]=new int[r*c];
    int k=0;
    
    while(k<r*c){
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++,k++){
         arrL[k]=arr[i][j];
        }
    }
    k++;
    }
    
    Arrays.sort(arrL);
    
    CU2 ob=new CU2();
    int arr2[]=ob.dup(arrL);

    
    System.out.println("");
  
    
    
    for(int i2=0;i2<ob.newLen+1;i2++){
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            
            if(arr2[i2]==arr[i][j]){
                brr[i][j]=i2+1;
            }
        }
    }
    }
    
    System.out.println("");
    
    
    for(int a[]:arr){
        for(int x:a){
            System.out.print(" "+x);
        }
        System.out.println("");
    }
     
    System.out.println("");
     
    for(int a[]:brr){
        for(int x:a){
            System.out.print(" "+x);
        }
        System.out.println("");
    }
    
    
            
  }


}
