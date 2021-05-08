package coffeeShop.Concrete;

import coffeeShop.Abstract.CustomerCheckService;
import coffeeShop.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}
}