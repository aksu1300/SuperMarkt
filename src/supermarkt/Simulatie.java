/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarkt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * @author account
 */
public class Simulatie {
    
    // Start en Eind tijd in nano tijd voor echt tijd
    long startTijd;
    long eindTijd;
    
    // init de aantal mogelijke klanten
    int minKlanten = 1;
    int maxKlanten = 10;
    
    // Onze simulatie heeft een afdeling 
    public Afdeling afdeling;
    // En meerdere klanten
    public List<Klant> klanten = new ArrayList<Klant>();
    

    
    // Default simulatie constructor to init the simulation
    public Simulatie(Afdeling afdeling, List<Klant> klanten){
        this.afdeling = afdeling;
        this.klanten = klanten;
    }
    
    public Simulatie(Afdeling afdeling, int minKlanten, int maxKlanten){
        
    }
    
    // Start simulatie
    public void startSimulatie(){
        // initialiseer de start tijd
        this.startTijd = System.nanoTime();
        
        // Maak een random getal aan die tussen de minimum en maximum 
        // aantal klanten ligt
        Random random = new Random();
        int randAantalKlanten = random.nextInt(maxKlanten - minKlanten ) + minKlanten;
        
        System.out.println("[*]Er komen " + randAantalKlanten + " klanten in de supermarkt\n\n");
        
        // Creer de aantal klanten aan de hand van de random cijfer
        for(int i = 0; i < randAantalKlanten; i++){
            Klant klant = new Klant();
            
            // Maak nog een nieuw random getal aan om een aantal vershillende
            // Klanten toe te voegen tussen 3 en 1
            // random.setSeed(new Date().getTime());
            int randTypeKlanten = random.nextInt(4 - 1) + 1;
                      
            switch(randTypeKlanten){
                case 1:
                    klant = new Man();
                    System.out.println("randTypeKlanten:" + randTypeKlanten + " Voeg een man toe");
                    break;
                case 2:
                    klant = new Moeder();
                    System.out.println("randTypeKlanten:" + randTypeKlanten + " Voeg een Moeder toe");
                    break;
                case 3:
                    klant = new Ouder();
                    System.out.println("randTypeKlanten:" + randTypeKlanten + " Voeg een Ouder toe");
                    break;
                default :
                    klant = new Klant();
                    System.out.println("randTypeKlanten:" + randTypeKlanten + " Voeg een Standaart Klant toe");
                    break;
            }
            
            // Voeg de klanten toe aan de klanten lijst
            this.klanten.add(klant);
        }
        
        System.out.println("########################################");
        
        // Creer voor elke klant een random pad die hij moet lopen uit
        // de afdelings paden
        for(int i = 0; i < this.klanten.size(); i++){
            // Creer voor elke klant een random pad cijfer
            int padMax = afdeling.paden.size();
            int padMin =0;
            
            int randPad = random.nextInt(padMax - padMin) + padMin;
            System.out.println("randPad:"+randPad);
            // Laat alle klanten nu een random pad lopen aan de hand van een random getal 
            // die we net hebben gecreerd aan de hand van de aantal bestaande paden
            // van een afdeling
            this.klanten.get(i).loopPad(this.afdeling.paden.get(randPad));
            
            
            // We willen nu dat een klant ook iets uit de schappen haalt
            // en deze ook in zijn mandje doet, dit wordt weer op de zelfde
            // manier gedaan door een random getal te creeren van de aantal 
            // bestaande artikelen uit de database
            
            // een klant kan max 25 dingen kopen
            int maxAantalSelectie = 25;
            int minAantalSelectie = 1;
            int randAantalSelectie = random.nextInt(maxAantalSelectie - minAantalSelectie) + minAantalSelectie;
            
            
            int artikelMax = this.afdeling.paden.get(randPad).artikelen.size();
            int artikelMin = 0;
            int randArtikel = random.nextInt(artikelMax - artikelMin) + artikelMin;

            System.out.println("Aantal artikelen op deze pad:" + artikelMax);

            // Laat zien welke artikelen er zijn op deze pad
            this.afdeling.paden.get(randPad).showArtikelen();
            
            
            // Selecteer aan de hand van rand getal tussen 1 en 25 de aantal artikelen
            for(int j = 0; j < randAantalSelectie; j++){
                // Creer steeds een nieuwe random cijfer
                 randArtikel = random.nextInt(artikelMax - artikelMin) + artikelMin;
                 
                // Laat klant nu ook iets in zijn mandje doen
                this.klanten.get(i).mandjeVullen(this.afdeling.paden.get(randPad).artikelen.get(randArtikel));
            }
            
            // laat per klant zijn winkelmandje zien
            this.klanten.get(i).showMandje();

            // Witte lij we gaan nu afreken
            System.out.println("\n\n");
              
            // Laat nu per klant de producten afrekenen
            this.klanten.get(i).afrekenenArtikel(this.afdeling.kassa);
            
            // Extra witte lijn
            System.out.println("\n\n");
        }
        
                
        // Sla de eind tijd van de simulatie op 
        this.eindTijd = (System.nanoTime() - this.startTijd) / 1000000;
        
    }
    
}
