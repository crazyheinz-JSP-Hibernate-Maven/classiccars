package be.intecbrussel.classiccars.app;

import be.intecbrussel.classiccars.data.dao.CustomerDao;
import be.intecbrussel.classiccars.data.dao.implementation.CustomerDaoImpl;
import be.intecbrussel.classiccars.service.CustomerService;
import be.intecbrussel.classiccars.service.implementation.CustomerServiceImpl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CustomerApp {


    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence_unit_classiccars");
        CustomerDao customerDao = new CustomerDaoImpl(entityManagerFactory);
        CustomerService customerService = new CustomerServiceImpl(customerDao);
        System.out.println(customerService.getCustomer(103));


    }


}
