//4. Write a program to demonstrate different methods of different return types.

class Employee{
	int employeeId;
	String employeeName;
	double salary;
	
	int employeeIdInfo() {
		return employeeId;
	}
	
	String employeeNameInfo() {
		return employeeName;
	}
	
	double employeeSalaryInfo() {
		return salary;
	}
}
public class MethodReturnType {
	
   public static void main(String[] args) {
	

	Employee e1=new Employee();
	
	System.out.println("..........1st employee info.........");
	e1.employeeId=1234;
	e1.employeeName="Mrunal";
	e1.salary=30000;
	
	System.out.println("employeeId: "+e1.employeeIdInfo());
	System.out.println("employeeName: "+e1.employeeNameInfo());
	System.out.println("salary: "+e1.employeeSalaryInfo());
	
	Employee e2=new Employee();
	System.out.println(".........2nd employee info........");
	e2.employeeId=2356;
	e2.employeeName="Prisha";
	e2.salary=40000;
	
	System.out.println("employeeId: "+e2.employeeIdInfo());
	System.out.println("employeeName: "+e2.employeeNameInfo());
	System.out.println("salary: "+e2.employeeSalaryInfo());
	
}
	
	
}