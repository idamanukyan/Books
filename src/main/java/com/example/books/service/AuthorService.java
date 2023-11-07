package com.example.books.service;

import com.example.books.model.Author;
import com.example.books.repostiory.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author addAuthor(Author author) {

        Author saved = authorRepository.save(author);

        return saved;
    }
}
