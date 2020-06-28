package com.example.spring_demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User
{
	
	private String id;
	private String name;
	
	public User(@JsonProperty String id,@JsonProperty String name)
	{
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
