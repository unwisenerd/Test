package ua.com.CRUD.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ua.com.hustle.Goods;
import ua.com.hustle.MakinCountry;

public class Goods_Dao {

	final EntityManager manager;
	
	//private MakinCountry mk =MakinCountry.USA;

	public Goods_Dao(EntityManager manager) {
		super();
		this.manager = manager;
	}
	
	public void savePrice(Goods goodPrice ){
		
		manager.getTransaction().begin();
		
		manager.persist(goodPrice);
		
		//manager.persist(mk.USA);
		
		manager.getTransaction().commit();
	}
	

	
	public List<Goods> findAll(){
		
		List<Goods> good = manager.createQuery("from Goods").getResultList();
		
		return good;
	}
	
	public Goods findOneByPrice(int good_price){
		
		Goods good = (Goods) manager.createQuery("select b from Goods b where b.price =:param")
					.setParameter("param", good_price).getSingleResult();
			
			return good;
	
	}
	
	public void delete(int good_price){
		
		manager.getTransaction().begin();
		
		manager.remove(findOneByPrice(good_price));
		
		manager.getTransaction().commit();
		
	}
	
	
	
	
}
	

