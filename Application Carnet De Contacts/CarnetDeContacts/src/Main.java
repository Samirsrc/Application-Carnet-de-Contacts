import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Contact c = new Contact();
		c.ajoutContact("inconito", "inconito", 000000000, "inconito");
		c.ajoutContact("Sam", "Lol", 0551406375, "amis");
		c.ajoutContact("Mah", "Lel", 044476545, "amis");
		c.ajoutContact("Adel", "Bela", 0777777, "amis");
		c.ajoutContact("Mokhtar", "Thanos", 05455144, "famille");
		c.ajoutContact("Super", "Man", 054555611, "famille");
		c.ajoutContact("Crisiano", "Ronaldo", 011111111, "famille");
		c.ajoutContact("Mohamed", "Alibaba", 05555511, "collegues");
		c.ajoutContact("Lawni", "Lafouine", 022222211, "collegues");
		c.ajoutContact("Faycel", "Khalfi", 0111111111, "collegues");
		c.ajoutContact("Samir", "Belaroui", 0551406375, "favoris");
		c.ajoutContact("Mahi", "Belmadani", 044476545, "favoris");
		c.ajoutContact("Adel", "Belahouel", 0777777, "favoris");

		int boucle = 5;
		while (boucle == 5) {
			int r = Integer.parseInt(JOptionPane.showInputDialog(
					"Bienvenue dans votre Carnet de Contacts, Que voulez-vous faire ? \n [1] pour ajouter un contact \n [2] pour supprimer un contact \n [3] pour modifier un contact sachant sa position \n [4] pour modifier un contact sachant son nom de famille \n [5] pour afficher votre liste de contact \n [6] pour afficher un contact en introduisant son nom \n [7] pour afficher votre groupe : amis \n [8] pour afficher votre liste groupe : famille \n [9] pour afficher votre groupe : collegues de travaille \n [10] pour afficher votre groupe : favoris \n [11] pour rechercher un contact par la première lettre de son nom \n [12] pour rechercher un contact par la première lettre de son nom et son groupe \n [13] pour quitter !"));
			switch (r) {
			case 1:
				c.ajoutContact();
				break;
			case 2:
				c.suppContact(
						Integer.parseInt(JOptionPane.showInputDialog("Quel est la position du contact à supprimer ?")));
				break;
			case 3:
				c.modifierContact(
						Integer.parseInt(JOptionPane.showInputDialog("Quel est la position du contact à modifier ?")));
				break;
			case 4:
				c.modifierContact(JOptionPane.showInputDialog("Quel est le nom de famille du contact à modifier ?"));
				break;
			case 5:
				c.afficheContact();
				break;
			case 6:
				c.afficheContact(JOptionPane.showInputDialog("Quel est le nom de famille du contact à afficher ?"));
				break;
			case 7:
				c.mesAmis();
				break;
			case 8:
				c.maFamille();
				break;
			case 9:
				c.colleguesTravail();
				break;
			case 10:
				c.mesFavoris();
				break;
			case 11:
				c.chercherContact(JOptionPane.showInputDialog("Donnez la premiere lettre du nom de famille :"));
				break;
			case 12:
				c.chercherContact(JOptionPane.showInputDialog("Donnez la premiere lettre du nom de famille :"),
						JOptionPane.showInputDialog("Donnez son groupe :"));
				break;
			case 13:
				JOptionPane.showMessageDialog(null, "Au revoir !");
				System.exit(0);
				break;

			}
		}

		// c.afficheContact();
		// c.chercherContact("L","amis");
		// c.colleguesTravail();
		// c.modifierContact("Lol");
		// c.afficheContact("Lol");
	}

}
