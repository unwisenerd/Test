package ua.com.CRUD.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.hustle.Memory;

public interface Memory_Dao_Final extends JpaRepository<Memory, Integer> {

	Memory findByType(String typeName);

	
}
