package classes;

public class Main {

	public static void main(String[] args) {
		// Classlar referans tiptir.
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		customerManager2.Add();
 
	}

}
