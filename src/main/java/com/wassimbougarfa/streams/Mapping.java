package com.wassimbougarfa.streams;

import com.wassimbougarfa.customers.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Mapping
 */
public class Mapping {

    /**
     * Le but est claire, Construire une Liste qui contient tous les email des clients,
     * Est c'est exactement le travaille de la methode map,
     * elle nous permet de récupérer que ce qui nous intéresse.
     */
    public static List<String> getEmails(Customers customers) {
        return customers.getAll()
                .stream()
                .map(c -> c.email)
                .collect(Collectors.toList());
    }
}