package supermarkt;

import java.util.ArrayList;
import java.util.List;

public class Pad {
        
        // Each pad has a name 
        String padNaam;
        
        // Maak een verbinding met de database
        DataBase db = new DataBase();
    
        
        // Elke pad heeft een of meerdere artikelen
        public List<Artikel> artikelen = new ArrayList<>();
        
        
        // Default constructor om de artikelen te initialiseren
        // Haal de Artikelen uit de database en zorg dat elke pad zijn 
        // eigen producten kent
        // Ook wordt hier de naam van een pad verwacht
        public Pad(String padNaam)
        {
            // Geef de pad een padnaam
            this.padNaam = padNaam;
            
            // Wanneer er een pad wordt gemaakt moeten de 
            // Artikelen hier in staan
            this.artikelen = db.getArtikelen();
        }
        
        
        // Geef the aantal artikelen per pad weer
        //
        public void showArtikelen(){
            // Print alle artikelen voor een klant
            for(Artikel item : artikelen)
            {
                System.out.println("Product:" + item.getNaam() + " voor : " + item.getPrijs());
            }
        }

        // Haal the pad naam op
        public String getPadNaam(){
            return padNaam;
        }
        
        // Geef de pad een naam
        public void setPadNaam(String naam){
            padNaam = naam;
        }

}
