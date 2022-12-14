package com.example.helloworld.app.echo;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EchoForm implements Serializable{

	private static final long serialVersionUID = 2557725707095364445L;
	
	@NotNull
	@Size(max=5,min=1)
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
