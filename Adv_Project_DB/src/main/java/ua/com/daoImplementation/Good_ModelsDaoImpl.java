//package ua.com.daoImplementation;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import ua.com.CRUD.dao.Good_ModelsDao_Spring;
//import ua.com.hustle.Good_Models;
//
//
//@Repository
//public class Good_ModelsDaoImpl implements Good_ModelsDao_Spring {
//
//	//NOT INCLUDED IN PROJECT
//	
//	@PersistenceContext(unitName="primary")
//	private EntityManager manager;
//	
//	@Transactional
//	public void save(Good_Models goodModel) {
//	
//		manager.persist(goodModel);
//		
//	}
//
//	@Transactional
//	public List<Good_Models> findAll() {
//		
//		return manager.createQuery("from Good_Models").getResultList();
//	}
//
//	@Transactional
//	public Good_Models findOne(String model_name) {
//		
//		return (Good_Models) manager.createQuery("select b from Good_Models b where b.modelName =:modelName")
//				.setParameter("modelName", model_name)
//				.getSingleResult();
//	}
//
//	@Transactional
//	public void delete(String model_name) {
//		
//		manager.remove(findOne(model_name));
//		
//	}
//
//	
//	
//}
