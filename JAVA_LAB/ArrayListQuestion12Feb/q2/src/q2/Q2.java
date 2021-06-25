/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

import java.util.ArrayList;

/**
 *
 * @author Uttam
 */


class Emp{
    int empId;
    String empName;
    String email;
    String gender;
    float salary;
    
    
    void GetDetails(){
        System.out.println("Employee Details");
        System.out.println("Id: "+empId);
        System.out.println("Name: "+empName);
        System.out.println("Mail: "+email);
        System.out.println("Gen: "+gender);
        System.out.println("Salary: "+salary);
        
    }

    public Emp(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }
    
}
public class Q2 {

    
    public static void main(String[] args) {
        ArrayList<Emp> ar=new ArrayList<>();
        
        Emp ob=new Emp(133,"ABC","aa@mail.com","Male",30000);
        Emp ob1=new Emp(433,"BC","thdgs@mail.com","Female",36000);
        Emp ob2=new Emp(4453,"Utt","afa@mail.com","Male",60000);
        
        ar.add(ob);
        ar.add(ob1);
        ar.add(ob2);
        
        ar.remove(ob);
        
        for(int i=0;i<ar.size();i++){
            System.out.println("");
            ar.get(i).GetDetails();
        }
            
    }
    
}
