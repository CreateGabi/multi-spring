package com.multi.mvc03;

public class Bbs2VO {

	private int bbsId;
	private String title;
	private String content;
	private String writer;
	private String fileName;
	public int getBbsId() {
		return bbsId;
	}
	public void setBbsId(int bbsId) {
		this.bbsId = bbsId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public String toString() {
		return "Bbs2VO [bbsId=" + bbsId + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", fileName=" + fileName + "]";
	}
}
