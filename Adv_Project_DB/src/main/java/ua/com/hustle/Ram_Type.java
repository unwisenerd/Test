package ua.com.hustle;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Ram_Type {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String ramType;
	
	@ManyToMany
	@JoinTable(name="goods_rams",
		joinColumns=@JoinColumn(name="id_ram"),
		inverseJoinColumns=@JoinColumn(name="id_good"))
	private List<Goods> goods;
	
	public Ram_Type() {
		// TODO Auto-generated constructor stub
	}

	public Ram_Type(String ramType) {
		super();
		this.ramType = ramType;
	}

	@Override
	public String toString() {
		return "Ram_Type [id=" + id + ", ramType=" + ramType + "]";
	}
	
	
	
}
