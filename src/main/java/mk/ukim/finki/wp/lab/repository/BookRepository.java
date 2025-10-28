package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Book;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BookRepository {

        List<Book> findAll();
        List<Book> searchBooks(String text, Double rating);

}
