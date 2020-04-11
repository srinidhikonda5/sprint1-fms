package com.capg1.lab_book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Author_data")
public class Author {

	@Id
//	@GeneratedValue(strategy =GenerationType.AUTO)
 private int authorId;
	@Column(name="author_firstname", length=30, nullable=false)
 private String firstName;
	@Column(name="author_middlename", length=30, nullable=false)
 private String middleName;
	@Column(name="author_lastname", length=30, nullable=false)
 private String lastName;
	@Column(nullable=false)
 private long  phoNo;
 
public Author() {
	super();
	// TODO Auto-generated constructor stub
}
public Author(int authorId, String firstName, String middleName, String lastName, long phoNo) {
	super();
	this.authorId = authorId;
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.phoNo = phoNo;
}
public int getAuthorId() {
	return authorId;
}
public void setAuthorId(int authorId) {
	this.authorId = authorId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public long getPhoNo() {
	return phoNo;
}
public void setPhoNo(long phoNo) {
	this.phoNo = phoNo;
}
@Override
public String toString() {
	return "Author [authorId=" + authorId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
			+ lastName + ", phoNo=" + phoNo + "]";
}
 
}
