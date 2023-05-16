package com.weeklyTest.mapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_laptop")
public class Laptop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int laptopId;
	@Column(name="laptop_name")
	private String name;
	@Column(name="laptop_brand")
	private String brand;
	@Column(name="laptop_price")
	private int price;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Student student;

}
