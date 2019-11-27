package be.intecbrussel.classiccars.data.dao;

import java.util.List;
import java.util.Optional;

public interface CrudDao<T> {

    List<T> readAll();

    Optional<T> read(T entity);
    void create(T entity);
    void update(T entity);
    void delete(T entity);

}
