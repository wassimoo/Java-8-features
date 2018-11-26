package com.wassimbougarfa.lambdaexpressions;

import com.wassimbougarfa.lambdaexpressions.functionnalinterfaces.*;

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

    
}