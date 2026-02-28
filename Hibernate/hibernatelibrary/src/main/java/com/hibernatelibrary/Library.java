package com.hibernatelibrary;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Library {

	@Id
	private int libraryId;
	private String libraryName;
	private int totalBooks;
	private String location;
	
	public int getLibraryId() {
		return libraryId;
	}
	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public int getTotalBooks() {
		return totalBooks;
	}
	public void setTotalBooks(int totalBooks) {
		this.totalBooks = totalBooks;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
