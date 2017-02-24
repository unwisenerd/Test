package ua.com.service;

import java.util.List;

import ua.com.hustle.GPU_Type;


public interface GPU_Type_Service  {

	void save (GPU_Type gpuType);
	List<GPU_Type> findAll();
	GPU_Type findOne(int id);
	void delete(int id);
	
	GPU_Type findByType(String typeName);
	
	
}
