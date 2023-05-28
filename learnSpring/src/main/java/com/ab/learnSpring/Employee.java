package com.ab.learnSpring;

import java.util.List;
import java.util.Map;

public class Employee {
	private int id;
	private String name;
	private Address address;
	private List<TechStack> tech;
	private Map<String, String> contact;

	public Employee() {
		System.out.println("def cons");
	}

	public Employee(int id) {
		this.id = id;
	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Employee(int id, String name, Address address, List<TechStack> tech) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.tech = tech;
	}

	public Employee(int id, String name, Address address, List<TechStack> tech, Map<String, String> contact) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.tech=tech;
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<TechStack> getTech() {
		return tech;
	}

	public void setTech(List<TechStack> tech) {
		this.tech = tech;
	}

	public Map<String, String> getContact() {
		return contact;
	}

	public void setContact(Map<String, String> contact) {
		this.contact = contact;
	}

	void show() {
		System.out.println(id + " " + name + " " + address.toString());
		int c = 0;
		while (c < tech.size()) {
			System.out.println(tech.get(c));
			c++;
		}
	}

}
