package com.wassimbougarfa.streams;

import com.wassimbougarfa.customers.*;

/**
 * Matching
 */
public class Matching {

    /**
     * 1- Verifier que tous les clients on commandé au moins une fois,
     * Pour cela on utilise  la methode .allMatch(),
     * que retourne true si le Predicat est valide pour
     * tous les elements de stream.
     */
    public static boolean areAllCustomers(Customers customers) {

        return customers.getAll()
                .stream()
                .allMatch(c -> c.getTotalOrders() > 0);
    }

    /**
     * 2- Utilisé pour verifier si il y a un client d'une ville spécifique,
     * Pour cela on utilise la methode .anyMatch(),
     * que retourne true si le Predicat est valide au moins 
     * pour un seul element de Stream.
     */
    public static boolean existCustomersFrom(Customers customers, String city) {

        return customers.getAll()
                .stream()
                .anyMatch(c -> c.city.equals(city));
    }


    /** 3- On peut utiliser aussi la methode noneMatch... ***/
}