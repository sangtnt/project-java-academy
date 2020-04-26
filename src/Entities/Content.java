package Entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TypedQuery;

import Utils.JpaUtils;

@Entity
@Table(name="Content")
public class Content {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	int id;
		
	@Column(name="Words")
	String words;
		
	@Column(name="Meaning")
	String meaning;
	
	@ManyToOne
	@JoinColumn(name="CatID")
	Category category;
	
	public int getId() {
		return id;
	}

	public String getWords() {
		return words;
	}

	public String getMeaning() {
		return meaning;
	}

	public Category getCategory() {
		return category;
	}
	public Content() {
		
	}
	public Content(int id, String words,String meaning, Category category) {
		this.id =id;
		this.words=words;
		this.meaning=meaning;
		this.category=category;
	}
}