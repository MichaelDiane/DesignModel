package com.example.designmodel.strategy;

import java.util.Comparator;

public class DuckSort<T>{
	/**
	 * 排序重构
	 * @param obj
	 */
	@SuppressWarnings("all")
	public  void sort(T[] arr,Comparator<T> comparator) {
		for (int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(comparator.compare(arr[i], arr[j])>0) {
					T temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
