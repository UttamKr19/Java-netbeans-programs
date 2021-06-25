
import java.util.*;

abstract class Account{
    double interestRate,amount;
    abstract double calculateInterest();
}

class exp_class extends Exception{
        @Override
    public String toString(){
        return ("Wrong Input !!!");
    }
}

class FDAccount extends Account{
  int noOfDays,ageOfACHolder;
  @Override
  double calculateInterest(){
        try{
                Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount:-");
		amount=sc.nextInt();
		System.out.println("Enter no of days:-");
		noOfDays=sc.nextInt();
		System.out.println("Enter age:-");
		ageOfACHolder=sc.nextInt();
		
		if(amount<0 || ageOfACHolder <0 ||noOfDays<0){
			throw new exp_class();
		}
		
		if(amount>10000000){
                        if(noOfDays<7){
                            interestRate=0;
                        }
                        else if( noOfDays>= 7 && noOfDays <= 14){
				interestRate = 6.50;
			}
			else if( noOfDays >= 15 && noOfDays <30){
				interestRate=6.75;
			}
			else if(noOfDays>= 30 && noOfDays <45){
                                interestRate=6.75;
			}
			else if(noOfDays>= 45 && noOfDays <=60){
				interestRate=8;
			}
			else if( noOfDays >=61 && noOfDays< 185){
				interestRate= 8.50;
			}
			else if( noOfDays >=185 && noOfDays<= 365){
				interestRate= 10.00;
			}
		}
                else{
                        if(noOfDays<7){
                            interestRate=0;
                        }
                        if( noOfDays>= 7 && noOfDays < 15){
				interestRate = 4.50;
			}
			else if( noOfDays >= 15 && noOfDays<30){
				interestRate=4.75;
			}
			else if(noOfDays>= 30 && noOfDays <45){
                                interestRate=5.50;
			}
			else if(noOfDays>= 45 && noOfDays <=60){
				interestRate=7;
			}
			else if( noOfDays >=61 && noOfDays<185){
				interestRate= 7.50;
			}
			else if( noOfDays >=185 && noOfDays<= 365){
				interestRate= 8.00;
			}
                    if(ageOfACHolder>60)
                        interestRate=interestRate + 0.50;
                }
                return (amount*interestRate)/100.0;
        }
        catch(exp_class e){
            System.out.println(e);
            return -1.00;
        }
    }
}

class SBAccount extends Account{
    @Override
    double calculateInterest(){
        try{
                Scanner sc=new Scanner(System.in);
                System.out.print("Are you indian ? y/n:-");
                String c=sc.nextLine();
                System.out.println("Enter the amount : ");
                amount=sc.nextDouble();
                if(c.equals("y") || c.equals("Y")){
                    interestRate=4;
                }
                else if(c.equals("n") || c.equals("N")){
                    interestRate=6;
                }

                if(amount <0){
                     throw new exp_class();
                }
           }catch(exp_class e){
                    System.out.println(e);
                    return -1;
            }
        
                return(amount*interestRate/100.0);
    }
}
class RDAccount extends Account{
    int noOfMonths,monthlyAmount,age;
    @Override
    double calculateInterest(){
        Scanner sc=new Scanner(System.in);
        try {
            interestRate=7.50;
            System.out.println("Enter the RD amount : ");
            amount=sc.nextDouble();
            System.out.println("Enter the Age : ");
            age=sc.nextInt();
            System.out.println("Enter the No of Months : ");
            noOfMonths=sc.nextInt();
            if(amount<0 || age<0){
                throw new exp_class();
            }
            else{
                if(noOfMonths>0 && noOfMonths<6)
                    interestRate=7.50;
                else if(noOfMonths>=6 && noOfMonths<9)
                    interestRate=7.50;
                else if(noOfMonths>=9 && noOfMonths<12)
                    interestRate=7.75;
                else if(noOfMonths>=12 && noOfMonths<15)
                    interestRate=8.00;
                else if(noOfMonths>=15 && noOfMonths<18)
                    interestRate=8.25;
                else if(noOfMonths>=18 && noOfMonths<21)
                    interestRate=8.50;
                else if(noOfMonths>=21)
                    interestRate=9.25;
                
                
                if(age>60){
                    interestRate=interestRate+0.50;
                }
            }
            
            return(amount*interestRate/100.0);
        }
        catch(exp_class e)
        {
            System.out.println(e);
            return -1.00;
        }
    }
}

public class project 
{
  public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);

    while(true)
    {
      System.out.println("1. Interest Calculator - SB");
          System.out.println("2. Interest Calculator - FD");
      System.out.println("3. Interest Calculator - RD");
      System.out.println("4. Exit");
      int choice=sc.nextInt();
          double interest;

      switch(choice)
      {

            case 1:
                SBAccount s=new SBAccount();
                interest=s.calculateInterest();
                if(interest!=-1){
                   System.out.println("Your interest is "+interest);
                }
                System.out.println();
                break;
            case 2:
                FDAccount f=new FDAccount();
                interest=f.calculateInterest();
                if(interest!=-1){
                   System.out.println("Your interest is "+interest);
                }
                System.out.println();
                break;
            case 3 :
                RDAccount r=new RDAccount();
                interest=r.calculateInterest();
                if(interest!=-1){
                  System.out.println("Your interest is "+interest);
                }
                System.out.println();
                break;
            case 4:
                System.exit(0);

            default :
                System.out.println("Wrong Input");
        }
     }
    }
}
