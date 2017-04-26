
package persons;

import java.util.GregorianCalendar;
import org.junit.Before;

/**
 * Class TestPersonne
 * @author Ophélie EOUZAN
 */
public class TestPersonne extends TestPerson {
    @Before
    @Override
    public void setUp() {
        born = new AdapterPersonne("EOUZAN", "Ophélie", 1995, 12, 11);
        notBorn = new AdapterPersonne("PIERRE", "Mélanie", 2025, 07, 03);
        bornSameDay = new AdapterPersonne("PIERRE", "Tomate", date.get(GregorianCalendar.YEAR), date.get(GregorianCalendar.MONTH), date.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
