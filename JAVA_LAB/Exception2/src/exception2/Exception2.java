/*
2.Write a program that takes as input the size of the array and the elements in
the array. The program then asks the user to enter a particular index and prints
the element at that index.
This program may generate Array Index Out Of Bounds Exception. Use exception
handling mechanisms to handle this exception. In the catch block, print the class
name of the exception thrown.
Sample Input and Output 1:
Enter the number of elements in the array
3
Enter the elements in the array
20
90
4
Enter the index of the array element you want to access
2
The array element at index 2 = 4
The array element successfully accessed
Sample Input and Output 2:
Enter the number of elements in the array
3
Enter the elements in the array
20
90
4
Enter the index of the array element you want to access
6
java.lang.ArrayIndexOutOfBoundsException
 */
package exception2;

import java.util.Scanner;

/**
 *
 * @author Uttam
 */
public class Exception2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        try{
            System.out.println("enter index: ");
            int a=sc.nextInt();
            System.out.println("element: "+arr[a+1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        
        
        
    }
    
}
