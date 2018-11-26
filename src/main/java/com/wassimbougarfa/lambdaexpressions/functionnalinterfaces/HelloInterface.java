package com.wassimbougarfa.lambdaexpressions.functionnalinterfaces;

@FunctionalInterface
public interface HelloInterface {

    /**
     * Cette methode sera utilisé par une expression lambda,
     * pour saluer le personne avec son nom
     * @param prenom
     */
    public void sayHello(String prenom);
}