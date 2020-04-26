package Entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	int id;
	
	@OneToMany(mappedBy="category", fetch=FetchType.EAGER)
	public List<Content> content;
	
	@Column(name="Name")
	String name;

	public Category(){}
	
	public Category(int id, String name){
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}

	public List<Content> getContent() {
		return content;
	}

	public String getName() {
		return name;
	}
}
