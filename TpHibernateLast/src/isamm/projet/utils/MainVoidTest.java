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


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import isamm.projet.beans.Etudiant;
import isamm.projet.beans.Filiere;
import isamm.projet.beans.Formateur;
import isamm.projet.beans.Lignematierefiliere;
import isamm.projet.beans.Matiere;
import isamm.projet.service.EtudiantService;
import isamm.projet.service.FiliereService;
import isamm.projet.service.FormateurService;
import isamm.projet.service.LigneMatiereFiliereService;
import isamm.projet.service.MatiereService;

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
		
		
		//a - creer trois filiere
		FiliereService filiereService = new FiliereService();
		Filiere filiere1 = new Filiere();
		filiere1.setCode("IAII");
		filiere1.setLibelle("Ingénierie des automatismes et informatique industrielle");
		
		Filiere filiere2 = new Filiere();
		filiere2.setCode("IRT");
		filiere2.setLibelle("Ingénierie des réseaux et télécommunications");
		
		Filiere filiere3 = new Filiere();
		filiere3.setCode("IIR");
		filiere3.setLibelle("Ingénierie informatique et réseaux ");
		
		filiereService.create(filiere1);
		filiereService.create(filiere2);
		filiereService.create(filiere3);
		
		//b - Créer cinq matières
		MatiereService matiereService = new MatiereService();
		
		Matiere matiere1 = new Matiere();
		matiere1.setCode("Techniques de programmation structurée");
		matiere1.setCode("TPC");
		
		Matiere matiere2 = new Matiere();
		matiere2.setLibelle("Java de Base");
		matiere2.setCode("JB");
		
		Matiere matiere3 = new Matiere();
		matiere3.setLibelle("Administration Unix");
		matiere3.setCode("Au");
		
		Matiere matiere4 = new Matiere();
		matiere4.setLibelle("Framework de persistance");
		matiere4.setCode("Hibernate");
		
		Matiere matiere5 = new Matiere();
		matiere5.setLibelle("Programmation orientée objet");
		matiere5.setCode("POO");
		
		
		//c - creer deux formateurs
		FormateurService formateurService = new FormateurService();
		
		Personne p1 = new Personne("Slimani","Yahia","","","F1",null,null);
		Formateur formateur1 = new Formateur(p1, "formateur",null);
		
		formateurService.create(formateur1);
		
		Personne p2 = new Personne("Safii","Ilhem","","","",null,null);
		Formateur formateur2 = new Formateur(p2, "formateur",null);
		formateurService.create(formateur2);
		
		//part 2 b
		matiere1.setFormateur(formateur1);
		matiere2.setFormateur(formateur1);
		matiere3.setFormateur(formateur2);
		matiere4.setFormateur(formateur1);
		matiere5.setFormateur(formateur2);

		matiereService.create(matiere1);
		matiereService.create(matiere2);
		matiereService.create(matiere3);
		matiereService.create(matiere4);
		matiereService.create(matiere5);
		
		
		//d - Créer Trois étudiants

		EtudiantService etudiantService = new EtudiantService();
		
		Personne pe1 = new Personne("SAFI","Amal","22845676","","",null,null);
		Etudiant e1 = new Etudiant(filiere3,pe1 ,"cne");
		etudiantService.create(e1);
		
		Personne pe2 = new Personne("ALAMI","Samir","22845676","","",null,null);
		Etudiant e2 = new Etudiant(filiere3,pe1 ,"cne");
		etudiantService.create(e2);
		
		Personne pe3 = new Personne("ALAOUI","Safa","22345476","","",null,null);
		Etudiant e3 = new Etudiant(filiere1 ,pe1 ,"cne");
		etudiantService.create(e3);
		
		//e - Affecter les matières aux différentes filières :  filiere,  matiere,  masseHoraire
		LigneMatiereFiliereService ligneService = new LigneMatiereFiliereService();

		Lignematierefiliere lmf1 = new Lignematierefiliere(filiere1,matiere1, 30) ;	
		Lignematierefiliere lmf2 = new Lignematierefiliere(filiere2,matiere2, 30) ;		
		Lignematierefiliere lmf3 = new Lignematierefiliere(filiere3,matiere3, 30) ;		
		Lignematierefiliere lmf4 = new Lignematierefiliere(filiere1,matiere4, 30) ;		
		Lignematierefiliere lmf5 = new Lignematierefiliere(filiere3,matiere5, 30) ;		
		
		ligneService.create(lmf1);
		ligneService.create(lmf2);
		ligneService.create(lmf3);
		ligneService.create(lmf4);
		ligneService.create(lmf5);


		
		
				List<Formateur> formateurs = new ArrayList<Formateur>();
				System.out.println(formateurService.getFormateursByMatieres(matiere1));
				filiereService.getEtudiantsByFiliere(filiere3);
					System.out.println(matiere1.toString());
				
				
				
				List<Etudiant> etudiants = new ArrayList<Etudiant>();
				System.out.println(filiereService.getEtudiantsByFiliere(filiere1).size());
				filiereService.getEtudiantsByFiliere(filiere3).forEach(etudiants::add);
				for(int c=0;c<etudiants.size();c++){
					System.out.println(etudiants.get(c).toString());
				}
				
				
			

	}

}
