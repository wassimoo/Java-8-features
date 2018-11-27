package com.wassimbougarfa.streams;

import com.wassimbougarfa.customers.Customer;
import com.wassimbougarfa.customers.Customers;

/**
 * Reducing
 */
public class Reducing {

    /**
     *
     * Pour retourner le totale de revenue,
     * il suffit d'appeler la methode .reduce(),
     * Avec le reference pour methode 'getTotalPurshased'
     * pour chaque client, et ut utiliser le lambda pour calculer la somme.
     *
     */
    public static float getTotalIncome(Customers customers){
        return customers.getAll()
                .stream()
                .filter(c -> c.getTotalPurshased() != 0)
                .map(Customer::getTotalPurshased)
                .reduce((float) 0 , (x, y) -> x + y);
    }
}