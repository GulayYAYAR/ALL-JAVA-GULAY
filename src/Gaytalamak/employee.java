package Gaytalamak;

public class employee {
    /*
    Task01:
	1. Create a class called Employee
			instance variables:
					name, id, ssn, jobTitle, salary, gender
			actions:
					setEmployeeInfo(): can initialize all the instance variables
					toString(): can return the info of the employee as string
	2. create a class called HumanResources
			declare 5 variables of Employee as static
			use static block to:
						1. initialize those static variables
						2. set all the info of the Employees
	3. create class called BankOfAzerbaijan
		in the main method:
				1. create a List of Employees
				2. add random two employees from HumanResources to the List
				3. use for each loop to print out the employee info
				4. now go back to HumanResources class and comment out the static block
				5. repeat the step 3 to print out the employee info to compare it with previous output
     */

 String name, id, ssn, jobTitle, gender;
 int salary;

 public void setEmployeeInfo(String name, String id, String ssn, String jobTitle, String gender, int salary){
     this.name=name;
     this.id=id;
     this.ssn=ssn;
     this.gender=gender;
     this.salary=salary;
     this.jobTitle=jobTitle;

 }

 public String toString(){
     return "Employee name: "+name+
             " Id: "+id+
             " SSN: "+ssn+
             " Job title: "+jobTitle+
             " Gender: "+gender+
             " Salary: "+salary;


 }







}
