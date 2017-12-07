package com.sg.product.service;

import javax.jws.WebService;

import com.sg.product.dao.IProductDAO;
import com.sg.product.dao.ProductDAOImpl;

@WebService(endpointInterface="com.sg.product.service.IProductService")
public class ProductServiceImpl {

	public int getPrice(String name) {
		IProductDAO iProductDAO = new ProductDAOImpl();
		return iProductDAO.getPrice(name);
	}

}
