package ua.com.hustle;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Goods {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToMany
	@JoinTable(name="goods_models",
		joinColumns=@JoinColumn(name="id_good"),
		inverseJoinColumns=@JoinColumn(name="id_model"))
	private List<Good_Models> goodModel;
	
	@ManyToMany
	@JoinTable(name="goods_types",
		joinColumns=@JoinColumn(name="id_good"),
		inverseJoinColumns=@JoinColumn(name="id_type"))
	private List<Good_Type> goodType;
	
	@ManyToMany
	@JoinTable(name="goods_proccs",
		joinColumns=@JoinColumn(name="id_good"),
		inverseJoinColumns=@JoinColumn(name="id_procc"))
	private List<Procc_Type> proccType;
	
	@ManyToMany
	@JoinTable(name="goods_gpus",
		joinColumns=@JoinColumn(name="id_good"),
		inverseJoinColumns=@JoinColumn(name="id_gpu"))
	private List<GPU_Type> gpuType;
	
	@ManyToMany
	@JoinTable(name="goods_rams",
		joinColumns=@JoinColumn(name="id_good"),
		inverseJoinColumns=@JoinColumn(name="id_ram"))
	private List<Ram_Type> ramType;
	
	@ManyToMany
	@JoinTable(name="goods_memories",
		joinColumns=@JoinColumn(name="id_good"),
		inverseJoinColumns=@JoinColumn(name="id_memory"))
	private List<Memory> memoryType;
	
	private int price;
	
	@Enumerated
	private MakinCountry makinCountry; 
	
	@ManyToMany
	@JoinTable(name="user_goods",
		joinColumns=@JoinColumn(name="id_good"),
		inverseJoinColumns=@JoinColumn(name="id_user"))
	private List<User> users;
	
	
	public Goods() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	public Goods(int price, MakinCountry makinCountry) {
		super();
		this.price = price;
		this.makinCountry = makinCountry;
	}





	



	@Override
	public String toString() {
		return "Goods [id=" + id + ", price=" + price + ", makinCountry="
				+ makinCountry + "]";
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((goodModel == null) ? 0 : goodModel.hashCode());
		result = prime * result
				+ ((goodType == null) ? 0 : goodType.hashCode());
		result = prime * result + ((gpuType == null) ? 0 : gpuType.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((memoryType == null) ? 0 : memoryType.hashCode());
		result = prime * result + price;
		result = prime * result
				+ ((proccType == null) ? 0 : proccType.hashCode());
		result = prime * result + ((ramType == null) ? 0 : ramType.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goods other = (Goods) obj;
		if (goodModel == null) {
			if (other.goodModel != null)
				return false;
		} else if (!goodModel.equals(other.goodModel))
			return false;
		if (goodType == null) {
			if (other.goodType != null)
				return false;
		} else if (!goodType.equals(other.goodType))
			return false;
		if (gpuType == null) {
			if (other.gpuType != null)
				return false;
		} else if (!gpuType.equals(other.gpuType))
			return false;
		if (id != other.id)
			return false;
		if (memoryType == null) {
			if (other.memoryType != null)
				return false;
		} else if (!memoryType.equals(other.memoryType))
			return false;
		if (price != other.price)
			return false;
		if (proccType == null) {
			if (other.proccType != null)
				return false;
		} else if (!proccType.equals(other.proccType))
			return false;
		if (ramType == null) {
			if (other.ramType != null)
				return false;
		} else if (!ramType.equals(other.ramType))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public List<Good_Models> getGoodModel() {
		return goodModel;
	}


	public void setGoodModel(List<Good_Models> goodModel) {
		this.goodModel = goodModel;
	}


	public List<Good_Type> getGoodType() {
		return goodType;
	}


	public void setGoodType(List<Good_Type> goodType) {
		this.goodType = goodType;
	}


	public List<Procc_Type> getProccType() {
		return proccType;
	}


	public void setProccType(List<Procc_Type> proccType) {
		this.proccType = proccType;
	}


	public List<GPU_Type> getGpuType() {
		return gpuType;
	}


	public void setGpuType(List<GPU_Type> gpuType) {
		this.gpuType = gpuType;
	}

	public List<Memory> getMemoryType() {
		return memoryType;
	}


	public void setMemoryType(List<Memory> memoryType) {
		this.memoryType = memoryType;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}




	

}
