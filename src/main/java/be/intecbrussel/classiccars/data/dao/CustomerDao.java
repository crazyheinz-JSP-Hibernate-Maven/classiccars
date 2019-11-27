package be.intecbrussel.classiccars.data.dao;

import be.intecbrussel.classiccars.entity.Customer;

import java.util.Optional;

public interface CustomerDao extends CrudDao<Customer> {

Optional<Customer> read(int id);
}
