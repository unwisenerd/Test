package ua.com.CRUD.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.hustle.Procc_Type;

public interface Procc_Type_Dao_Final extends JpaRepository<Procc_Type, Integer> {

	Procc_Type findByType(String proccType);
}
