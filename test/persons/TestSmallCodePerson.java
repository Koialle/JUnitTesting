
package persons;

import org.junit.Before;
import people.SmallCodePerson;

/**
 *
 * @author Epulapp
 */
public class TestSmallCodePerson extends TestPerson {
    @Before
    @Override
    public void setUp() {
        born = new SmallCodePerson("EOUZAN", "Ophélie", 1995, 12, 11);
        notBorn = new SmallCodePerson("PIERRE", "Mélanie", 2025, 07, 03);
        bornSameDay = new SmallCodePerson("PIERRE", "Tomate", 2017, 04, 20);
    }
}
