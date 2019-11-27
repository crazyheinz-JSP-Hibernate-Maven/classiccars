package be.intecbrussel.classiccars.data.dao.implementation;

import be.intecbrussel.classiccars.data.dao.CrudDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;
import java.util.Optional;

public class CrudDaoHibernateImp<T> implements CrudDao<T> {

    private EntityManagerFactory entityManagerFactory;

    private Class<T> tClass;


    public CrudDaoHibernateImp(EntityManagerFactory entityManagerFactory, Class<T> tClass) {
        this.entityManagerFactory = entityManagerFactory;
        this.tClass = tClass;
    }

    @Override
    public List<T> readAll() {
        List resultList = getEntityManager().createQuery("from " + tClass.getName())
                .getResultList();
        return resultList;
    }


    @Override
    public Optional<T> read(T entity) {
        return Optional.ofNullable(getEntityManager().find(tClass, entity));
    }

    @Override
    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    @Override
    public void update(T entity) {
        getEntityManager().merge(entity);
    }

    @Override
    public void delete(T entity) {
        getEntityManager().remove(entity);
    }

    protected EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
}
