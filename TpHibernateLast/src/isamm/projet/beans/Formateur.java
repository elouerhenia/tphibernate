package isamm.projet.beans;
// Generated 19 nov. 2017 22:25:43 by Hibernate Tools 5.2.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Formateur generated by hbm2java
 */
@Entity
@Table(name = "formateur", catalog = "bdhibernate_lasttp")
public class Formateur implements java.io.Serializable {

	private int idPersonne;
	private String matricule;

	public Formateur() {
	}

	public Formateur(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	public Formateur(int idPersonne, String matricule) {
		this.idPersonne = idPersonne;
		this.matricule = matricule;
	}

	@Id

	@Column(name = "idPersonne", unique = true, nullable = false)
	public int getIdPersonne() {
		return this.idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	@Column(name = "matricule", length = 254)
	public String getMatricule() {
		return this.matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

}
