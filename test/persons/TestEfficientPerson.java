
package persons;

import org.junit.Before;
import people.EfficientPerson;

/**
 *
 * @author Ophélie EOUZAN
 * 
 * 1 test failed :
 * - testGetAgeNotBorn : Get born return negative age instead of throwing exception, when people is not born.
 */
public class TestEfficientPerson extends TestPerson {    
    @Before
    @Override
    public void setUp() {
        born = new EfficientPerson("EOUZAN", "Ophélie", 21);
        notBorn = new EfficientPerson("PIERRE", "Mélanie", -1);
        bornSameDay = new EfficientPerson("PIERRE", "Tomate", 0);
    }
}
