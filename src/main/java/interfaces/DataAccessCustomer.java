package interfaces;
import models.Customer;
import java.util.List;

public interface DataAccessCustomer {
    void insertCustomer(Customer customer);
    Customer findCustomerById(int customerId);
    List<Customer> findAllCustomers();
    boolean updateCustomer(Customer customer);
    boolean deleteCustomer(int customerId);
}
