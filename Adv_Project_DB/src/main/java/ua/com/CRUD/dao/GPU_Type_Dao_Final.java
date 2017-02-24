package ua.com.CRUD.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.hustle.GPU_Type;

public interface GPU_Type_Dao_Final extends JpaRepository<GPU_Type, Integer> {

	GPU_Type findByType(String typeName);
}
