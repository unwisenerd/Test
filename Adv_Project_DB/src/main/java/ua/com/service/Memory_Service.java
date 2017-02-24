package ua.com.service;

import java.util.List;

import ua.com.hustle.Memory;



public interface Memory_Service  {

	void save (Memory memoryType);
	List<Memory> findAll();
	Memory findOne(int id);
	void delete(int id);
	
	Memory findByType(String typeName);
}
