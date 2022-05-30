package com.config.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.config.model.*;


@Repository
public interface BookRepository extends JpaRepository<Book, BookIdentity> {
    List<Book> findByBookId(String BookId);
}

