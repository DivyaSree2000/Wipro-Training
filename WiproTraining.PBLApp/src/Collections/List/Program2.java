package Collections.List;

import java.util.ArrayList;
class EmployeeDB {
	ArrayList<Employee> list=new ArrayList<>();
	boolean addEmployee(Employee e) {
		return list.add(e);
	}
	boolean deleteEmployee(int empId) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getid()==empId)
				return list.remove(list.get(i));
		}
		return false;
	}
	String showPaySlip(int empId) {
		for(int i =0;i<list.size();i++) {
			if(list.get(i).getid()==empId) {
				return "Salary of empid "+list.get(i).getid()+" is "+list.get(i).getSalary();
			}
		}
		return "Given EmpId Not Found";
	}
}
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDB edb = new EmployeeDB();
		Employee e1 = new Employee(1001,"Aayush","gupta@gmail.com","Male",80000);
		Employee e2 = new Employee(1002,"Riya","rj1992@gmail.com","Female",70000);
		Employee e3 = new Employee(1003,"Shivam","shivam@gmail.com","Male",90000);
		Employee e4 = new Employee(1004,"Vaishali","vaishali@gmail.com","Female",100000);
		edb.addEmployee(e1);
		edb.addEmployee(e2);
		edb.addEmployee(e3);
		edb.addEmployee(e4);
		e3.GetEmployeeDetails();
		System.out.println(edb.showPaySlip(1003));
		edb.deleteEmployee(1003);
		System.out.println(edb.showPaySlip(1003));
	}

}
