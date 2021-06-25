/*
3.Write a program that takes as input the size of the array and the elements in
the array. The program then asks the user to enter a particular index and prints
the element at that index. Index starts from zero.
This program may generate Array Index Out Of Bounds Exception or
NumberFormatException . Use exception handling mechanisms to handle this
exception.
Sample Input and Output 1:
Enter the number of elements in the array
2
Enter the elements in the array
50
80
Enter the index of the array element you want to access
1
The array element at index 1 = 80
The array element successfully accessed
Sample Input and Output 2:
Enter the number of elements in the array
2
Enter the elements in the array
50
80
Enter the index of the array element you want to access
9
java.lang.ArrayIndexOutOfBoundsException
Sample Input and Output 3:
Enter the number of elements in the array
2
Enter the elements in the array
30
j
java.lang.NumberFormatException
 */
package exception3;

import java.util.Scanner;

/**
 *
 * @author Uttam
 */
public class Exception3 {

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
        
        try{
           
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(sc.next());
            }
            System.out.println("enter index: ");
            int a=sc.nextInt();
            System.out.println("element: "+arr[a+1]);
            
        }catch(NumberFormatException f){
            System.out.println(f);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    
}
