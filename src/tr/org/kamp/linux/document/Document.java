package tr.org.kamp.linux.document;

import java.time.LocalDate;

public abstract class Document {
	private String author;
	private String content;
	private LocalDate createdTime;
	public Document(String author, String content) {
		
		this.author = author;
		this.content = content;
		this.createdTime = LocalDate.now();
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDate getCreatedTime() {
		return createdTime;
	}
	
	abstract void printDocument();
	
	
	
	
}
