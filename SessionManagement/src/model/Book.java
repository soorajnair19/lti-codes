package model;

public class Book
{
String bookname;
String authorname;
int id;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public String getBookname() {
	return bookname;
}
public String getAuthorname() {
	return authorname;
}
public int getId() {
	return id;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public void setAuthorname(String authorname) {
	this.authorname = authorname;
}
public void setId(int id) {
	this.id = id;
}
	
}