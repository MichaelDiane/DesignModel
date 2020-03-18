package com.example.designmodel.strategy;

import java.util.Comparator;

/**
 * 定义duck比较策略
 * @author michael
 *
 */
public class DuckCompatator implements Comparator<Duck> {
	@Override
	public int compare(Duck o1, Duck o2) {
		return o1.compareTo(o2);
	}


}
