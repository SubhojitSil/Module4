package com.sg.product.controller;

import java.net.MalformedURLException;
import java.net.URL;




import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.sg.product.service.IProductService;

public class ProductController {

	public static void main(String[] args) throws MalformedURLException  {
		URL url = new URL("http://localhost:8081/cs?wsdl");
		QName qname = new QName("http://service.product.sg.com/",
				"ProductServiceImplService");
		
		
				Service service = Service.create(url, qname);
				
				IProductService iProductService=service.getPort(IProductService.class);
				Scanner scanner = new Scanner(System.in);
				String name = scanner.nextLine();
				System.out.println("get price");
				int price=iProductService.getPrice(name);
				System.out.println("price"+price);
				scanner.close();
				

	}

}
