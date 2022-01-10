package me.swat018.demospringboot21autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

//    @Autowired
//    BookService bookService;
//
//    @GetMapping("/book")
//    public String book() {
//        bookService.hello();
//        return "hello";
//    }

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/book")
    public Book book() {
        bookRepository.findAll().forEach(System.out::println);
        Book book = bookRepository.findByIsbn("123123");
        return book;
    }
}
