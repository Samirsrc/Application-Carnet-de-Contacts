
import javax.swing.JOptionPane;

public class Personne {
	private Nom nom = new Nom();
	private long telephone;
	private String email;
	private String groupe;

	public Personne(String prenom, String nom, long telephone, String groupe) {
		this.nom.nom = nom;
		this.nom.prenom = prenom;
		this.telephone = telephone;
		this.email = (this.nom.nom + "." + this.nom.prenom + "@mail.dz");
		this.groupe = groupe;
	}

	public void afficherInfo() {
		JOptionPane.showMessageDialog(null, "Les informations du contact :\n Nom : " + nom.nom + " " + nom.prenom
				+ "\n Telephone : " + telephone + "\n Email : " + email + "\n Groupe : " + groupe);
	}

	public long getTelephone() {
		return telephone;
	}

	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGroupe() {
		return groupe;
	}

	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}

	public Nom getNom() {
		return nom;
	}

	public void setNomnom(String nom) {
		this.nom.nom = nom;
	}
	public void setNomprenom(String  nom) {
		this.nom.prenom = nom;
	}

}
