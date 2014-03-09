package org.uwiga.dao;

import java.util.List;

import org.uwiga.model.Product;

public interface SalesDetailDao {
	void saveOrUpdateDetail(SalesDetailDao o);

	void deleteDetail(SalesDetailDao o);

	List<SalesDetailDao> findAllDetail();

	List<SalesDetailDao> findByIdDetail();
}
