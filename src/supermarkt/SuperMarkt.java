/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarkt;

import java.util.ArrayList;
import java.util.List;

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
        
//        // Now get the artikels from the db
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        // Create a transaction
//        Transaction tx = session.beginTransaction();
//        
//        // Create a query from the artikel class
//        Query query = session.createQuery("from Artikel");
//        List<Artikel> artikelList = query.list();
//        
//        
//        System.out.println(artikelList.size() + " artikelen gevonden");
//        for(Artikel item : artikelList)
//        {
//            System.out.println("|" +item.getId() +"|"+ item.getNaam() +"|"+ item.getPrijs() +"|");
//        }
//        
//       
//        
//        // Testing the database class
//        DataBase data = new DataBase();
//        List<Artikel> artikelLijst = data.getArtikelen();
//        
//        System.out.println(artikelLijst.size() + " artikelen gevonden");
//        for(Artikel item : artikelLijst)
//        {
//            System.out.println("|" +item.getId() +"|"+ item.getNaam() +"|"+ item.getPrijs() +"|");
//        }
//        
//        
//        // Haal de tomaat artikel uit de database
//        Artikel tomaat = data.getArtikel(1);
//        
//        // Controleer of het is gelukt
//        if(tomaat != null)
//            System.out.println("Naam:"+tomaat.getNaam() + " Prijs:"+tomaat.getPrijs());
        
        /*
         * 
         * 
         * Testen van de winkel
         * 
         */
        // Maak nieuwe pad aan 
        Pad pad = new Pad("Zuivel Pad");
        // Voeg pad aan de lijst toe
        List<Pad> paden = new ArrayList<Pad>();
        paden.add(pad);
        paden.add(new Pad("Poep Pad"));
        paden.add(new Pad("Media Pad"));
        
        
        
        // Open een afdeling en voeg de paden er aan toe
        Afdeling afdeling = new Afdeling(paden,"Zuivel Afdeling",10);
        afdeling.kassa.setKassaPersoneel(afdeling.personelen.get(1));
        
        System.out.println("Aantal paden:"+afdeling.paden.size());
        
        System.out.println("Aantal personeelsleden:" + afdeling.personelen.get(1).getNaam());
        
        
        List<Klant> klantenLijst = new ArrayList<Klant>();
        
        Simulatie simulatie = new Simulatie(afdeling, klantenLijst);
        simulatie.startSimulatie();
        
    }
}
