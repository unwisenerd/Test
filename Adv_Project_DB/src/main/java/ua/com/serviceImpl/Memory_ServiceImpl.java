package ua.com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.CRUD.dao.Memory_Dao_Final;
import ua.com.hustle.Memory;
import ua.com.service.Memory_Service;

@Service
public class Memory_ServiceImpl implements Memory_Service{

	@Autowired
	private Memory_Dao_Final memoryDao;
	
	@Override
	public void save(Memory memoryType) {
		memoryDao.save(memoryType);
	}

	@Override
	public List<Memory> findAll() {
		
		return memoryDao.findAll();
	}

	@Override
	public Memory findOne(int id) {
		return memoryDao.findOne(id);
	}

	@Override
	public void delete(int id) {

		memoryDao.delete(id);
	}

	
	public Memory findByType(String typeName) {
		return memoryDao.findByType(typeName);
	}

}
