package coffeeShop.Abstract;

import java.rmi.RemoteException;
import coffeeShop.Entities.Customer;

public interface CustomerCheckService {
	
	boolean CheckIfRealPerson(Customer customer) throws RemoteException;
}