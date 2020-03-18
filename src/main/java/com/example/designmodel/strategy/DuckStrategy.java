package com.example.designmodel.strategy;

import java.util.Arrays;

/**
 * 设计模式-策略模式
 *
 * @author michael
 * @Date Mar 10, 2020
 */
@SuppressWarnings("all")
public class DuckStrategy {
	public static void main(String[] args) {
		int[] arg = {8,9,7,5,4,3,2,6,1};
		Sort sort =  new Sort();
		sort.sort(arg);
		for (int i=0;i<arg.length;i++) {
			System.out.println(arg[i]);
		}
		System.out.println();
		Duck[] ducks =  {new Duck("鸭子1", 3),new Duck("鸭子2", 1),new Duck("鸭子3", 5),new Duck("鸭子4", 2)};
		sort.CompareTo(ducks);
		System.out.println(Arrays.deepToString(ducks));
		for (int i=0;i<ducks.length;i++) {
			System.out.println(ducks[i]);
		}
		Duck[] ducks2 =  {new Duck("鸭子5", 3),new Duck("鸭子6", 1),new Duck("鸭子7", 5),new Duck("鸭子8", 2)};
		
		//通过策略模式比较，这里定义了根据鸭子的重量策略进行排序，当然也可以定义根据鸭子的其他属性例如名字比较策略这样的设计灵活性是非常灵活性和扩展性就非常强
		DuckSort<Duck> duckSort =  new DuckSort<Duck>();
		duckSort.sort(ducks2, new DuckCompatator());
		System.out.println();
		System.out.println(Arrays.deepToString(ducks2));
		for (int i=0;i<ducks2.length;i++) {
			System.out.println(ducks2[i]);
		}
	}
}
