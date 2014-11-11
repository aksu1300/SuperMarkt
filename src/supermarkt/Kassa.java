package supermarkt;

import java.util.List;

public class Kassa {
    
        // Elke kassa heeft een personeel er achter staan
        public Personeel kassaPersoneel = new Personeel();
        
        
        // De default constructor van de kassa wil graag weten 
        // welke personeel er achter de kassa komt te staan
        // wanneer deze open gaat
        public Kassa(Personeel personeel){
            // Initialiseer de kassa
            this.kassaPersoneel = personeel;
        }
        
        // Zet een personeel achter de kassa
        public void setKassaPersoneel(Personeel personeel){
            this.kassaPersoneel = personeel;
        }
        
        // Klant kan artikelen afrekenen bij een kassa
        //
        public float afrekenen(List<Artikel> artikelen){
            System.out.println("Aan het afrekenen bij de kassa");
            
            // De totale prijs
            float totaal = 0;
            
            // Loop door alle artikelen van een klant
            for(Artikel item : artikelen)
            {
                // Laat de artikelen op de bon zien
                System.out.println(item.getNaam() + "   " + item.getPrijs());
                // Voeg de prijs aan de totale prijs toe
                totaal += item.getPrijs();
            }
            
            // Laat de bon aan klant zien 
            System.out.println("Totaal afrekenen:" + totaal);
            
            // Geef het totale prijs terug
            return totaal;
        }
        
       

}
