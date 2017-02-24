package ua.com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.CRUD.dao.Procc_Type_Dao_Final;
import ua.com.hustle.Procc_Type;
import ua.com.service.Procc_Type_Service;

@Service
public class Procc_Type_ServiceImpl implements Procc_Type_Service {

	@Autowired
	private Procc_Type_Dao_Final proccTypeDao;
	
	@Override
	public void save(Procc_Type proccType) {
		proccTypeDao.save(proccType);
	}

	@Override
	public List<Procc_Type> findAll() {
		return proccTypeDao.findAll();
	}

	@Override
	public Procc_Type findOne(int id) {
		return proccTypeDao.findOne(id);
	}

	@Override
	public void delete(int id) {
		proccTypeDao.delete(id);
	}

	public Procc_Type findByType(String proccType) {
		return proccTypeDao.findByType(proccType);
	}

}
