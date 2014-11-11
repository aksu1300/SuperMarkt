package supermarkt;

import java.util.ArrayList;
import java.util.List;

public class Afdeling {
        
        // De afdeling naam 
        String afdelingNaam;
       
        // Een afdeling heeft een of meerdere paden
        public List<Pad> paden = new ArrayList<Pad>();
        // Een afdeling heeft een of meerder personeelsleden
        public List<Personeel> personelen = new ArrayList<Personeel>();
        
        // Elke afdeling heeft een kassa om het wat simpeler te houden
        public Kassa kassa;
        
        // De default constructor van een afdeling wil graag weten uit
        // Hoeveel paden deze afdeling bestaat
        public Afdeling(List<Pad> paden, String AfdelingNaam, int aantalPersonelen){
            // Zet de initiale waarden van de afdeling en open de aantal paden
            // en de geef de afdeling een naam
            // een zet er een kassa neer
            this.paden = paden;
            this.afdelingNaam = AfdelingNaam;
            
            // Voeg de aantal personeelsleden toe 
            for(int i = 0; i < aantalPersonelen; i++){
                // Maak nieuw personeel aan en voeg deze toe aan de personeelslijst
                Personeel personeel = new Personeel();
                personeel.setNaam("personeel-"+i);
                personeel.setPersoneelsNummer(i);
                
                // Voeg toe aan de lijst
                personelen.add(personeel);
            }
            
            // Zet nu ook een van de personeel achter de kassa
            this.kassa = new Kassa(personelen.get(0));
        }
        
        // Set de afdelingnaam
        public void setAfdelingNaam(String afdelingNaam){
            this.afdelingNaam = afdelingNaam;
        }
        
        // Geef de afdelingnaam terug
        public String getAfdelingNaam(){
            return this.afdelingNaam;
        }
        
	public void afdelingKeuze() {
           
	}

}
