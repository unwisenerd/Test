package ua.com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.CRUD.dao.Good_Models_Dao_Final;
import ua.com.hustle.Good_Models;
import ua.com.service.Good_Models_Service;

@Service
public class Good_Models_ServiceImpl implements Good_Models_Service {
 

	
	@Autowired
	private Good_Models_Dao_Final goodModelDao;
	
	public void save(Good_Models goodModel) {

		goodModelDao.save(goodModel);

	}

	public List<Good_Models> findAll() {
		
		return goodModelDao.findAll();
		
	}

	
	public Good_Models findOne(int  id) {
		
		return goodModelDao.findOne(id);
		
	}

	
	public void delete(int id) {

		goodModelDao.delete(id);
		
	}

	public Good_Models findBymodelName(String modelName) {
		return goodModelDao.findBymodelName(modelName);
	}

	

	
	
}
