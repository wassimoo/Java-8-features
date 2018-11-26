package com.wassimbougarfa.lambdaexpressions;

import com.wassimbougarfa.customers.*;
import com.wassimbougarfa.lambdaexpressions.functionnalinterfaces.*;

import java.io.IOException;
import java.util.function.Function;

/**
 * SingleExpressionLambda
 */
public class SingleExpressionLambda {

    /**
     * 1-
     *  Affiche Un simple message hello world.
     *  On utilise pour cela l'interface fonctionnelle 'Runnable'
     */
    public static void helloWorld(){
        Runnable r = () -> System.out.println("Hello World");
        r.run();
    }

    /**
     * 2- 
     *  Saluer un personne avec son prenom,
     *  On utilise alors l'inteface fonctionnelle qu'on a developé `HelloInterface`
     *  
     */
    public static void parametredHelloWorld(String prenom){
        HelloInterface hi = (x) -> System.out.println("Bonjour " + x);
        hi.sayHello(prenom);
    }


    /**
     * 3-
     *  Récupperer la liste des clients "Nom Prénom",
     *  En utilisant l'interface fonctionnelle prédifini `Function` et sa methode `.apply()`
     */
    public static void getCostumersFullName(){
        Customers customers = new Customers();
        try{
            customers.load(); //Charger la liste des client de la fichier CSV
        }catch(IOException e){
            System.err.println("Impossible de charger le fichier.");
        }

        Function<Customer, String> nameFunc = (Customer c) -> c.firstName;
        Function<Customer, String> lastNameFunc = (Customer c) -> c.lastName;

        for(Customer c : customers.getAll()){
            System.out.println(nameFunc.apply(c) + " " + lastNameFunc.apply(c));
        }
    }

}