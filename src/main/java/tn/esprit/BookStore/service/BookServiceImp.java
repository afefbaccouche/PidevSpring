package tn.esprit.BookStore.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.BookStore.model.Book;
import tn.esprit.BookStore.repository.BookRepository;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class BookServiceImp implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book addBook(Book b) {
        return bookRepository.save(b);
    }

    @Override
    public void deleteBook(Book b) {
        bookRepository.delete(b);
    }

    @Override
    public void updateBook(Book b) {
        bookRepository.save(b);
    }

    @Override
    public ArrayList<Book> getBookList() {
        return (ArrayList<Book>) bookRepository.findAll();
    }

    @Override
    public Book getBook(Book b) {
        return bookRepository.findById(b.getId()).get();
    }

    @Transactional
    @Override
    public Book getBookByID(int id) {
        System.out.println("***************************"+id);
        Optional<Book> op = bookRepository.findById(id);
        if (op.isPresent())
            return op.get();
        return null;
    }

    @Override
    public int getQuantity(int id) {
        return bookRepository.getQuantity(id);
    }

    @Override
    public void setQuantity(int id, int newQ) {
        bookRepository.setQuantity(id, newQ);
    }
}