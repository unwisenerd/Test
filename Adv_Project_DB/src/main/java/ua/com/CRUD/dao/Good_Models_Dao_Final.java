package ua.com.CRUD.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.hustle.Good_Models;

public interface Good_Models_Dao_Final extends JpaRepository<Good_Models, Integer > {

	Good_Models findBymodelName(String modelName);
	
	//@Query("select i from Good_Models i left join fetch i.")
	
}
