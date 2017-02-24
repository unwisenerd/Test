package ua.com.service;

import java.util.List;





import ua.com.hustle.Goods;
import ua.com.hustle.MakinCountry;

public interface Goods_Service {

	void save (Goods goods);
	List<Goods> findAll();
	Goods findOne(int id);
	void delete(int id);
	
	Goods findByPrice(int price);
	
	Goods findByMakinCountry(MakinCountry makinCountry);
	
}
