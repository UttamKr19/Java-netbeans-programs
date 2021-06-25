/*
=> Operator is used to perform operation on operands. There are multiple types of operator in
java
1. Arithmetic operator(+,-,*,/)
2. Assignment operator(=) used to assign value in variable or expression
        ex: int a=12; //12 is assigned in a
3. Relational operator (T/F) (>,<,>=,<=,==,!=) //comparision opr
        ex: (a>b),(a==b)
4. Logical operator(&&,||,!)-> T/F

exp1  exp2  exp1&&exp2  exp1||exp2  !exp1  !exp2
T       T       T           T         F       F
T       F       F           T         F       T
F       T       F           T         T       F
F       F       F           F         T       T


=> Increment/Decrement operator
Two types
1. Prefix       2. Postfix
++var               var++
--var               var--

int x=5;
sop(++x); //x=6
sop(x--); //x=6
sop(x); //x=5

> In increment decrement opr, value of variable will be changed with one by default.
> Inc/Dec opr can be categorized into two types
    1.Prefix Inc/Dec: In this operator, value of variable will be changed during current
        statement and operator is always used before variable name.
        ex: --x;
        
    2.Postfix Inc/Dec: In this operator, operator will be placed after variable name.
        value of variable will be changed after current statement.

=> Conditional operator/Ternary opr
(condition)?trueStatement:falseStatement;


WAP to enter a no from user and check if no. is odd or even
WAP enter two no. from user and check for greater one
WAP enter age of a person and check if he's eligible for vote or not

*/
package may30;
import java.util.*;
public class May30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
      
        System.out.print("Enter a no.: ");
        int x=sc.nextInt();
      
        System.out.println((x%2==0)?x+ " is even":x+" is odd"); //Even odd
        
        System.out.println((x>=18)?"Eligible for vote":"Not eligible for vote");//Vote 
        
        System.out.print("Enter another no.: ");
        int y=sc.nextInt();
        
        System.out.println((x>y)?x+" is greater":y+ " is greater");//Max

        
    }
}
