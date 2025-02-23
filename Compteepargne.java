package compteredu;

public class Compteepargne <T> extends Compte<T> {
	private double tauxinteret;

	public Compteepargne(int numerocompte, double solde, T devise, double tauxinteret) {
		super(numerocompte, solde, devise);
		this.tauxinteret = tauxinteret;
	}
	public void affichersolde() {
		System.out.println("compte epargne -solde:"+super.getSolde()+super.getDevise());
		
	}
	public void calculerinteret() {
		super.deposer(super.getSolde()*tauxinteret);
	}

}
