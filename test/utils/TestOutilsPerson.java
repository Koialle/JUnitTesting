
package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import junitx.framework.ListAssert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import persons.IPerson;
import persons.Person;

/**
 *
 * @author Ophélie EOUZAN
 */
public class TestOutilsPerson {

    protected List<IPerson> people = new ArrayList();
    protected List<IPerson> doublons = new ArrayList();
    protected GregorianCalendar date = new GregorianCalendar(2017, Calendar.APRIL, 20);
    
    protected IPerson person1, person2, person3, person4, person5, person6, person7;// = Mockito.mock(Person.class);
    
    @Before
    public void setUp() {
//
        person1 = Mockito.mock(Person.class);
        person2 = Mockito.mock(Person.class);
        person3 = Mockito.mock(Person.class);
        person4 = Mockito.mock(Person.class);
        person5 = Mockito.mock(Person.class);
        person6 = Mockito.mock(Person.class);
        person7 = Mockito.mock(Person.class);

        Mockito.when(person1.getAge(date)).thenReturn(0);
        Mockito.when(person2.getAge(date)).thenReturn(1);
        Mockito.when(person3.getAge(date)).thenReturn(2);
        Mockito.when(person4.getAge(date)).thenReturn(3);
        Mockito.when(person5.getAge(date)).thenReturn(4);
        Mockito.when(person6.getAge(date)).thenReturn(5);
        Mockito.when(person7.getAge(date)).thenReturn(6);

        people = Arrays.asList(person2, person3, person4, person5, person6, person7);
        doublons = Arrays.asList(person1, person2, person3, person4, person5, person6, person7, person1, person7);
    }
    
    @Test
    public void testGetPersonsInRangeAge()
    {
        List<IPerson> liste1 = OutilsPerson.getPersonsInRangeAge(doublons, date, 2, 6);
        List<IPerson> liste2 = OutilsPerson.getPersonsInRangeAge(doublons, date, 0, 1);
        
        assertEquals(6, liste1.size());
        assertEquals(3, liste2.size());
        
        ListAssert.assertContains(liste1, person7);
        ListAssert.assertContains(liste2, person1);
    }
    
    @Test
    public void testGetOlder()
    {
        assertEquals(6, OutilsPerson.getOldest(people, date));
        assertEquals(6, OutilsPerson.getOldest(doublons, date));
        
        for (IPerson person : people) {
            Mockito.verify(person, Mockito.atLeastOnce()).getAge(date);
            Mockito.verify(person, Mockito.never()).getFirstName();
            Mockito.verify(person, Mockito.never()).getName();
        }
    }
}
