package com.easy.entity;

public class page {
	
	//当前页码
	private int currentpage;
	//每页数据的条数
	public static final int count = 4;
	
	public int getCurrentpage() {
		return currentpage;
	}
	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}
	public static int getCount() {
		return count;
	}
	
	
}
