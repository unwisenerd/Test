package ua.com.CRUD.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.hustle.Good_Type;

public interface Good_Type_Dao_Final extends JpaRepository<Good_Type, Integer> {

	Good_Type findByType(String type);
}
