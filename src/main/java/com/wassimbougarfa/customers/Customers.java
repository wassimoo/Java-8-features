package com.wassimbougarfa.customers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/**
 * Customers
 */
public class Customers {
    
    final static String customerCSV = "../../data/customers.csv";
    public ArrayList<Customer> customers;

    public void load() throws IOException {
        URL url = new URL("https://raw.githubusercontent.com/wassimoo/Java-8-features-demonstration---keyrus/master/data/customers.csv?token=AMYQozgIKK5hk-JP4-xpgP1yb_-HPPurks5cBaYswA%3D%3D");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        customers = new ArrayList<>();
        String line;
        
        while ((line = br.readLine()) != null) {
            try {
                customers.add(new Customer(line.split(",")));
            }catch (NumberFormatException e){
                System.err.println("Impossible de charger la ligne, les données sont mal formatées:\n" + line);

            } 
            catch (Exception e) {
                System.err.println("Impossible de charger la ligne :\n" + line);
            }
        }
    }
}