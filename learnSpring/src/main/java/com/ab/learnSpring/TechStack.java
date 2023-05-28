package com.ab.learnSpring;

import java.util.List;

public class TechStack {
	private List<String> tech;

	public TechStack() {
	}

	public TechStack(List<String> tech) {
		this.tech = tech;
	}
	
	public String toString() {
		String s=new String();
		for(String temp:tech) {
			s+=temp+" ";
		}
		return s;
	}
}
