package monopoly;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
	private String name;
	private Pion pion;
	private int solde=20;
	private List<Propriete> proprietes = new ArrayList<Propriete>();
	
	public void jouer(Gobelet gobelet) throws SoldeNegatifException{
		int ancienSolde = solde;
		int r = gobelet.lancer();
		pion.avancer(r);
		System.out.println(">>> "+name+" [ancien solde : "+ancienSolde+" € - solde : "+solde+" €] a obtenu "+r+" et est sur "+pion.getPosition().getName());
	}

	public Joueur(String name) {
		this.name = name;
	}

	public void setPion(Pion pion) {
		this.pion = pion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pion getPion() {
		return pion;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}
	
	public void crediter(int somme){
		this.solde += somme;
	}
	
	public void debiter(int somme) throws SoldeNegatifException{
		this.solde -= somme;
		if(solde<0){
			throw new SoldeNegatifException();
		}
	}
	
	public void add(Propriete propriete){
		this.proprietes.add(propriete);
	}
	
	public void remettreEnJeuxLesProprietes(){
		for(Propriete p : proprietes)
			p.setProprietaire(null);;
		proprietes.clear();
	}

	public boolean veutAcheter(Propriete propriete) {
		if(solde<propriete.getPrixAchat())
			return false;
		return (int)(Math.random()*100)%2 == 0;
	}
}
