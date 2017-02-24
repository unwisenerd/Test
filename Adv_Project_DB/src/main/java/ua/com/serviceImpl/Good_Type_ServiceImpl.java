package ua.com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.CRUD.dao.Good_Type_Dao_Final;
import ua.com.hustle.Good_Models;
import ua.com.hustle.Good_Type;
import ua.com.service.Good_Type_Service;

@Service
public class Good_Type_ServiceImpl implements Good_Type_Service{

	@Autowired
	private Good_Type_Dao_Final goodTypeDaoFinal;

	@Override
	public void save(Good_Type goodType) {
		
		goodTypeDaoFinal.save(goodType);
		
	}



	@Override
	public List<Good_Type> findAll() {
		return goodTypeDaoFinal.findAll();
	}



	@Override
	public Good_Type findOne(int id) {
		return goodTypeDaoFinal.findOne(id);
	}



	@Override
	public void delete(int id) {
		
		goodTypeDaoFinal.delete(id);
	}
	
	public Good_Type findByType(String type) {
		return goodTypeDaoFinal.findByType(type);
	}

}
