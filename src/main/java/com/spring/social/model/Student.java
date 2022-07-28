package com.spring.social.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    

	public Student(Long id, String name, String age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	private Long id;

    private String name;

    private String age;

}
