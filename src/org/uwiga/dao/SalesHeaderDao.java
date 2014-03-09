package org.uwiga.dao;

import java.util.List;
import org.uwiga.model.Product;
import org.uwiga.model.Product;

public interface SalesHeaderDao {
	void saveOrUpdate(SalesHeaderDao o);

	void delete(SalesHeaderDao o);

	List<SalesHeaderDao> findAll();

	List<SalesHeaderDao> findById();
}
