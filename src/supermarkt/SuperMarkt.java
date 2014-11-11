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
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.printf("Welkom to Aldi\n");

        // Maak nieuwe pad aan 
        Pad pad = new Pad("Zuivel Pad");
        // Voeg pad aan de lijst toe
        List<Pad> paden = new ArrayList<Pad>();
        paden.add(pad);
        paden.add(new Pad("Poep Pad"));
        paden.add(new Pad("Media Pad"));
        paden.add(new Pad("Drinken Pad"));
        
        
        
        // Open een afdeling en voeg de paden er aan toe en doe 10 personelen erbij
        Afdeling afdeling = new Afdeling(paden,"Zuivel Afdeling",10);
        afdeling.kassa.setKassaPersoneel(afdeling.personelen.get(1));
        
        System.out.println("Aantal paden:"+afdeling.paden.size());
        
        System.out.println("Aantal personeelsleden:" + afdeling.personelen.get(1).getNaam());
        
        
        // De simulatie wil een afdeling de simulatie zorgt zelf voor random 
        // Klanten die random actie ondernemen
       Simulatie simulatie = new Simulatie(afdeling,10000,100000);
       simulatie.startSimulatie();
       
       // Aantal verwerkte klanten in de simulatie weergeven
       System.out.println("Aantal klanten verwerkt:"+simulatie.aantalKlanten);
       System.out.println("Moeder:"+simulatie.aantalMoeders);
       System.out.println("Mannen:"+simulatie.aantalMannen);
       System.out.println("Ouderen:"+simulatie.aantalOuderen);
       
       // Totaal verlopen tijd in miliseconden laten zien
       System.out.println("Simulatie tijd:"+simulatie.eindTijd + " milisecoden");
       

    }
}
