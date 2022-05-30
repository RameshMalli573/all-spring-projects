package com.config.model;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Embeddable
public class BookIdentity implements Serializable{
	
    @NotNull
    @Size(max = 20)
    private String bookId;

    @NotNull
    @Size(max = 20)
    private String libraryId;
    
	public BookIdentity() {

    }
	
	public BookIdentity(String bookId,String libraryId) {
		this.bookId = bookId;
		this.libraryId = libraryId;
	}
    
    
    public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookIdentity that = (BookIdentity) o;

        if (!bookId.equals(that.bookId)) return false;
        return libraryId.equals(that.libraryId);
    }
    
    @Override
    public int hashCode() {
        int result = bookId.hashCode();
        result = 31 * result + bookId.hashCode();
        return result;
    }
    
}
