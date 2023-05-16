package com.weeklyTest.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weeklyTest.mapping.model.Laptop;

public interface ILaptopRepository extends JpaRepository<Laptop, Integer> {

}
