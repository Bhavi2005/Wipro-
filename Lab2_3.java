package Pac2;
import com.cg.eis.bean.Employee;
import com.cg.eis.pl.EmployeeServiceImplementation;
import com.cg.eis.service.EmployeeService;
public class Lab2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee= new Employee(101, "Bhavitha", 100000, "Tester");
		
		EmployeeService es= new EmployeeServiceImplementation();
	employee.setInsuranceSchemeString(es.setInsuranceScheme(employee));
		System.out.println(employee);

	}

}
