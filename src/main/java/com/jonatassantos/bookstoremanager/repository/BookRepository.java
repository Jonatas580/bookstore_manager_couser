package com.jonatassantos.bookstoremanager.repository;

import com.jonatassantos.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository <Book, Long>{
}
