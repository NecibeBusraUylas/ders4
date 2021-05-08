package coffeeShop;

import coffeeShop.Abstract.BaseCustomerManager;
import coffeeShop.Concrete.NeroCustomerManager;
import coffeeShop.Entities.Customer;


public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager=new NeroCustomerManager();
		
		Customer customer=new Customer();
		customer.setId(1);
		customer.setFirstName("Büþra");
		customer.setLastName("Uylaþ");
		customer.setYearOfBirth(1998);
		customer.setNationalityId("11111111111");
		
		customerManager.save(customer);
	}
}