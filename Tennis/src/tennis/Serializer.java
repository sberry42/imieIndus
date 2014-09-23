package Tennis;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializer implements ISerializer {
	/* (non-Javadoc)
	 * @see org.imie.testTDDTennis.ISerialiser#persist(org.imie.testTDDTennis.Jeux)
	 */
	@Override
	public void persist(Jeu jeux)  {
		ObjectOutputStream oos = null;
		FileOutputStream fichier;
		try {
			fichier = new FileOutputStream("jeux.ser");
			oos = new ObjectOutputStream(fichier);
			oos.writeObject(jeux);
			oos.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

	/* (non-Javadoc)
	 * @see org.imie.testTDDTennis.ISerialiser#read()
	 */
	@Override
	public Jeu read()  {
		ObjectInputStream ois = null;
		FileInputStream fichier;
		Jeu retour;
		try {
			fichier = new FileInputStream("jeux.ser");
			ois = new ObjectInputStream(fichier);
			retour = (Jeu) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		return retour;
	}
}
