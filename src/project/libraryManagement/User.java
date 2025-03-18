package project.libraryManagement;

import java.util.ArrayList;

public class User {
    private String firstName;
    private String lastName;
    private long aadharNo;
    private ArrayList<Books> rentedBooks = new ArrayList<>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(long aadharNo) {
        this.aadharNo = aadharNo;
    }

    public ArrayList<Books> getRentedBooks() {
        return rentedBooks;
    }

    public void setRentedBooks(ArrayList<Books> rentedBooks) {
        this.rentedBooks = rentedBooks;
    }
    public void rentBook(Books b ){
        rentedBooks.add(b);
    }
    public void returnBook(Books b){
        rentedBooks.remove(b);
    }
    public void getAllBooks(){
     for (Books book: rentedBooks){
         System.out.println(book.getBookName());
        }
    }
}
