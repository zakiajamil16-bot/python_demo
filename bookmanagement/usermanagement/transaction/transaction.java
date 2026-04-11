package bookmanagement.usermanagement.transaction;

import bookmanagement.Book;
import bookmanagement.usermanagement.User;

public class transaction {
    public void issueBook(Book book, User user) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Book issued to " + user.getUserId());
        } else {
            System.out.println("Book is not available");
        }
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
        System.out.println("Book returned successfully");
    }
}
    
