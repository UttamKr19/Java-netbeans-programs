package self1;
import java.util.*;
//import java.math.*;
public class Self1 {

    public static void main(String[] args) {
        
        System.out.println("Hello Bello Mello");
       /*
        System.err.println("Red texttttt");
        //String a=s.next();
        {
        int a=55986;
        double f=34.55;
        int r=(int) f;
        System.out.println(f+(double)a);
        //System.out.println(Math.sqrt(f*(double)a));
        }
        
        if(5>3&&45>6)
        {
            System.out.println((5+5)/2);
        }
        
        */
       
        //----------------------PRIME-------------------------------------------
        /*
        int n=20;
       int f=0;
        System.out.println("Primes:");
       for(int i=2;i<=n;i++)
       {
           for(int j=2 ;j<i ;j++)
           {
               if (i%j==0)
               {
                   f=0;
                   break;  
               }
               else{
                   f=1;
               }
           }
           if(f==1)
               System.err.print(i+" ");
       }
       */
       //__________________________________________________________________________
         //----------------------FOR-------------------------------------------
        /*
         int arr[]={3,6,2,8,2,2,4,1};
        int a=arr.length;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        
        System.out.println(sum);
             
        sum=0;
        for(int x:arr)
        {
            sum=sum+x;
        }
        System.out.println(sum);
        */
        
        //_________________________________________________________________________
       //-----------------------SWITCH--------------------------------------------
       /*
       Scanner sc1=new Scanner(System.in);
        System.out.println("\nEnter an int:");
       int j=sc1.nextInt();
        
         switch(j)
       {
               case 1:System.out.println("one");
                        break;
               case 2:System.out.println("two");
                    break;
               case 3:System.out.println("three");
                    break;
               default: System.err.println("Default case!!");
       }
       //________________________________________________________________________     
        
        //-------------------------ARRAY-----------------------------------------
        
        System.err.println("Enter array: ");
        
        int arr[];
        arr=new int[3];
        Scanner sc= new Scanner(System.in);
        
        for(int i=0;i<3;i++)
        {
            arr[i]=sc.nextInt();
        }
            
        System.out.print("Array: ");
        for(int i=0;i<3;i++)
        {
            System.err.print(" "+arr[i]);
        }
        */
       //__________________________________________________________________________
       
       
    
}
}