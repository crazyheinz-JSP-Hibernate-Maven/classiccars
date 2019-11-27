package be.intecbrussel.classiccars.service;

import be.intecbrussel.classiccars.entity.Customer;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface CustomerService {

    Optional<Customer> getCustomer(int id);


}
