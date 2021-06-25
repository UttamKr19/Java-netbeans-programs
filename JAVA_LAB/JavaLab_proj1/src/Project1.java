//Create an application to save the employee information using arrays
import java.util.*;

public class Project1 
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        String emp_data[][]=new String[][]{
            {"1001","Uttam","01/04/2009","e","R&D","20000","8000","3000"},
            {"1002","Sayanto","23/08/2012","c","PM","30000","12000","9000"},
            {"1003","Gaurav","12/11/2008","k","Acct","10000","8000","1000"},
            {"1004","Iron Man","29/01/2013","r","Front Desk","6000","8000","2000"},
            {"1005","Thor","16/07/2005","m","Engg","50000","20000","20000"},
            {"1006","Black Widow","01/01/2003","e","Manufacturing","9000","8000","4400"},
            {"1007","Batman","16/07/2001","e","Engg","80000","10000","20000"}
                
	};
        
	int empno,f=0,salary = 0;
	String des = null;
        int flag=0;
	System.out.print("Enter Employee no : ");
	empno=sc.nextInt();
	for(int i=0;i<emp_data.length;i++){
             
		if(Integer.parseInt(emp_data[i][0])==empno){
                    f=i;
                     des=emp_data[i][3];
                    salary=Integer.parseInt(emp_data[i][5])
                     +Integer.parseInt(emp_data[i][6])
                     -Integer.parseInt(emp_data[i][7]);
                 
                    flag=1;     
                    break;
		}
	}
         
        if(flag==0){
            System.out.println("Sorry!! \nThere's no employee with emp_id "+empno);
             //return;
        }
        else{
            switch(des){
		case "e":
			salary=salary+20000;
			des="Engineer";
			break;
		case "c":
			salary=salary+32000;
			des="Consultant";
			break;
		case "k":
			salary=salary+12000;
			des="Clerk";
			break;
		case "r":
			salary=salary+15000;
			des="Receptionist";
			break;
		case "m":
			salary=salary+40000;
			des="Manager";
			break;
                default:
                        System.out.println("Designation not specified");
            }
            
            System.out.println("\n-------Employee Details-------\n");
            System.out.println("Emp No:          "+emp_data[f][0]);
            System.out.println("Emp Name:        "+emp_data[f][1]);
            System.out.println("Emp Department:  "+emp_data[f][4]);
            System.out.println("Emp Designation: "+des);
            System.out.println("Emp Salary:      "+salary);
            System.out.println("\n------------------------------");
        
        }
	 
         
    }
}

