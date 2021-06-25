/*
10. Design an algorithm to print a pyramid based on level entered by the user. 
Sample output is shown below. 
Enter the level of pyramid: 10 
The pyramid is - 
1 
232 
45654 
7890987 
123454321 
67890109876 
2345678765432 
901234565432109 
78901234543210987 
6789012345432109876 

 */
package javalab_patterna;

import java.util.Scanner;

/**
 *
 * @author Uttam
 */
public class JavaLab_patternA {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n=sc.nextInt();
        
        int inc=1;
        int temp=1;
        int mid;
        
        for(int i=1; i<=n;i++){
            
            mid=inc%10;
            int len=(i-1)*2+1;
            
            String str="";
            int k=inc-1;
            
            for(int j=0;j<(len/2);j++){
                str=str+(k%10);
                k--;
            }
            
            for(int it=str.length()-1;it>=0;it--){
                System.out.print(str.charAt(it));
            }
            System.out.print(mid+str+"\n");
            
            
            temp++;
            inc=inc+temp;
            
            
        }
        
    }
    
}
