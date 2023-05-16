package com.weeklyTest.mapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
	@Column(name="book_title")
    private String title;
	@Column(name="book_author")
    private String author;
	@Column(name="book_des")
    private String description;
	@Column(name="book_price")
    private String price;
    @ManyToOne(cascade = CascadeType.ALL)
    private Student student;

}
