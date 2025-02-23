package compteredu;

public class Comptecourant<T> extends Compte<T> {
	private double limsolde;

	public Comptecourant(int numerocompte, double solde, T devise, double limsolde) {
		super(numerocompte, solde, devise);
		this.limsolde = limsolde;
	}
	public void retirer(double montant) {
		if(super.getSolde()-montant>=limsolde) {
			super.retirer(montant);
		}
		else {
			System.out.println("le retrait de cet montant dépasse la limite d'authorisation de solde négatif ");
		}
	}
	public void affichersolde() {
		System.out.println("compte courant-solde:"+super.getSolde()+super.getDevise());
		
	}

}
