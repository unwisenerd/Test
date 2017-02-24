package ua.com.hustle;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class GPU_Type {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String type;
	
	@ManyToMany
	@JoinTable(name="goods_gpus",
		joinColumns=@JoinColumn(name="id_gpu"),
		inverseJoinColumns=@JoinColumn(name="id_good"))
	private List<Goods> goods;
	
	public GPU_Type() {
		// TODO Auto-generated constructor stub
	}

	public GPU_Type(String type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "GPU_Type [id=" + id + ", type=" + type + "]";
	}
	
	
}
