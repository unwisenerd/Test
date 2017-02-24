package ua.com.service;

import java.util.List;

import ua.com.hustle.Ram_Type;



public interface Ram_Type_Service {

	void save (Ram_Type ramType);
	List<Ram_Type> findAll();
	Ram_Type findOne(int id);
	void delete(int id);
	
	Ram_Type findByRamType(String ramType);

	
}
