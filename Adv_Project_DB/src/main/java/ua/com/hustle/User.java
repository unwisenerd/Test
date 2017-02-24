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
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String fullName;
	
	private String email;
	
	private String password;
	
	private String mobilePhone;
	
	private int postCode;
	
	@ManyToMany
	@JoinTable(name="user_goods",
		joinColumns=@JoinColumn(name="id_user"),
		inverseJoinColumns=@JoinColumn(name="id_good"))
	private List<Goods> goods;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String fullName, String email, String password,
			String mobilePhone, int postCode) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.mobilePhone = mobilePhone;
		this.postCode = postCode;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", email=" + email
				+ ", password=" + password + ", mobilePhone=" + mobilePhone
				+ ", postCode=" + postCode + "]";
	}
	
	
	
}
