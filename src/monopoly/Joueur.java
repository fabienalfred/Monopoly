package monopoly;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
	
	/***** ATTRIBUTES *****/
	
	private Plateau plateau;
	private String nom;
	private Pion pion;
	private int solde=20;
	private List<Propriete> proprietes = new ArrayList<>();
	private int cptDouble=0;
	
	
	/***** CONSTRUCTORS *****/
	
	public Joueur(){
		
	}
	
	public Joueur(String nom){
		this.nom = nom;
	}
	
	/***** METHODS 
	 * @throws SoldeNegatifException *****/
	
	public void jouer(Gobelet gobelet) throws SoldeNegatifException{
		int ancienSolde = this.solde;
		int resultat = gobelet.lancer();
		System.out.print(this.nom + " fait ");
		if(gobelet.isDouble()){
			this.cptDouble++;
			if(cptDouble==3){
				System.out.println("un 3e double ! "+this.getNom()+" va en prison !");
				this.getPion().setPosition(plateau.getCases()[9]);
				this.setCptDouble(0);
				return;
			}
			System.out.print("double "+gobelet.getDes()[0].getValue()+" ! ");
		}
		else
			System.out.print(resultat+" ! ");
		pion.avancer(resultat);
		System.out.println("\t-> " + pion.getPosition().getNom()
							+ " (" + pion.getNbToursPlateau() + "e tour de plateau) "
							+ "\t"+ancienSolde + "€ => " + this.solde + "€");
		if(gobelet.isDouble())
			this.jouer(gobelet);
		else
			this.setCptDouble(0);
	}
	
	public void crediter(int somme){
		this.solde += somme;
	}
	
	public void debiter(int somme) throws SoldeNegatifException{
		this.solde -= somme;
		if(this.solde<0)
			throw new SoldeNegatifException();
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

	public Plateau getPlateau() {
		return this.plateau;
	}
	
	public void setPlateau(Plateau plateau){
		this.plateau = plateau;
	}
	
	public String getNom() {
		return this.nom;
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
		return this.solde;
	}
	
	public void setSolde(int solde) {
		this.solde = solde;
	}

	public List<Propriete> getProprietes() {
		return this.proprietes;
	}

	public int getCptDouble() {
		return this.cptDouble;
	}

	public void setCptDouble(int cptDouble) {
		this.cptDouble = cptDouble;
	}
	
}
