package it.italiangrid.portal.fluka.db.dao.generic;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO<T,ID extends Serializable> {

	 T findById(ID id, boolean lock);
	 
    List<T> findAll();
 
    List<T> findByExample(T exampleInstance, String[] excludePropert);
 
    T makePersistent(T entity);
 
    void makeTransient(T entity);
	
}
