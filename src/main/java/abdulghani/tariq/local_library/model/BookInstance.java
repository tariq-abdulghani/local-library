package abdulghani.tariq.local_library.model;

import java.util.Date;

public class BookInstance {

    String id;
    Date dueBack;
    LoanStatus status;
    String imprint;

    Book book;
    User borrower ;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDueBack() {
        return dueBack;
    }

    public void setDueBack(Date dueBack) {
        this.dueBack = dueBack;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }

    public String getImprint() {
        return imprint;
    }

    public void setImprint(String imprint) {
        this.imprint = imprint;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookInstance{" +
                "id='" + id + '\'' +
                ", book=" + book +
                '}';
    }
}
