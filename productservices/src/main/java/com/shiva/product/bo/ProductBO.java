package com.shiva.product.bo;

import com.shiva.product.dto.Product;

public interface ProductBO {
	
	void create(Product product);
	
	Product findProduct(int id);
}
