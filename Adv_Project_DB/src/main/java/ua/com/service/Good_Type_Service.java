package ua.com.service;

import java.util.List;

import ua.com.hustle.Good_Models;
import ua.com.hustle.Good_Type;

public interface Good_Type_Service {

	void save (Good_Type goodType);
	List<Good_Type> findAll();
	Good_Type findOne(int id);
	void delete(int id);
	
	Good_Type findByType(String type);
}
