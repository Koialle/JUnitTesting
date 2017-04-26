
package persons;

import java.util.GregorianCalendar;
import people.Personne;

/**
 *
 * @author Ophélie EOUZAN
 */
public class AdapterPersonne extends Personne implements IPerson {

    public AdapterPersonne(String nom, String prenom, int annee, int mois, int jour) {
        super(nom, prenom, annee, mois, jour);
    }

    @Override
    public boolean wasBorn(GregorianCalendar gc) {
        int compareTo = this.dateNaissance.compareTo(gc);
        return compareTo <= 0;
    }
}
