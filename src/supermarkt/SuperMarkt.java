/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarkt;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author account
 */
public class SuperMarkt {
    

        // Methode om een nieuwe kassa te openenen
    	public int openKassa() {
		return 0;
	}
        
	public double afrekenenArtikel() {
		return 0;
	}

	public int boodschappenVoltooid() {
		return 0;
	}

	public void vakkenVullen() {

	}
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.printf("Welkom to Aldi\n");
        
//        // Nieuw artikel 
//        Artikel tomaat = new Artikel();
//        tomaat.setNaam("kaas");
//        tomaat.setPrijs(1.13f);
//
//        // Create a new session
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        // Create a transaction
//        Transaction tx = session.beginTransaction();
//
//        // Save the nieuwe artikel
//        session.save(tomaat);
//
//        // Commit the db changes
//        tx.commit();;
//        
//        System.out.println("We hebben een nieuwe artikel toegevoegd");
//        
        
        // Now get the artikels from the db
        Session session = HibernateUtil.getSessionFactory().openSession();
        // Create a transaction
        Transaction tx = session.beginTransaction();
        
        // Create a query from the artikel class
        Query query = session.createQuery("from Artikel");
        List<Artikel> artikelList = query.list();
        
        
        System.out.println(artikelList.size() + " artikelen gevonden");
        for(Artikel item : artikelList)
        {
            System.out.println("|" +item.getId() +"|"+ item.getNaam() +"|"+ item.getPrijs() +"|");
        }
        
    }
}
