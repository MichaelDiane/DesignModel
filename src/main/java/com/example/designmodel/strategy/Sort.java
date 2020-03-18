package com.example.designmodel.strategy;

public class Sort {
	/**
	 * 冒泡排序
	 * @param arg
	 */
	public static void sort(int[] arg) {
		for (int i=0;i<arg.length-1;i++) {
			for(int j=i+1;j<arg.length;j++) {
				if(arg[i] > arg[j]) {
					int temp=arg[i];
					arg[i]=arg[j];
					arg[j]=temp;
				}
			}
		}
	}
	
	/**
	 * 排序重构
	 * @param obj
	 */
	@SuppressWarnings("all")
	public static void CompareTo(Comparable[] obj) {
		for (int i=0;i<obj.length-1;i++) {
			for(int j=i+1;j<obj.length;j++) {
				if(obj[i].compareTo(obj[j]) > 0) {
					Comparable temp = obj[i];
					obj[i]=obj[j];
					obj[j]=temp;
				}
			}
		}
	}
}
