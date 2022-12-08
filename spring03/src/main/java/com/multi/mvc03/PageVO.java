package com.multi.mvc03;

public class PageVO {
	
	private int start;
	private int end;
	private int page;
	//private int one
	
	public void setStartEnd(int page) {
		start = 1 + (page - 1) * 10;
		end = page * 10;
		//start = (page * one) - page
		//end = page * one
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	@Override
	public String toString() {
		return "PageVO [start=" + start + ", end=" + end + ", page=" + page + "]";
	}
	
}