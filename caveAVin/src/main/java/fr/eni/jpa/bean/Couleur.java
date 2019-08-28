package fr.eni.jpa.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="couleur")
public class Couleur {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nom;
	
	
	
	public Couleur() {
		super();
	}

	public Couleur(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}


	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	
	
	@Override
	public String toString() {
		return "Couleur [id=" + id + ", nom=" + nom + "]";
	}
	
	
	
	

}
