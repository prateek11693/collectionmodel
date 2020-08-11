package com.example.demo.model;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
	
	@Id
	private Integer eid;
	
	private String ename;
	private Double esal;
	
	@ElementCollection
	@CollectionTable(name="projectTable", joinColumns=@JoinColumn(name="eid"))
	
	@Column(name="projectname")
	private Set<String> project;
	

}
