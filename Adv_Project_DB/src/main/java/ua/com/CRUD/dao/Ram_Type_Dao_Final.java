package ua.com.CRUD.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.hustle.Ram_Type;

public interface Ram_Type_Dao_Final extends JpaRepository<Ram_Type, Integer> {
	
	Ram_Type findByRamType(String ramType);

}
