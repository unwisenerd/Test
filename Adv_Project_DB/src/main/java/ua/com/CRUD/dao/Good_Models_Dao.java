package ua.com.CRUD.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ua.com.hustle.Good_Models;
import ua.com.hustle.Goods;

public class Good_Models_Dao {

	final EntityManager manager;

	public Good_Models_Dao(EntityManager manager) {
		super();
		this.manager = manager;
	}
	
	public void save(Good_Models goodModel){
		
		manager.getTransaction().begin();
		
		manager.persist(goodModel);
		
		manager.getTransaction().commit();
	}
	
	public List<Good_Models> findAll(){
		
		List<Good_Models> goodModel = manager.createQuery("from Good_Models").getResultList();
		
		return goodModel;
	}
	
	public Good_Models findOne(String model_name){
		
			Good_Models goodModel = (Good_Models) manager.createQuery("select b from Good_Models b where b.modelName =:param")
					.setParameter("param", model_name).getSingleResult();
			
			return goodModel;
			
	
	}
	
	public void delete(String goodModel){
		
		manager.getTransaction().begin();
		
		manager.remove(findOne(goodModel));
		
		manager.getTransaction().commit();
		
	}
	
	public void addModelToGood(String modelName, int goodPrice){
		manager.getTransaction().begin();
		
		Good_Models goodModel = (Good_Models) manager.
				createQuery("select a from Good_Models a where a.modelName =:param").
				setParameter("param", modelName).
				getSingleResult();
		
		
		Goods good = (Goods) manager.
				createQuery("select b from Goods b where b.price =:param").
				setParameter("param", goodPrice)
				.getSingleResult();
		
		good.getGoodModel().add(goodModel);
		
		
		manager.getTransaction().commit();
	}
	
	
	public void deleteConnectionGoodPrice(String modelName, int price){
		
		manager.getTransaction().begin();
		
		Good_Models goodModel = (Good_Models) manager.createQuery("select u from Good_Models u where u.modelName =:name")
				.setParameter("name", modelName)
				.getSingleResult();
		
		Goods good = (Goods) manager.createQuery("select b from Goods b where b.price =:price")
				.setParameter("price", price)
				.getSingleResult();
		
		goodModel.getGoods().remove(good);
		
		manager.getTransaction().commit();
		
		
		
	}
	
	//DELETE FROM ONE TO MANY!!!!!!!
//	public void oneToMamyDelete(String bookName){
//		
//		manager.getTransaction().begin();
//		
//		Book book = manager.createQuery("select b from book b where b.title =:title")
//				.setParameter("title", bookName)
//				.getSingleResult();
//		
//		book.setAuthor(null);
//		
//		manager.getTransaction().commit();
//		
//	}
	
	
	
	//Delete author from all books(OneToMany)!!!!!!!!!!!
//	public void deleteAuthor(String  authorName){
//		
//		manager.getTransaction().begin();
//		
//		Author author = manager.createQuery("select a from Author a where a.name =:name")
//				.setParameter("name", authorName)
//				.getSingleResult();
//		
//		fore (Book book : author.getBooks()){
//			
//			book.setAuthor(null);
//			
//			manager.merge(book);
//			
//		}
//		
//		manager.remove(author);
//		
//		manager.getTransaction().commit();
//		
//	}
	
	
}
