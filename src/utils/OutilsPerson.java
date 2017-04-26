
package utils;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import persons.IPerson;

/**
 *
 * @author Ophélie EOUZAN
 */
public final class OutilsPerson
{
    /**
     * Retourne la liste des personnes dont l'âge à la date indiquée est inclus entre ageMin et ageMax.
     * @param persons Liste des personnes étudiées
     * @param date Date de référence pour getAge
     * @param ageMin Age minimum pris en compte
     * @param ageMax Age maximum pris en compte
     * @return Liste de personnes
     */
    public static List<IPerson> getPersonsInRangeAge(List<IPerson> persons,GregorianCalendar date, int ageMin, int ageMax)
    {
        if (ageMin >= ageMax) {
            throw new IllegalArgumentException("Threw an IllegalArgumentException");
        }
       
        List<IPerson> personsInRange = new ArrayList<>();
       
        for (IPerson i : persons) {
            if (ageMin <= i.getAge(date) && i.getAge(date) <= ageMax) {
                personsInRange.add(i);
            }
        }

        return personsInRange;
    }
    
    /**
     * Retourne l'âge du plus vieux dans la liste à la date indiquée
     * @param persons Liste des personnes à comparer
     * @param date Date de référence pour getAge
     * @return L'âge du plus vieux
     */
    public static int getOldest(List<IPerson> persons, GregorianCalendar date)
    {
        if (persons.isEmpty()) {
           return -1;
        }
        
        int oldest = 0;
        for (IPerson i : persons){
            if (i.getAge(date) > oldest) {
                oldest = i.getAge(date);
            }
        }

        return oldest;
    }
}