package isamm.projet.utils;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;

import isamm.projet.beans.Etudiant;
import isamm.projet.beans.Filiere;
import isamm.projet.beans.Formateur;
import isamm.projet.beans.Lignematierefiliere;
import isamm.projet.beans.Matiere;
import isamm.projet.beans.Personne;

public class MainVoidTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*  System.out.println("Hibernate many to many (Annotation)");
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();

			Personne petd = new Personne( "nom",  "prenom", " telephone","  email", " sexe",null,null);
			Personne pfor = new Personne( "nom", " prenom",  "telephone", " email", " sexe",null,null);
			
			Filiere filiere1 = new Filiere();
			filiere1.setCode("code");
			filiere1.setLibelle("libelle");
	        session.save(filiere1);

			Etudiant etd1 = new Etudiant();
			etd1.setFiliere(filiere1);
			etd1.setCne("cne");
			etd1.setPersonne(petd);
			
			Formateur formateur = new Formateur();
			formateur.setPersonne(pfor);
			formateur.setMatricule("matricule");
			
			session.save(etd1);
	        session.save(formateur);
	        
	        //Matiere(Formateur formateur, String code, String libelle, Set<Lignematierefiliere> lignematierefilieres) {

			Matiere matiere1 = new Matiere(formateur," code", " libelle", null);
			Matiere matiere2 = new Matiere(formateur," code", " libelle" ,null);
	        session.save(matiere1);
	        session.save(matiere2);


	        Lignematierefiliere ligne = new Lignematierefiliere(filiere1 ,  matiere1,  5);
		    Lignematierefiliere ligne1 = new Lignematierefiliere(filiere1 ,  matiere2,  6) ;

	        session.save(ligne);
	        session.save(ligne1);
			
			session.getTransaction().commit();
			System.out.println("Done");*/
		
		
			

	}

}
