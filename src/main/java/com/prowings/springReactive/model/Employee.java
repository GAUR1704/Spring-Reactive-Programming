package com.prowings.springReactive.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {

	
	private static final long serialVersionUID = -6578674916162843966L;
	
	private long id;
	private String name;
	private String status;

}
