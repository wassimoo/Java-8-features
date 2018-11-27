package com.wassimbougarfa.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.wassimbougarfa.customers.*;

/**
 * Filtering
 */
public class Filtering {

    /**
     * 1- Pour filtrer les données des nos clients, On utilise la methode
     * intérmediere .filter() pour exclure les faux clients, Et aprés on termine
     * avec la methode terminale .forEach avec un réference vers la methode println
     * pour l'affichage
     */
    public static void showRealCustomers(Customers customers) {

        customers.getAll()
                .stream()
                .filter(c -> c.getTotalPurshased() > 0)
                .forEach(System.out::println);
    }

    /**
     * 2 - Le même principle que showRealCustomers, mais on retourne une List finale
     * cette fois en utilisant les collecteurs .
     */
    public static List getRealCustomers(Customers customers) {

        return customers.getAll()
                .stream()
                .filter(c -> c.getTotalPurshased() > 0)
                .collect(Collectors.toList());
    }
}