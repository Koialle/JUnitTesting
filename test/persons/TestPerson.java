
package persons;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ophélie EOUZAN
 */
public class TestPerson {

    protected IPerson born;
    protected IPerson notBorn;
    protected IPerson bornSameDay;
    protected GregorianCalendar date = new GregorianCalendar(2017, Calendar.APRIL, 20);
    protected GregorianCalendar veille = new GregorianCalendar(2017, Calendar.APRIL, 19);
    
    @Before
    public void setUp() {
        born = new Person("EOUZAN", "Ophélie", 1995, 12, 11);
        notBorn = new Person("PIERRE", "Mélanie", 2025, 07, 03);
        bornSameDay = new Person("PIERRE", "Tomate", date);
    }

    @Test
    public void testWasBorn() {
        assertTrue(born.wasBorn(date));
        assertFalse(notBorn.wasBorn(date));
        assertTrue(bornSameDay.wasBorn(date));
        assertFalse(bornSameDay.wasBorn(veille));
    }
    
    @Test
    public void testGetAgeBorn() {
        assertEquals(21, born.getAge(date));
    }
    
    @Test(expected = IllegalArgumentException .class)
    public void testGetAgeNotBorn() {
        notBorn.getAge(date);
    }

    @Test
    public void testGetAgeBornSameDay() {
        assertEquals(0, bornSameDay.getAge(date));
    }
}
