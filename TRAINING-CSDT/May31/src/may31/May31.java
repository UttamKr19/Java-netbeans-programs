/*
=>Control flow statement
1. Selective Statement/Conditional statement

    -> if else: When we have two options like yes or no, or T/F
            if(condition){
                //true statement
            }
            else{
                //false stm 
                }


    -> if else ladder: When we have more than two options.
        int s1=80,s2=98,s3=43;
        int p=(s+s2+s3)/3;

        if()...else if()....else
    
    -> switch: More than two options
        syntax- switch(expression)
                {
                case value1:
                statement;
                break;
                case value2:
                statement;
                break;
                case value3:
                statement;
                break;
                default:
                statement; }



2. Iterative statement/Loop

-> for
    syntax- for(variable initialisation;condition;updation)
            { statement;
                }
                
-> while
-> do while




 */
package may31;
import java.util.*;
public class May31 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
       
/*
        System.out.print("Enter a no.: ");
        int a=sc.nextInt();
        
        if (a>=0)
            System.out.println("Postive");
        else
            System.out.println("Negative");
        
*/
        
    //WAP enter two no from user and find max
   /* 
    System.out.print("Enter a no.: ");
    int a=sc.nextInt();
    System.out.print("Enter another no.: ");
    int b=sc.nextInt();
    
    if(a>b)
            System.out.println(a+" is greater");
    else
            System.out.println(b+" is greater");
    
*/    

//WAP enter cost of a pen from user and calculate 100 pens cost with some discount,
        //if total pen cost>=500, then we calculate 20% discount otherwise 10% discount.
    
        System.out.print("Enter cost of pen: ");
        double a=sc.nextInt();
        double total;
        if(a*100>=500)
        {
            total=(a*100)-((a*100)*0.2); 
        }
        else
        {
            total=(a*100)-((a*100)*0.1);
        }
        System.out.println("Total cost after discount: "+total);
        

        //WAP enter three no from user and find maximum.
        //WAP enter four no. from user and find max.
        
        //WAP enter year and check if it's leap year or not                
      
        //WAP enter character, check if it's vowel or consonant.
        
        
        
    

    
    }
}
