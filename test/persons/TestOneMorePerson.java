
package persons;

import java.util.Calendar;
import org.junit.Before;
import people.OneMorePerson;

/**
 *
 * @author Ophélie EOUZAN
 * 
 * 4 tests failed :
 * - An unborn people has also 0 year, but it should throw an exception instead.
 */
public class TestOneMorePerson extends TestPerson {
    
    @Before
    @Override
    public void setUp() {
        born = new OneMorePerson("EOUZAN", "Ophélie", 1995, 12, 11);
        notBorn = new OneMorePerson("PIERRE", "Mélanie", 2025, 07, 03);
        bornSameDay = new OneMorePerson("PIERRE", "Tomate", 2017, 04, 20);
//        bornSameDay = new OneMorePerson("PIERRE", "Tomate", date.get(Calendar.YEAR), date.get(Calendar.MONTH), date.get(Calendar.DAY_OF_MONTH));
    }
}
