package com.shalem.bookstoreapp.controller;

import com.shalem.bookstoreapp.dto.BookDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @GetMapping("/all")
    public ResponseEntity<List<BookDto>> getAllBooks(){
        BookDto book= BookDto.builder()
                .title("New Java Edition")
                .build();
        List<BookDto> books=new ArrayList<>();
        books.add(book);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
