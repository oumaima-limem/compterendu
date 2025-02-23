package compteredu;

public abstract class Compte <T>{
	private int numerocompte;
	private double solde;
	private T devise;
	public Compte(int numerocompte, double solde, T devise) {
		this.numerocompte = numerocompte;
		this.solde = solde;
		this.devise = devise;
	}
	public void deposer(double montant) {
		this.solde=this.solde+montant;
	}
	public void retirer(double montant) {
		this.solde=this.solde-montant;
	}
	public abstract void affichersolde() ;
	public int getNumerocompte() {
		return numerocompte;
	}
	public void setNumerocompte(int numerocompte) {
		this.numerocompte = numerocompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public T getDevise() {
		return devise;
	}
	public void setDevise(T devise) {
		this.devise = devise;
	}
	public static <T>void transferer(Compte<T> source,Compte<T> destination,double montant ){
		source.retirer(montant);
		source.deposer(montant);
	}

}
