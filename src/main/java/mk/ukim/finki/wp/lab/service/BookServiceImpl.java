package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService{
    @Override
    public List<Book> listAll() {
        return List.of();
    }

    @Override
    public List<Book> searchBooks(String text, Double rating) {
        return List.of();
    }
}
