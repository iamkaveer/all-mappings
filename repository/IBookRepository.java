package com.weeklyTest.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weeklyTest.mapping.model.Book;

public interface IBookRepository extends JpaRepository<Book,Integer> {

}
