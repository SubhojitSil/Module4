package com.sg.product.controller;

import javax.xml.ws.Endpoint;

import com.sg.product.service.ProductServiceImpl;

public class ProductPublisher {
public static void main(String[] args) {
	Endpoint.publish("http://127.0.0.1:8081/cs", new ProductServiceImpl());
	System.out.println("web service for Product publish successfully");
    System.out.println("Press CTRL + C to terminate Service");
}
}
