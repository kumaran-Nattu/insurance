package com.employeeService.employeeservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor                                                                    //@one to many entity
@NoArgsConstructor
@Table(name="project")
public class Project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idLong;
	private String name;
	

}
