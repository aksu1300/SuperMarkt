/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarkt;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author account
 */
public class SuperMarkt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.printf("Welkom to Aldi\n");
        
        // Nieuw artikel 
        Artikel tomaat = new Artikel();
        tomaat.setNaam("Tomaat");
        tomaat.setPrijs(0.13f);
        
        // Create a new session
        Session session = HibernateUtil.getSessionFactory().openSession();
        // Create a transaction
        Transaction tx = session.beginTransaction();
        
        // Save the nieuwe artikel
        session.save(tomaat);
        
        // Commit the db changes
        tx.commit();;
        
        System.out.println("We hebben een nieuwe artikel toegevoegd");
        
        
    }
}
