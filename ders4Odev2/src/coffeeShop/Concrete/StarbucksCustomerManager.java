package coffeeShop.Concrete;

import coffeeShop.Abstract.BaseCustomerManager;
import coffeeShop.Abstract.CustomerCheckService;
import coffeeShop.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override 
	public void save(Customer customer) throws Exception {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			throw new Exception("Not a valid person!");
		}
	}
}