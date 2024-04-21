package com.ps;

public class Book {
    private long id;
    private String isbn;
    private String title;
    private Boolean isCheckedOut;
    private String checkedOutTo;

public Book (long id, String isbn, String title, boolean isCheckedOut, String checkedOutTo){
    this.id = id;
    this.isbn = isbn;
    this.title = title;
    this.isCheckedOut = isCheckedOut;
    this.checkedOutTo = checkedOutTo;
}

    public long getId() {
        return id;
    }

    public String getIsbn(){
    return isbn;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getIsCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setCheckedOut(Boolean checkedOut) {
        isCheckedOut = checkedOut;
    }


    @Override
    public String toString(){
    return "Book{" +
            "id=" + id +
            ", isbn='" + isbn + '\'' +
            ", title='" + title + '\'' +
            ", checkedOut='" + isCheckedOut +
            ", checkedOutTo='" + checkedOutTo + '\'' +
            '}';
    }



}
