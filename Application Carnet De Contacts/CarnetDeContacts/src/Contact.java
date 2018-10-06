import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Contact {
	ArrayList<Personne> listeContacts = new ArrayList();

	void ajoutContact(String prenom, String nom, long num, String grp) {

		listeContacts.add(new Personne(prenom, nom, num, grp));

	}

	void ajoutContact() {
		JOptionPane.showMessageDialog(null, "Ajout d'un nouveau contact :");
		listeContacts.add(new Personne(JOptionPane.showInputDialog("Prenom du contact : "),
				JOptionPane.showInputDialog("Nom du contact : "),
				Integer.parseInt(JOptionPane.showInputDialog("Numéro du contact : ")),
				JOptionPane.showInputDialog("Groupe : ")));

	}

	void suppContact(int i) {
		listeContacts.remove((i - 1));
		JOptionPane.showMessageDialog(null, "Suppression du contact " + i + ":");

	}

	void modifierContact(int i) {
		int r = Integer.parseInt(JOptionPane.showInputDialog(
				"Que voulez-vous modifier ? \n [1] pour le nom \n [2] pour le prénom \n [3] pour le numéro de telephone \n [4] pour l'email \n [5] pour le groupe \n [6] pour sortir"));
		switch (r) {
		case 1:
			listeContacts.get(i).setNomnom(JOptionPane.showInputDialog("Donnez le nouveau nom :"));
			break;
		case 2:
			listeContacts.get(i).setNomprenom(JOptionPane.showInputDialog("Donnez le nouveau prénom :"));
			break;
		case 3:
			listeContacts.get(i).setTelephone(
					Integer.parseInt(JOptionPane.showInputDialog("Donnez le nouveau numéro de téléphone :")));
			break;
		case 4:
			listeContacts.get(i).setEmail(JOptionPane.showInputDialog("Donnez le nouveau mail :"));
			break;
		case 5:
			listeContacts.get(i).setGroupe(JOptionPane.showInputDialog("Donnez le nouveau groupe"));
			break;
		case 6:
			break;
		}

	}

	void modifierContact(String name) {
		int p = 0;
		for (int i = 0; i < listeContacts.size(); i++) {
			if (name.matches(listeContacts.get(i).getNom().nom)) {
				p = i;
			}
		}
		int r = Integer.parseInt(JOptionPane.showInputDialog(
				"Que voulez-vous modifier ? \n [1] pour le nom \n [2] pour le prénom \n [3] pour le numéro de telephone \n [4] pour l'email \n [5] pour le groupe \n [6] pour sortir"));
		switch (r) {
		case 1:
			listeContacts.get(p).setNomnom(JOptionPane.showInputDialog("Donnez le nouveau nom :"));
			break;
		case 2:
			listeContacts.get(p).setNomprenom(JOptionPane.showInputDialog("Donnez le nouveau prénom :"));
			break;
		case 3:
			listeContacts.get(p).setTelephone(
					Integer.parseInt(JOptionPane.showInputDialog("Donnez le nouveau numéro de téléphone :")));
			break;
		case 4:
			listeContacts.get(p).setEmail(JOptionPane.showInputDialog("Donnez le nouveau mail :"));
			break;
		case 5:
			listeContacts.get(p).setGroupe(JOptionPane.showInputDialog("Donnez le nouveau groupe"));
			break;
		case 6:
			break;
		}

	}

	void mesAmis() {
		ArrayList<String> mesAmis = new ArrayList();
		for (int i = 0; i < listeContacts.size(); i++) {

			if (listeContacts.get(i).getGroupe().matches("amis")) {
				mesAmis.add(listeContacts.get(i).getNom().nom + " " + listeContacts.get(i).getNom().prenom);
			}
		}
		Collections.sort(mesAmis);
		JOptionPane.showMessageDialog(null, mesAmis);

	}

	void maFamille() {
		ArrayList<String> maFamille = new ArrayList();
		for (int i = 0; i < listeContacts.size(); i++) {

			if (listeContacts.get(i).getGroupe().matches("famille")) {
				maFamille.add(listeContacts.get(i).getNom().nom + " " + listeContacts.get(i).getNom().prenom);
			}
		}
		Collections.sort(maFamille);
		JOptionPane.showMessageDialog(null, maFamille);

	}

	void colleguesTravail() {

		ArrayList<String> collegues = new ArrayList();
		for (int i = 0; i < listeContacts.size(); i++) {

			if (listeContacts.get(i).getGroupe().matches("collegues")) {
				collegues.add(listeContacts.get(i).getNom().nom + " " + listeContacts.get(i).getNom().prenom);
			}
		}
		Collections.sort(collegues);
		JOptionPane.showMessageDialog(null, collegues);

	}

	void mesFavoris() {
		ArrayList<String> mesFavoris = new ArrayList();
		for (int i = 0; i < listeContacts.size(); i++) {

			if (listeContacts.get(i).getGroupe().matches("favoris")) {
				mesFavoris.add(listeContacts.get(i).getNom().nom + " " + listeContacts.get(i).getNom().prenom);
			}
		}
		Collections.sort(mesFavoris);
		JOptionPane.showMessageDialog(null, mesFavoris);

	}

	void afficheContact() {
		ArrayList<String> nomContact = new ArrayList();
		for (int i = 0; i < listeContacts.size(); i++) {
			nomContact.add((listeContacts.get(i).getNom().nom + " " + listeContacts.get(i).getNom().prenom));
		}
		Collections.sort(nomContact);
		JOptionPane.showMessageDialog(null, nomContact);

	}

	void afficheContact(String name) {
		for (int i = 0; i < listeContacts.size(); i++) {
			if (name.matches(listeContacts.get(i).getNom().nom)) {
				listeContacts.get(i).afficherInfo();
				;
			}
		}
	}

	void chercherContact(String t) {
		ArrayList<String> nomContact = new ArrayList();
		// ArrayList<String> id = new ArrayList();
		for (int i = 0; i < listeContacts.size(); i++) {
			if (t.matches((listeContacts.get(i).getNom().nom).substring(0, 1))) {
				nomContact.add((listeContacts.get(i).getNom().nom + " " + listeContacts.get(i).getNom().prenom));
				// id.add(i+"");
			}

		}
		Collections.sort(nomContact);
		JOptionPane.showMessageDialog(null, nomContact);

	}

	void chercherContact(String t, String grp) {
		ArrayList<String> nomContact = new ArrayList();
		// ArrayList<String> id = new ArrayList();
		for (int i = 0; i < listeContacts.size(); i++) {
			if ((t.matches((listeContacts.get(i).getNom().nom).substring(0, 1)))
					&& (grp.matches(listeContacts.get(i).getGroupe()))) {
				nomContact.add((listeContacts.get(i).getNom().nom + " " + listeContacts.get(i).getNom().prenom));
				// id.add(i+"");
			}

		}
		Collections.sort(nomContact);
		JOptionPane.showMessageDialog(null, nomContact);

	}
}
