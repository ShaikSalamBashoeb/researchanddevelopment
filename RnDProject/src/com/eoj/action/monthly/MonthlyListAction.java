package com.eoj.action.monthly;

import java.util.List;

import com.eoj.dao.PersonDao;
import com.eoj.model.Employee;
import com.eoj.model.Item;

public class MonthlyListAction  {

	private Employee emp;
	private String name="salam";
	public String execute() {
		System.out.println("Execute in MonthlyList Action class: ");
		//getItemsList();
		
		return "monthlyList";
	}
	
	private List<Item> getItemsList() {

		return null;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
