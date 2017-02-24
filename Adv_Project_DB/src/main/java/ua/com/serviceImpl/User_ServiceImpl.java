package ua.com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.CRUD.dao.User_Dao_Final;
import ua.com.hustle.User;
import ua.com.service.User_Service;

@Service
public class User_ServiceImpl implements User_Service{

	@Autowired
	private User_Dao_Final userDao;
	
	@Override
	public void save(User user) {

		userDao.save(user);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public User findOne(int id) {
		return userDao.findOne(id);
	}

	@Override
	public void delete(int id) {

		userDao.delete(id);
	}

	@Override
	public User findByFullName(String fullName) {
		return userDao.findByFullName(fullName);
	}

	@Override
	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	@Override
	public User findByMobilePhone(String mobilePhone) {
		return userDao.findByMobilePhone(mobilePhone);
	}

	@Override
	public User findByPostCode(int postCode) {
		return userDao.findByPostCode(postCode);
	}

}
