package compteredu;

public class CompteCourantSecuriser <T> extends Comptecourant<T> implements Securisable{
	private String id ;

	public CompteCourantSecuriser(int numerocompte, double solde, T devise, double limsolde, String id) {
		super(numerocompte, solde, devise, limsolde);
		this.id=id;
	}
	public boolean verifieridentite(String identifiant) {
		return this.id.equals(identifiant);
	}
	public void affichesolde(String identifiant) throws Accesinterditexception{
		if(verifieridentite(identifiant)){
			super.affichersolde();
		}
		else {
			throw new Accesinterditexception("identifiant non correcte");
		}
	}
	

}
