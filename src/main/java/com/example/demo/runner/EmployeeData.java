package com.example.demo.runner;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;

@Component
public class EmployeeData implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		Set<String> st=new HashSet<>();
		st.add("abc");
		st.add("ml");
		repo.save(new Employee(1,"Prateek",100.1, st));
	}

}
