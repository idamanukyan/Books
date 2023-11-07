package com.example.books.controller;

import com.example.books.model.Author;
import com.example.books.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AuthorController {

    @Autowired
    private AuthorService authorService;


    @PostMapping("/add-author")
    public Author addAuthor(@RequestBody Author author) throws Exception {

        if (author == null) {
            throw new Exception("Request is null");
        }

        Author savedAuthor = authorService.addAuthor(author);

        if (savedAuthor == null) {
            throw new Exception("Something went wrong");
        }

        return author;
    }

    //TODO
    //getById
    //deleteAuthor
    //updateAuthor
    //same for Book


}
