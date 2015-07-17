package monopoly;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
	
	/***** ATTRIBUTES *****/
	
	private String nom;
	private Pion pion;
	private int solde=2000;
	private List<Propriete> proprietes = new ArrayList<>();
	
	
	/***** CONSTRUCTORS *****/
	
	public Joueur(){
		
	}
	
	public Joueur(String nom){
		this.nom = nom;
	}
	
	/***** METHODS *****/
	
	public void jouer(Gobelet gobelet){
		int ancienSolde = this.solde;
		int resultat = gobelet.lancer();
		pion.avancer(resultat);
		System.out.println(this.nom + " fait " + resultat 
							+ "\t-> " + pion.getPosition().getNom()
							+ " (" + pion.getNbToursPlateau() + "e tour de plateau) "
							+ "\t"+ancienSolde + "€ => " + this.solde + "€");
	}
	
	public void crediter(int somme){
		this.setSolde(this.getSolde()+somme);
	}
	
	public void debiter(int somme){
		this.setSolde(this.getSolde()-somme);
	}
	
	public void addPropriete(Propriete propriete){
		this.proprietes.add(propriete);
	}
	
	public void remettreEnJeu(){
		for(Propriete p : this.proprietes){
			p.setOwner(null);
		}
		this.proprietes.clear();
	}
	
	public boolean veutAcheter(Propriete propriete){
		if(propriete.getPrixAchat()>this.getSolde())
			return false;
		else
			return (int)(Math.random()*3)+1 > 1;
	}
	
	/***** GETTERS SETTERS *****/
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Pion getPion() {
		return this.pion;
	}
	
	public void setPion(Pion pion) {
		this.pion = pion;
	}
	
	public int getSolde() {
		return solde;
	}
	
	public void setSolde(int solde) {
		this.solde = solde;
	}
	
}
