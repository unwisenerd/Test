package ua.com.CRUD.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.hustle.Goods;
import ua.com.hustle.MakinCountry;

public interface Goods_Dao_Final extends JpaRepository<Goods, Integer> {

	Goods findByPrice(int price);
	
	Goods findByMakinCountry(MakinCountry makinCountry);
	
}
