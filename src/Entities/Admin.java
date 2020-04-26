package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	@Id
	@Column(name="Username")
	String username;
	
	@Column(name="Password")
	String password;
	
	@Column(name="Phone")
	String phone;
	
	@Column(name="FullName")
	String fullname;
	
	public String getPhone() {
		return phone;
	}

	public String getFullname() {
		return fullname;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	public Admin(){
	}
	public Admin(String username,String password, String fullname, String phone) {
		this.username=username;
		this.fullname=fullname;
		this.phone=phone;
		this.password=password;
	}
}
