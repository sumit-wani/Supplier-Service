package com.shopify.dao;

import com.shopify.entity.SupplierEntity;

public interface SupplierDao {
	
	public boolean addSupplier(SupplierEntity supplierEntity);

	public SupplierEntity getSupplierById(long supplierId);
	
	public boolean updateSupplier(SupplierEntity supplierEntity);
}
