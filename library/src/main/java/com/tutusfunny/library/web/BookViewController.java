package com.tutusfunny.library.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tutusfunny.library.dto.BookDTO;
import com.tutusfunny.library.dto.BookSaveDTO;
import com.tutusfunny.library.dto.BookUpdateDTO;
import com.tutusfunny.library.service.AuthorService;
import com.tutusfunny.library.service.BookService;
import com.tutusfunny.library.service.PublisherService;

@Controller
public class BookViewController {

    @Autowired
    private BookService bookService;

    @Autowired
    private AuthorService authorService;

    @Autowired
    private PublisherService publisherService;

    @PostMapping("/books/save")
    public String saveBookFromForm(@RequestParam String title,
                                   @RequestParam int author_id,
                                   @RequestParam int publisher_id) {
        System.out.println("Received: " + title + " | " + author_id + " | " + publisher_id);
        bookService.addBook(new BookSaveDTO(title, author_id, publisher_id));
        return "redirect:/books";
    }



    @GetMapping("/books")
    public String viewBooks(Model model) {
        model.addAttribute("books", bookService.getAllBook());
        model.addAttribute("authors", authorService.getAllAuthor());
        model.addAttribute("publishers", publisherService.getAllPublisher());
        return "book-list";
    }

    @GetMapping("/books/edit/{id}")
    public String editBookForm(@PathVariable int id, Model model) {
        BookDTO book = bookService.getAllBook().stream()
                .filter(b -> b.getBookid() == id)
                .findFirst()
                .orElse(null);
        model.addAttribute("book", book);
        model.addAttribute("authors", authorService.getAllAuthor());
        model.addAttribute("publishers", publisherService.getAllPublisher());
        return "edit-book";
    }

    @PostMapping("/books/update")
    public String updateBook(@RequestParam int bookid,
                             @RequestParam String title,
                             @RequestParam int author_id,
                             @RequestParam int publisher_id) {
        bookService.updateBook(new BookUpdateDTO(bookid, title, author_id, publisher_id));
        return "redirect:/books";
    }
    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
        return "redirect:/books";
    }


}
