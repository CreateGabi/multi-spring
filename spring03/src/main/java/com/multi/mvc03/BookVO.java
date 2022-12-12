package com.multi.mvc03;

public class BookVO {

	private int book_no;
	private String id;
	private String name;
	private String url;
	private String img;

	public int getBook_no() {
		return book_no;
	}
	
	public void setBook_no(int book_no) {
		this.book_no = book_no;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "BookVO [book_no=" + book_no + ", id=" + id + ", name=" + name + ", url=" + url + ", img=" + img + "]";
	}

}
