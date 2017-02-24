package ua.com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.CRUD.dao.Ram_Type_Dao_Final;
import ua.com.hustle.Ram_Type;
import ua.com.service.Ram_Type_Service;

@Service
public class Ram_Type_ServiceImpl implements Ram_Type_Service {

	@Autowired
	private Ram_Type_Dao_Final ramTypeDao;
	
	@Override
	public void save(Ram_Type ramType) {
		ramTypeDao.save(ramType);		
	}

	@Override
	public List<Ram_Type> findAll() {
		return ramTypeDao.findAll();
	}

	@Override
	public Ram_Type findOne(int id) {
		return ramTypeDao.findOne(id);
	}

	@Override
	public void delete(int id) {

		ramTypeDao.delete(id);
	}

	public Ram_Type findByRamType(String ramType) {
		return ramTypeDao.findByRamType(ramType);
	}

}
