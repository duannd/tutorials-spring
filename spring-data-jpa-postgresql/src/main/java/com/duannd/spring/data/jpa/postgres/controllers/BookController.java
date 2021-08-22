package com.duannd.spring.data.jpa.postgres.controllers;

import com.duannd.spring.data.jpa.postgres.domain.Book;
import com.duannd.spring.data.jpa.postgres.repositories.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created By duan.nguyen
 */
@RestController
@RequestMapping("/api/books")
@Slf4j
public class BookController {

    private final BookRepository bookRepository;

    @Autowired
    private BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@Valid @RequestBody Book book) {
        Book savedBook = bookRepository.save(book);
        return ResponseEntity.ok(savedBook);
    }

}
