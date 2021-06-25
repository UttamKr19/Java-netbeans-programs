/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inh3;

/**
 *
 * @author Uttam
 */

class Person {
	private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Teacher extends Person {
	private int salary;
	private String subject;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

class Student extends Person {
	private int roll;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}


class CollegeStudent extends Student {
	private int year;
	private String major;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}



public class Inh3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p=new Person();
        
        Teacher t=new Teacher();
        
        Student s=new Student();
        
        CollegeStudent cs=new CollegeStudent();
        
        p.setName("Uttam");
        System.out.println(p.getName());
        
        t.setName("Abracadabra");
        t.setSalary(100000);
        t.setSubject("English");
        
        s.setName("Voldemort");
        s.setRoll(3036);
        
        cs.setName("Severus Snape");
        cs.setMajor("Dark Magic");
        cs.setYear(1998);
        
        
        System.out.println("Person Name: "+p.getName());
        System.out.println("\nTeacher");
        System.out.println("Name: "+t.getName());
        System.out.println("Salary: "+t.getSalary());
        System.out.println("Sub: "+t.getSubject());
        
        System.out.println("\nStudent");
        System.out.println("Name: "+cs.getName());
        System.out.println("Roll: "+cs.getRoll());
        System.out.println("Yr: "+cs.getYear());
        System.out.println("Major: "+cs.getMajor());
        
    }
    
}
