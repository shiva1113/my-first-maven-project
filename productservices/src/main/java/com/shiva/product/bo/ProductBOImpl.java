package com.shiva.product.bo;

import com.shiva.product.dao.ProductDAO;
import com.shiva.product.dto.Product;
import com.shiva.product.dao.ProductDAOImpl;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();
	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
