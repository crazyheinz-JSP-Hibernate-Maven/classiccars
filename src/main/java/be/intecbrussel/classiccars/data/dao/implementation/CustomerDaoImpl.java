package be.intecbrussel.classiccars.data.dao.implementation;

import be.intecbrussel.classiccars.data.dao.CustomerDao;
import be.intecbrussel.classiccars.entity.Customer;

import javax.persistence.EntityManagerFactory;
import java.util.Optional;

public class CustomerDaoImpl extends CrudDaoHibernateImp<Customer> implements CustomerDao {
    public CustomerDaoImpl(EntityManagerFactory entityManagerFactory) {
        super(entityManagerFactory,Customer.class);
    }

    @Override
    public Optional<Customer> read(int id) {
        return Optional.ofNullable(getEntityManager().find(Customer.class, id));
    }
}
