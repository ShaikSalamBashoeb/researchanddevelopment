package com.adp;

import javax.xml.ws.Endpoint;

public class Publisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1234/EmployeeTestService", new EmployeeService());
		System.out.println("Publisher running!!!");
	}
}
