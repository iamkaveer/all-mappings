package com.weeklyTest.mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weeklyTest.mapping.model.Laptop;
import com.weeklyTest.mapping.repository.ILaptopRepository;

@Service
public class LaptopService {
	@Autowired
	private ILaptopRepository laptopRepo;
	
	//create 
	public Laptop addLaptop(Laptop newLaptop) {
		return laptopRepo.save(newLaptop);
	}
	//get by id
	public Laptop getLaptopById(int id) {
		return laptopRepo.findById(id).get();
	}
	
	//get all 
		public List<Laptop> getAllLaptop(){
			return laptopRepo.findAll();
		}
		
		//delete
		public void deleteLaptopById(int id) {
			laptopRepo.deleteById(id);
		}
		
	//update by id
		
		public void updateLaptopById(int id, Laptop newLaptop) {
			Laptop lap = laptopRepo.findById(id).get();
			lap.setBrand(newLaptop.getBrand());
			lap.setLaptopId(newLaptop.getLaptopId());
			lap.setName(newLaptop.getName());
			lap.setStudent(newLaptop.getStudent());
			lap.setPrice(newLaptop.getPrice());
			laptopRepo.save(lap);
			
		}

}
