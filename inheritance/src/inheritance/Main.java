package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer();
		Employee employee = new Employee();

		CustomerManeger customerManeger = new CustomerManeger();
		EmployeeMane employeeMane = new EmployeeMane();

		customerManeger.List();
		employeeMane.BestEmployee();
	}

}
