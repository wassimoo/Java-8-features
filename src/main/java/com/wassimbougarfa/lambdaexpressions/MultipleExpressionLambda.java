package com.wassimbougarfa.lambdaexpressions;

import java.util.Date;
import java.util.function.Predicate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.IOException;

import com.wassimbougarfa.customers.*;

/**
 * MultipleExpressionLambda
 */
public class MultipleExpressionLambda {

    /**
     * 1- Affiche un message personnalisé selon l'heure. C'est un example simple de
     * l'utilisation d'une lambda à expressions multiples.
     */
    public static void helloWorldTime() {
        Runnable r = () -> {
            Date date = new Date();
            DateFormat dateFormat = new SimpleDateFormat("HH");
            int currentHour = Integer.parseInt(dateFormat.format(date));
            String saluate = (currentHour >= 6 && currentHour <= 12) ? "Good Morning" : "Good evening";
            System.out.println(saluate);
        };
        r.run();
    }

    /**
     * 2- Chercher un client en utilisant son nom et prénom, pour cela on a utilisé
     * l'interface fonctionnelle `Predicate`, Il a utilisé pour executer une
     * evaluation d'expression booléene. avec sa methode `.test()`
     */
    public static void isCostumer(String name, String lastName) {
        Customers customers = new Customers();
        try {
            customers.load(); // Charger la liste des client de la fichier CSV
        } catch (IOException e) {
            System.err.println("Impossible de charger le fichier.");
        }

        Predicate<Customer> predicate = (Customer c) -> {
            return c.firstName.equals(name) && c.lastName.equals(lastName);
        };

        for (Customer c : customers.getAll()) {
            if (predicate.test(c)) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("Aucun client trouvé.");
    }
}