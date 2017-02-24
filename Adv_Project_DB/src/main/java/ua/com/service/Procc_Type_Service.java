package ua.com.service;

import java.util.List;

import ua.com.hustle.Procc_Type;



public interface Procc_Type_Service {

	void save (Procc_Type proccType);
	List<Procc_Type> findAll();
	Procc_Type findOne(int id);
	void delete(int id);
	
	Procc_Type findByType(String proccType);

}
