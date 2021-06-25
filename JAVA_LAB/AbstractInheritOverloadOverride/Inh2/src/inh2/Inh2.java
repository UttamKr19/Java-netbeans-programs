/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inh2;

/**
 *
 * @author Uttam
 */

class Person {
	protected String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}


class Employee extends Person {
	private double annualSalary;
	private int yearOfJoining;
	private String nationalInsuranceNo;
	
	public Employee(String name, double annualSalary, int yearOfJoining, String nationalInsuranceNo) {
		super(name);
		this.annualSalary = annualSalary;
		this.yearOfJoining = yearOfJoining;
		this.nationalInsuranceNo = nationalInsuranceNo;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public String getNationalInsuranceNo() {
		return nationalInsuranceNo;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [annualSalary=" + annualSalary + ",\n yearOfJoining=" + yearOfJoining + ",\n nationalInsuranceNo="
				+ nationalInsuranceNo + ",\n name=" + name + "]";
	}
	
	
}

public class Inh2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Employee employee = new Employee("John Doe", 5000000, 2019, "321a2sd1321ad");
		System.out.println(employee);
	}
    
}
