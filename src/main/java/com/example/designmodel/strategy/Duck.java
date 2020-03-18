package com.example.designmodel.strategy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Duck implements Comparable<Object> {
	
	private String name;
	private Integer weight;
	

	public Duck(String name, Integer weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	@Override
	public int compareTo(Object obj) {
		Duck duck  = (Duck) obj;
		if(this.weight < duck.weight) {
			return -1 ;
		}else if (this.weight > duck.weight){
			return 1 ;
		}else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + ", weight=" + weight + "]";
	}
}
