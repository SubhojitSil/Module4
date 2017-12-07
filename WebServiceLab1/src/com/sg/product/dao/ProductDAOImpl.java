package com.sg.product.dao;

import java.util.HashMap;

import com.sg.product.staticdb.ProductDB;

public class ProductDAOImpl implements IProductDAO {
	static HashMap<String, Integer> hashmap=ProductDB.getHashMap();

	@Override
	public int getPrice(String name) {
		int price=hashmap.get(name);
		return price;
	}

}
