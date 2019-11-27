package be.intecbrussel.classiccars.service.implementation;

import be.intecbrussel.classiccars.data.dao.CustomerDao;
import be.intecbrussel.classiccars.entity.Customer;
import be.intecbrussel.classiccars.service.CustomerService;

import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {

    CustomerDao customerDao;

    public CustomerServiceImpl(CustomerDao customerDao){
        this.customerDao = customerDao;
    }

    @Override
    public Optional<Customer> getCustomer(int id) {
        return customerDao.read(id);
    }
}
