package ua.com.service;

import java.util.List;

import ua.com.hustle.Good_Models;

public interface Good_Models_Service {

	void save (Good_Models goodModel);
	List<Good_Models> findAll();
	Good_Models findOne(int id);
	void delete(int id);
	
	Good_Models findBymodelName(String modelName);

	
}
