
package persons;

import java.util.Calendar;
import org.junit.Before;
import people.SimplePerson;

/**
 *
 * @author Ophélie EOUZAN
 */
public class TestSimplePerson extends TestPerson {

    @Before
    @Override
    public void setUp() {
        born = new SimplePerson("EOUZAN", "Ophélie", 1995, 12, 11);
        notBorn = new SimplePerson("PIERRE", "Mélanie", 2025, 07, 03);
        bornSameDay = new SimplePerson("PIERRE", "Tomate", 2017, 04, 20);
    }
}
