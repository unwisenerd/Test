package ua.com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.CRUD.dao.Goods_Dao_Final;
import ua.com.hustle.Goods;
import ua.com.hustle.MakinCountry;
import ua.com.service.Goods_Service;

@Service
public class Goods_ServiceImpl implements Goods_Service {

	@Autowired
	private Goods_Dao_Final goodDao;

	public void save(Goods goods) {
		goodDao.save(goods);
	}

	
	public List<Goods> findAll() {
		return goodDao.findAll();
	}

	
	public Goods findOne(int id) {
		return goodDao.findOne(id);
	}

	
	public void delete(int id) {
		goodDao.delete(id);
		
	}


	@Override
	public Goods findByPrice(int price) {
		
		return goodDao.findByPrice(price);
	}


	public Goods findByMakinCountry(MakinCountry makinCountry) {
		
		return goodDao.findByMakinCountry(makinCountry);
	}

}
