package mk.ukim.finki.wp.lab.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mk.ukim.finki.wp.lab.model.BookReservation;
import mk.ukim.finki.wp.lab.service.BookReservationService;

import java.io.IOException;

@WebServlet(name = "bookReservation",urlPatterns = "/bookReservation")
public class BookReservationServlet extends HttpServlet {
    private final BookReservationService bookReservationService;

    public BookReservationServlet(BookReservationService bookReservationService) {
        this.bookReservationService = bookReservationService;
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // 🔹 1. Ги читаме податоците од формата
        String bookTitle = req.getParameter("bookTitle");
        int numCopies = Integer.parseInt(req.getParameter("numCopies"));
        String readerName = req.getParameter("readerName");
        String readerAddress = req.getParameter("readerAddress");
        
}
}
