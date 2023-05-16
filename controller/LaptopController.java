package com.weeklyTest.mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.weeklyTest.mapping.model.Laptop;
import com.weeklyTest.mapping.service.LaptopService;

@RestController
public class LaptopController {
	@Autowired
	private LaptopService laptopService;
	
	//add 
	@PostMapping("/add-laptop")
	public Laptop addLaptop(@RequestBody Laptop laptop) {
		return laptopService.addLaptop(laptop);
	}
	
	//get by id
		@GetMapping("/get-laptop/{id}")
		public Laptop getLaptopById(@PathVariable int id) {
			return laptopService.getLaptopById(id);
		}
		

		//update
		@PutMapping("/update-laptop/{id}")
		public void updateLaptop(@PathVariable int id,@RequestBody Laptop newLaptop) {
			laptopService.updateLaptopById(id, newLaptop);
	    }
		
		//delete student by id
		
		@DeleteMapping("delete-laptop/{id}")
	    public void deleteLaptop(@PathVariable int id) {
			laptopService.deleteLaptopById(id);
	    }
		
		//get all
		
		@GetMapping("/get-all-laptops")
		public List<Laptop> getAllLaptops(){
			return laptopService.getAllLaptop();
		}

}
