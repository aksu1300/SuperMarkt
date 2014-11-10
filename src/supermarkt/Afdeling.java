package supermarkt;

import java.util.ArrayList;
import java.util.List;

public class Afdeling {
    
        String afdelingNaam;
       
        // Een afdeling heeft een of meerdere paden
        public List<Pad> paden = new ArrayList<Pad>();
     
        
        // Elke afdeling heeft een kassa om het wat simpeler te houden
        public Kassa kassa;
       
        
        // De default constructor van een afdeling wil graag weten uit
        // Hoeveel paden deze afdeling bestaat
        public Afdeling(List<Pad> paden, String AfdelingNaam, Kassa kassa ){
            // Zet de initiale waarden van de afdeling en open de aantal paden
            // en de geef de afdeling een naam
            // een zet er een kassa neer
            this.paden = paden;
            this.afdelingNaam = AfdelingNaam;
            this.kassa = kassa;
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
