package ua.com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.CRUD.dao.GPU_Type_Dao_Final;
import ua.com.hustle.GPU_Type;
import ua.com.service.GPU_Type_Service;

@Service
public class GPU_Type_ServiceImpl implements GPU_Type_Service {

	@Autowired
	private GPU_Type_Dao_Final gpuTypeDao;
	
	public void save(GPU_Type gpuType) {
		gpuTypeDao.save(gpuType);
		
	}

	
	public List<GPU_Type> findAll() {
		return gpuTypeDao.findAll();
	}

	
	public GPU_Type findOne(int id) {
		return gpuTypeDao.findOne(id);
	}

	
	public void delete(int id) {
		gpuTypeDao.delete(id);
	}


	
	public GPU_Type findByType(String typeName) {
		return gpuTypeDao.findByType(typeName);
	}

}
