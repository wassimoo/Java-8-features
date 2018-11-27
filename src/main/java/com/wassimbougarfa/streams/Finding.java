package com.wassimbougarfa.streams;


import com.wassimbougarfa.customers.*;

import java.util.Comparator;

/**
 * Filtering
 */
public class Finding {

    /**
     * 1- Chercher le client avec le meilleur chiffre d'achats,
     * On utilise alors la methode de tri .sorted() et on le passe comme parametre
     * le comparateur a l'ordre inverse.
     * à la fin de pipline on extraire le premier client avec .findfirst()
     */
    public static void showFavoriteCustomer(Customers customers) {
        System.out.println(
                customers.getAll()
                        .stream()
                        .sorted(Comparator.comparing(Customer::getTotalPurshased).reversed())
                        .findFirst()
        );
    }

    /**
     * 2- Chercher un client du 'Tunis',
     * pour cela on applique un filtrage sur le stream,
     * à but de trouver un client qui correspond à nos critéres retourné par
     * findAny().
     */
    public static void anyoneFromTunis(Customers customers) {
        System.out.println(customers.getAll().stream()
                .filter(c -> c.city.toLowerCase().equals("tunis"))
                .findAny()
         );
    }
}