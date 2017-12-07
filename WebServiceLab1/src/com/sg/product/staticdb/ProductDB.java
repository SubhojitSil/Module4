package com.sg.product.staticdb;

import java.util.HashMap;

import com.sg.product.beans.Product;

public class ProductDB {
	static HashMap<String, Integer> hashMap =getHashMap();
	static{
		if(hashMap==null)
		{
			hashMap=new HashMap<String,Integer>();
			Product product1= new Product("Cheese",120);
			Product product2= new Product("Egg",60);
			Product product3= new Product("Rice",10);
			Product product4= new Product("Daal",56);
			
			hashMap.put(product1.getName(), product1.getPrice());
			hashMap.put(product2.getName(), product2.getPrice());
			hashMap.put(product3.getName(), product3.getPrice());
			hashMap.put(product4.getName(), product4.getPrice());
			
		}
		
	}
	public static HashMap<String, Integer> getHashMap() {
		return hashMap;
	}
	
	

}
